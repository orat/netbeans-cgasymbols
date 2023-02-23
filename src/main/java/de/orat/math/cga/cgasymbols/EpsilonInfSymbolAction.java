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
    id = "de.orat.math.cga.cgasymbols.EpsilonInfSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_EpsilonInfSymbolAction"
)
@NbBundle.Messages("CTL_EpsilonInfSymbolAction=infinity base vector")
public final class EpsilonInfSymbolAction extends CGASymbolAction {
    public EpsilonInfSymbolAction(){
        super("\u03b5\u1D62");
        putValue(NAME, Bundle.CTL_Epsilon3SymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the infinity base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-inf.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-inf.png");
    }  
}
