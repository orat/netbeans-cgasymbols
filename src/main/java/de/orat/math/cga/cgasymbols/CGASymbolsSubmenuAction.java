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
        JMenu menu = new JMenu("Insert CGA symbols...");
        JMenu dualOperatorsMenu = new JMenu("Dual operators...");
        dualOperatorsMenu.add(new OuterProductSymbolAction());
        JMenu monadicOperatorsMenu = new JMenu("Monadic operators...");
        JMenu symbolsMenu = new JMenu("Symbols...");
        menu.add(dualOperatorsMenu);
        menu.add(monadicOperatorsMenu);
        menu.add(symbolsMenu);
        return menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Delegated to getToolbarPresenter()
    }
}
