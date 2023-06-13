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
    id = "de.orat.math.cga.cgasymbols.Grade5ExtractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Grade5ExtractionSymbolAction"
)
@NbBundle.Messages("CTL_Grade5ExtractionSymbolAction=grade-5 extraction")
public final class Grade5ExtractionSymbolAction extends CGASymbolAction {
    public Grade5ExtractionSymbolAction(){
        super("\u003C\u003E\u2085");
        putValue(NAME, Bundle.CTL_Grade5ExtractionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert grade-5 extraction symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-5 extraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-5 extraction.png");
    }  
}
