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
    id = "de.orat.math.cga.cgasymbols.OriginSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_OriginSymbolAction"
)
@NbBundle.Messages("CTL_OriginSymbolAction=origin base vector")
public final class OriginSymbolAction extends CGASymbolAction {
    public OriginSymbolAction(){
        super("\u006F");
        putValue(NAME, Bundle.CTL_OriginSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the origin base vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/origin.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/origin.png");
    }  
}
