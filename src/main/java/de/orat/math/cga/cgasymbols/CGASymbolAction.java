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
import org.netbeans.api.editor.EditorRegistry;
import org.openide.cookies.EditorCookie;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;
import org.openide.util.actions.Presenter;

public abstract class CGASymbolAction extends AbstractAction implements Presenter.Popup {
 
    private static final long serialVersionUID = 1L;
    
    private final LookupListener lookupListener;
    private final Lookup.Result<EditorCookie> result;

    private final String CHARACTERS;
    
    public CGASymbolAction(String characters) {
        
        result = Utilities.actionsGlobalContext().lookupResult(EditorCookie.class);
        this.lookupListener = (LookupEvent ev) -> {
            EventQueue.invokeLater(() -> {
                setEnabled(!result.allInstances().isEmpty());
            });
        };
        result.addLookupListener(WeakListeners.create(LookupListener.class, this.lookupListener, result));
        this.lookupListener.resultChanged(null);
        
        CHARACTERS = characters; // = (String) getValue("CHARACTERS");
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
                doc.insertString(ed.getCaretPosition(), CHARACTERS, null);
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}