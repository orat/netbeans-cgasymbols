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
    id = "de.orat.math.cga.cgasymbols.Grade4ExtractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Grade4ExtractionSymbolAction"
)
@NbBundle.Messages("CTL_Grade4ExtractionSymbolAction=grade-4 extraction")
public final class Grade4ExtractionSymbolAction extends CGASymbolAction {
    public Grade4ExtractionSymbolAction(){
        super("\u003C\u003E\u2084");
        putValue(NAME, Bundle.CTL_Grade4ExtractionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert grade-4 extraction symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-4 extraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-4 extraction.png");
    }  
}
