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
    id = "de.orat.math.cga.cgasymbols.InfinityLasenbySymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_InfinityLasenbySymbolAction"
)
@NbBundle.Messages("CTL_InfinityLasenbySymbolAction=infinity (Lasenby) point base vector")
public final class InfinityLasenbySymbolAction extends CGASymbolAction {
    public InfinityLasenbySymbolAction(){
        super("\\u006E");
        putValue(NAME, Bundle.CTL_InfinityLasenbySymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the infinity (Lasenby) base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/infinity-lasenby.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/infinity-lasenby.png");
    }  
}
