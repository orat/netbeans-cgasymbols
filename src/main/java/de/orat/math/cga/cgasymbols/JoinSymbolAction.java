package de.orat.math.cga.cgasymbols;

import static javax.swing.Action.SMALL_ICON;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;

/**
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
@ActionID(
    category = "Edit",
    id = "de.orat.math.cga.cgasymbols.JoinSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_JoinSymbolAction"
)
@NbBundle.Messages("CTL_JoinSymbolAction=Join")
public final class JoinSymbolAction extends CGASymbolAction {
    public JoinSymbolAction(){
        super("\u2229");
        putValue(NAME, Bundle.CTL_JoinSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the join operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/join.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/join.png");
    }  
}
