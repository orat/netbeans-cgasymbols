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
    id = "de.orat.math.cga.cgasymbols.MeetSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_MeetSymbolAction"
)
@NbBundle.Messages("CTL_MeetSymbolAction=Meet")
// ∩
public final class MeetSymbolAction extends CGASymbolAction {
    public MeetSymbolAction(){
        super("\u222A");
        putValue(NAME, Bundle.CTL_MeetSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the meet operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/meet.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/meet.png");
    }  
}
