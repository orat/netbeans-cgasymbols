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
    id = "de.orat.math.cga.cgasymbols.VeeProductSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_VeeProductSymbolAction"
)
@NbBundle.Messages("CTL_VeeProductSymbolAction=Vee/Regressive product")
// ∨
public final class VeeProductSymbolAction extends CGASymbolAction {
    public VeeProductSymbolAction(){
        super("\u2228");
        putValue(NAME, Bundle.CTL_VeeProductSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the vee operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/vee.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/vee.png");
    }  
}
