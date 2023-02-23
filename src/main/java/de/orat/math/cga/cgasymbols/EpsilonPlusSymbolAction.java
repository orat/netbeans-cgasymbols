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
    id = "de.orat.math.cga.cgasymbols.EpsilonPlusSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_EpsilonPlusSymbolAction"
)
@NbBundle.Messages("CTL_EpsilonPlusSymbolAction=positive squared base vector")
public final class EpsilonPlusSymbolAction extends CGASymbolAction {
    public EpsilonPlusSymbolAction(){
        super("\u03b5\u208A");
        putValue(NAME, Bundle.CTL_EpsilonPlusSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the squared positive base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-plus.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-plus.png");
    }  
}
