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
    id = "de.orat.math.cga.cgasymbols.OriginDorstSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_OriginDorstSymbolAction"
)
@NbBundle.Messages("CTL_OriginDorstSymbolAction=origin base vector")
public final class OriginDorstSymbolAction extends CGASymbolAction {
    public OriginDorstSymbolAction(){
        super("\u006F");
        putValue(NAME, Bundle.CTL_OriginDorstSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the origin (Dorst) base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/origin-dorst.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/origin-dorst.png");
    }  
}
