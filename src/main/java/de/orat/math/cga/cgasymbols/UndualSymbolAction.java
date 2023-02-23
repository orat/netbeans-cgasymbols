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
    id = "de.orat.math.cga.cgasymbols.UndualSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_UndualSymbolAction"
)
@NbBundle.Messages("CTL_UndualSymbolAction=undual")
// ⁻*
public final class UndualSymbolAction extends CGASymbolAction {
    public UndualSymbolAction(){
        super("\u207B\u002A");
        putValue(NAME, Bundle.CTL_UndualSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the undual symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/undual.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/undual.png");
    }  
}
