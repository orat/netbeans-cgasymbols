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
    id = "de.orat.math.cga.cgasymbols.Epsilon3SymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Epsilon3SymbolAction"
)
@NbBundle.Messages("CTL_Epsilon3SymbolAction=third euclid base vector")
public final class Epsilon3SymbolAction extends CGASymbolAction {
    public Epsilon3SymbolAction(){
        super("\u03b5\u2083");
        putValue(NAME, Bundle.CTL_Epsilon3SymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the third euclid base symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/epsilon-3.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/epsilon-3.png");
    }  
}
