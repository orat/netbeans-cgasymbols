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
    id = "de.orat.math.cga.cgasymbols.Epsilon1SymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Epsilon1SymbolAction"
)
@NbBundle.Messages("CTL_Epsilon1SymbolAction=first euclid base vector")
public final class Epsilon1SymbolAction extends CGASymbolAction {
    public Epsilon1SymbolAction(){
        super("\u03b5\u2081");
        putValue(NAME, Bundle.CTL_Epsilon1SymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the first euclid base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-1.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-1.png");
    }  
}
