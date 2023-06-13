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
    id = "de.orat.math.cga.cgasymbols.Grade1ExtractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Grade1ExtractionSymbolAction"
)
@NbBundle.Messages("CTL_Grade1ExtractionSymbolAction=grade-1 extraction")
public final class Grade1ExtractionSymbolAction extends CGASymbolAction {
    public Grade1ExtractionSymbolAction(){
        super("\u003C\u003E\u2081");
        putValue(NAME, Bundle.CTL_Grade1ExtractionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert grade-1 extraction symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-1 extraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-1 extraction.png");
    }  
}
