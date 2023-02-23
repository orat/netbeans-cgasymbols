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
    id = "de.orat.math.cga.cgasymbols.ConjugateSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_ConjugateSymbolAction"
)
@NbBundle.Messages("CTL_ConjugateSymbolAction=conjugate")
// †
public final class ConjugateSymbolAction extends CGASymbolAction {
    public ConjugateSymbolAction(){
        super("\u2020");
        putValue(NAME, Bundle.CTL_ConjugateSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the conjugate symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/conjugate.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/conjugate.png");
    }  
}
