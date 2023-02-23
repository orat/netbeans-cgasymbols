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
    id = "de.orat.math.cga.cgasymbols.EuclideanPseudoScalarSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_EuclideanPseudoScalarSymbolAction"
)
@NbBundle.Messages("CTL_EuclideanPseudoScalarSymbolAction=euclidean-pseudo-scalar")
// ε₀
public final class EuclideanPseudoScalarSymbolAction extends CGASymbolAction {
    public EuclideanPseudoScalarSymbolAction(){
        super("\u0045\u2083");
        putValue(NAME, Bundle.CTL_EuclideanPseudoScalarSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the Euclidean Pseudoscalar symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/euclidean-pseudo-scalar.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/euclidean-pseudo-scalar.png");
    }  
}
