package de.orat.math.cga.cgasymbols;

import de.orat.math.cga.cgasymbols.*;
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
    id = "de.orat.math.cga.cgasymbols.InfinityDorstSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_InfinityDorstSymbolAction"
)
@NbBundle.Messages("CTL_InfinityDorstSymbolAction=infinity (Dorst) point base vector")
// εᵢ
public final class InfinityDorstSymbolAction extends CGASymbolAction {
    public InfinityDorstSymbolAction(){
        super("\u221E");
        putValue(NAME, Bundle.CTL_InfinityDorstSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the infinity (Dorst) base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/infinity-dorst.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/infinity-dorst.png");
    }  
}
