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
    id = "de.orat.math.cga.cgasymbols.InfinitySymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_InfinitySymbolAction"
)
@NbBundle.Messages("CTL_InfinitySymbolAction=infinity point base vector")
public final class InfinitySymbolAction extends CGASymbolAction {
    public InfinitySymbolAction(){
        super("\u221e");
        putValue(NAME, Bundle.CTL_InfinitySymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the infinity base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/infinity.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/infinity.png");
    }  
}
