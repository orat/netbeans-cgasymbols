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
    id = "de.orat.math.cga.cgasymbols.ReverseSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_ReverseSymbolAction"
)
@NbBundle.Messages("CTL_ReverseSymbolAction=reverse")
public final class ReverseSymbolAction extends CGASymbolAction {
    public ReverseSymbolAction(){
        super("\u02dc");
        putValue(NAME, Bundle.CTL_ReverseSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the \u02dc symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/reverse.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/reverse.png");
    }  
}
