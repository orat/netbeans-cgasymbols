package de.orat.math.cga.cgasymbols;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.JMenuItem;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.editor.EditorRegistry;
import org.openide.cookies.EditorCookie;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;
import org.openide.util.actions.Presenter;

@ActionID(
    category = "Edit",
    id = "de.orat.math.cga.cgasymbols.OuterProductSymbolAction"
)
@ActionRegistration(
    lazy = false,
    //iconBase = "de/orat/math/cga/cgasymbols/plus_sign.png",
    displayName = "#CTL_OuterProductSymbolAction"
)
// damit landet die action als symbol in der editor toolbar
//@ActionReference(path="Editors/Toolbars/Default", position = 1000)

// action ins Kontextmenu aufnehmen
//@ActionReference(path="Editors/Popup")


// make the action available as macro
// https://netbeans.apache.org/wiki/DevFaqAddMacroableAction.asciidoc
/*@NbBundle.Messages({ "CTL_MyAction=Let's go", "macro-name=Let's go" })
@EditorActionRegistration(
	name = "macro-name",
	mimeType = "text/x-java",
	menuPath = "Source", menuPosition = 0, menuText = "#CTL_MyAction")*/

@Messages("CTL_OuterProductSymbolAction=Outer product")
public final class AbstractCGASymbolAction extends AbstractAction implements Presenter.Popup {
 
    @StaticResource
    private static final String ICON = "de/orat/math/cga/cgasymbols/wedge.png"; 
    private static final long serialVersionUID = 1L;
    
    private final LookupListener lookupListener;
    private final Lookup.Result<EditorCookie> result;

    public AbstractCGASymbolAction() {
        
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon(ICON, false));
        putValue("iconBase", ICON);
       
        putValue(NAME, Bundle.CTL_OuterProductSymbolAction()); // name scheint nicht angezeigt zu 
        putValue(SHORT_DESCRIPTION, "Insert the wedge operator symbol");
        
        result = Utilities.actionsGlobalContext().lookupResult(EditorCookie.class);
        this.lookupListener = (LookupEvent ev) -> {
            EventQueue.invokeLater(() -> {
                setEnabled(!result.allInstances().isEmpty());
            });
        };
        result.addLookupListener(WeakListeners.create(LookupListener.class, this.lookupListener, result));
        this.lookupListener.resultChanged(null);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JTextComponent ed = EditorRegistry.lastFocusedComponent();
        StyledDocument doc = (StyledDocument) ed.getDocument();

        // Perform all of the changes atomically so that they can be undone with one undo.
        NbDocument.runAtomic(doc, new RunnableAction(ed, doc));
    }

    @Override
    public JMenuItem getPopupPresenter() {
         return new JMenuItem(this);
    }
    
    // https://netbeans.apache.org/wiki/DevFaqMultipleProgrammaticEdits.asciidoc
    private class RunnableAction implements Runnable {

        private final JTextComponent ed;
        private final Document doc;
        
        private RunnableAction(JTextComponent ed, Document doc){
            this.ed = ed;
            this.doc = doc;
        }
        
        @Override
        public void run(){
            try {
                doc.insertString(ed.getCaretPosition(), Character.toString('\u2227'), null);
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}