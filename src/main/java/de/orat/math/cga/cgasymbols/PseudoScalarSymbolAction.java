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
    id = "de.orat.math.cga.cgasymbols.PseudoScalarSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_PseudoScalarSymbolAction"
)
@NbBundle.Messages("CTL_PseudoScalarSymbolAction=pseudo-scalar")
// ε₀
public final class PseudoScalarSymbolAction extends CGASymbolAction {
    public PseudoScalarSymbolAction(){
        super("\u0045");
        putValue(NAME, Bundle.CTL_PseudoScalarSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the Pseudoscalar symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/pseudo-scalar.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/pseudo-scalar.png");
    }  
}
