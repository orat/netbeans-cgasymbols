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
    id = "de.orat.math.cga.cgasymbols.OriginLasenbySymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_OriginLasenbySymbolAction"
)
@NbBundle.Messages("CTL_OriginLasenbySymbolAction=origin (Lsenby) base vector")
public final class OriginLasenbySymbolAction extends CGASymbolAction {
    public OriginLasenbySymbolAction(){
        super("\u00F1");
        putValue(NAME, Bundle.CTL_OriginLasenbySymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the origin base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/origin-lasenby.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/origin-lasenby.png");
    }  
}
