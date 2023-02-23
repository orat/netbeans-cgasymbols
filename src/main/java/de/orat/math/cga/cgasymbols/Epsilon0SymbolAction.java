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
    id = "de.orat.math.cga.cgasymbols.Epsilon0SymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Epsilon0SymbolAction"
)
@NbBundle.Messages("CTL_Epsilon0SymbolAction=origin")
// ε₀
public final class Epsilon0SymbolAction extends CGASymbolAction {
    public Epsilon0SymbolAction(){
        super("\u03b5\u2080");
        putValue(NAME, Bundle.CTL_Epsilon1SymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the origin symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-0.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-0.png");
    }  
}
