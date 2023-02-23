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
    id = "de.orat.math.cga.cgasymbols.MinkovskiBiVectorSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_MinkovskiBiVectorSymbolAction"
)
@NbBundle.Messages("CTL_MinkovskiBiVectorSymbolAction=mikovski-bi-vector")
// ε₀
public final class MinkovskiBiVectorSymbolAction extends CGASymbolAction {
    public MinkovskiBiVectorSymbolAction(){
        super("\u0045\u2080");
        putValue(NAME, Bundle.CTL_MinkovskiBiVectorSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the Minkovski Bi-Vector symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/minkovski-bi-vector.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/miknovski-bi-vector.png");
    }  
}
