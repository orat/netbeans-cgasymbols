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
    id = "de.orat.math.cga.cgasymbols.GeneralInverseSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_GeneralInverseSymbolAction"
)
@NbBundle.Messages("CTL_GeneralInverseSymbolAction=general inverse")
public final class GeneralInverseSymbolAction extends CGASymbolAction {
    public GeneralInverseSymbolAction(){
        super("\u03b5\u2081");
        putValue(NAME, Bundle.CTL_GeneralInverseSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the general inverse symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/inverse.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/inverse.png");
    }  
}
