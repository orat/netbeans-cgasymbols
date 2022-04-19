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
    id = "de.orat.math.cga.cgasymbols.Epsilon2SymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Epsilon2SymbolAction"
)
@NbBundle.Messages("CTL_Epsilon2SymbolAction=second euclid base vector")
public final class Epsilon2SymbolAction extends CGASymbolAction {
    public Epsilon2SymbolAction(){
        super("\u03b5\u2082");
        putValue(NAME, Bundle.CTL_Epsilon2SymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the second euclid base symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-2.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-2.png");
    }  
}
