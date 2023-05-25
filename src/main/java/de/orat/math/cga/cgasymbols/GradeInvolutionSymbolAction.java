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
    id = "de.orat.math.cga.cgasymbols.GradeInvolutionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_GradeInvolutionSymbolAction"
)
@NbBundle.Messages("CTL_GradeInvolutionSymbolAction=grade-involution")
// ˜
public final class GradeInvolutionSymbolAction extends CGASymbolAction {
    public GradeInvolutionSymbolAction(){
        super("\u005E");
        putValue(NAME, Bundle.CTL_GradeInvolutionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the grade involution/inversion symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-involution.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-involution.png");
    }  
}
