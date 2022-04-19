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
    id = "de.orat.math.cga.cgasymbols.DualSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_DualSymbolAction"
)
@NbBundle.Messages("CTL_DualSymbolAction=dual")
public final class DualSymbolAction extends CGASymbolAction {
    public DualSymbolAction(){
        super("\u002A");
        putValue(NAME, Bundle.CTL_DualSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the \u002A symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/dual.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/dual.png");
    }  
}
