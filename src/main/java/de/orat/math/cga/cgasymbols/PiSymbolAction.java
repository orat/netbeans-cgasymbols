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
    id = "de.orat.math.cga.cgasymbols.PiSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_PiSymbolAction"
)
@NbBundle.Messages("CTL_PiSymbolAction=pi")
// ˜
public final class PiSymbolAction extends CGASymbolAction {
    public PiSymbolAction(){
        super("\\u03C0");
        putValue(NAME, Bundle.CTL_PiSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the Pi symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/pi.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/pi.png");
    }  
}
