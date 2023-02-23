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
    id = "de.orat.math.cga.cgasymbols.RightContractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_RightContractionSymbolAction"
)
@NbBundle.Messages("CTL_RightContractionSymbolAction=Right contraction")
// ⌋
public final class RightContractionSymbolAction extends CGASymbolAction {

    public RightContractionSymbolAction(){
        super("\u230A");
        putValue(NAME, Bundle.CTL_RightContractionSymbolAction());
        putValue(SHORT_DESCRIPTION, "Insert the right contraction operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/right-contraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/right-contraction.png");
    }  
}
