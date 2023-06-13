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
    id = "de.orat.math.cga.cgasymbols.Grade0ExtractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Grade0ExtractionSymbolAction"
)
@NbBundle.Messages("CTL_Grade0ExtractionSymbolAction=grade-0 extraction")
public final class Grade0ExtractionSymbolAction extends CGASymbolAction {
    public Grade0ExtractionSymbolAction(){
        super("\u003C\u003E\u2080");
        putValue(NAME, Bundle.CTL_Grade0ExtractionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert grade-0 extraction symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-0 extraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-0 extraction.png");
    }  
}
