package de.orat.math.cga.cgasymbols;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle;
import org.openide.util.actions.Presenter;

/**
 * Infos zu PopupMenu in der Toolbar
 * https://aalvarez.me/posts/dropdown-toolbar-buttons-in-netbeans-platform/
 * 
 * TODO
 * Ribbonbar - das ist vermutlich das sinnvollste: also ein Icon in die editor toolbar
 * und bei click auf das icon eine ganze Sortierungen von Buttons in verschiedenen
 * Gruppen anzeigen ...
 * https://netbeans.apache.org/tutorials/nbm-ribbonbar.html
 * 
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
@ActionID(
    category = "Edit",
    id = "de.orat.math.cga.cgasymbols.CGASymbolsSubmenuAction"
)
//TODO Warum lazy=false?
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_CGASymbolsSubmenuAction"
)

// make the action available as macro
// https://netbeans.apache.org/wiki/DevFaqAddMacroableAction.asciidoc
/*@NbBundle.Messages({ "CTL_MyAction=Let's go", "macro-name=Let's go" })
@EditorActionRegistration(
	name = "macro-name",
	mimeType = "text/x-java",
	menuPath = "Source", menuPosition = 0, menuText = "#CTL_MyAction")*/

// damit landet die action als symbol in der editor toolbar
//@ActionReference(path="Editors/Toolbars/Default", position = 1000)

//@ActionReference(path = "Editors/text/x-java/Popup", position = 400)
@ActionReference(path="Editors/Popup")
@NbBundle.Messages("CTL_CGASymbolsSubmenuAction=Insert CGA symbols...")
// submenues bauen
// https://netbeans.apache.org/wiki/DevFaqUsingSubmenus.asciidoc
// dropdown menu in der toolbar
// https://netbeans.apache.org/wiki/DevFaqDropdownMenuAddToolbar.asciidoc
// action mit shortcut
//TODO
// https://netbeans.apache.org/wiki/DevFaqActionsAddAtRuntime.asciidoc
public final class CGASymbolsSubmenuAction extends AbstractAction 
        implements Presenter.Popup {

    @Override
    public JMenuItem getPopupPresenter() {
        // der String im Konstruktor wird verwendet. Wie kann ich das umstellen
        // auf CTL_CGASymbolsSubmenuAction?
        //TODO
        JMenu menu = new JMenu("Insert CGA symbols");
        
        JMenu dualOperatorsMenu = new JMenu("Dual operators");
        dualOperatorsMenu.add(new OuterProductSymbolAction());
        dualOperatorsMenu.add(new VeeProductSymbolAction());
        dualOperatorsMenu.add(new DotProductSymbolAction());
        dualOperatorsMenu.add(new LeftContractionSymbolAction());
        dualOperatorsMenu.add(new RightContractionSymbolAction());
        dualOperatorsMenu.add(new MeetSymbolAction());
        dualOperatorsMenu.add(new JoinSymbolAction());
        
        JMenu monadicOperatorsMenu = new JMenu("Monadic operators");
        monadicOperatorsMenu.add(new GeneralInverseSymbolAction());
        monadicOperatorsMenu.add(new ReverseSymbolAction());
        monadicOperatorsMenu.add(new ConjugateSymbolAction());
        monadicOperatorsMenu.add(new DualSymbolAction());
        monadicOperatorsMenu.add(new UndualSymbolAction());
        
        monadicOperatorsMenu.add(new SquareSymbolAction());
        monadicOperatorsMenu.add(new GradeInvolutionSymbolAction());
        
        monadicOperatorsMenu.add(new Grade0ExtractionSymbolAction());
        monadicOperatorsMenu.add(new Grade1ExtractionSymbolAction());
        monadicOperatorsMenu.add(new Grade2ExtractionSymbolAction());
        monadicOperatorsMenu.add(new Grade3ExtractionSymbolAction());
        monadicOperatorsMenu.add(new Grade4ExtractionSymbolAction());
        monadicOperatorsMenu.add(new Grade5ExtractionSymbolAction());
        
        JMenu symbolsMenu = new JMenu("Base vectors");
        symbolsMenu.add(new Epsilon0SymbolAction());
        symbolsMenu.add(new Epsilon1SymbolAction());
        symbolsMenu.add(new Epsilon2SymbolAction());
        symbolsMenu.add(new Epsilon3SymbolAction());
        symbolsMenu.add(new EpsilonInfSymbolAction());
        
        symbolsMenu.add(new OriginDorstSymbolAction());
        symbolsMenu.add(new InfinityDorstSymbolAction());
        
        symbolsMenu.add(new EpsilonPlusSymbolAction());
        symbolsMenu.add(new EpsilonMinusSymbolAction());
        
        symbolsMenu.add(new OriginLasenbySymbolAction());
        symbolsMenu.add(new InfinityLasenbySymbolAction());
        
        JMenu generalSymbolsMenu = new JMenu("General symbols");
        generalSymbolsMenu.add(new MinkovskiBiVectorSymbolAction());
        generalSymbolsMenu.add(new EuclideanPseudoScalarSymbolAction());
        generalSymbolsMenu.add(new PseudoScalarSymbolAction());
        generalSymbolsMenu.add(new MinkovskiBiVectorSymbolAction());
        generalSymbolsMenu.add(new PiSymbolAction());
        
        // add menus
        menu.add(dualOperatorsMenu);
        menu.add(monadicOperatorsMenu);
        menu.add(symbolsMenu);
        menu.add(generalSymbolsMenu);
        
        return menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Delegated to getToolbarPresenter()
    }
}
