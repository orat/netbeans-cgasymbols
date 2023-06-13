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
    id = "de.orat.math.cga.cgasymbols.SquareSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_SquareSymbolAction"
)
@NbBundle.Messages("CTL_SquareSymbolAction=square")
public final class SquareSymbolAction extends CGASymbolAction {
    public SquareSymbolAction(){
        super("\u00B2");
        putValue(NAME, Bundle.CTL_SquareSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the square symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/square.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/square.png");
    }  
}
