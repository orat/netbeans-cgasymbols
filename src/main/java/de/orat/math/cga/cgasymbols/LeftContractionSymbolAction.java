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
    id = "de.orat.math.cga.cgasymbols.LeftContractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_LeftContractionSymbolAction"
)
@NbBundle.Messages("CTL_LeftContractionSymbolAction=Left contraction")
// ⌊
public final class LeftContractionSymbolAction extends CGASymbolAction {

    public LeftContractionSymbolAction(){
        super("\u230B");
        putValue(NAME, Bundle.CTL_LeftContractionSymbolAction());
        putValue(SHORT_DESCRIPTION, "Insert the left contraction operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/left-contraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/left-contraction.png");
    }  
}
