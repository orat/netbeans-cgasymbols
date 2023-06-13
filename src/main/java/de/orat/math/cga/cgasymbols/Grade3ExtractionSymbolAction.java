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
    id = "de.orat.math.cga.cgasymbols.Grade3ExtractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Grade3ExtractionSymbolAction"
)
@NbBundle.Messages("CTL_Grade3ExtractionSymbolAction=grade-3 extraction")
public final class Grade3ExtractionSymbolAction extends CGASymbolAction {
    public Grade3ExtractionSymbolAction(){
        super("\u003C\u003E\u2083");
        putValue(NAME, Bundle.CTL_Grade3ExtractionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert grade-3 extraction symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-3 extraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-3 extraction.png");
    }  
}
