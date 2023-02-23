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
    id = "de.orat.math.cga.cgasymbols.EpsilonMinusSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_EpsilonMinusSymbolAction"
)
@NbBundle.Messages("CTL_EpsilonMinusSymbolAction=negative squared base vector")
public final class EpsilonMinusSymbolAction extends CGASymbolAction {
    public EpsilonMinusSymbolAction(){
        super("\u03b5\u208B");
        putValue(NAME, Bundle.CTL_EpsilonPlusSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the squared negative base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-minus.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-minus.png");
    }  
}
