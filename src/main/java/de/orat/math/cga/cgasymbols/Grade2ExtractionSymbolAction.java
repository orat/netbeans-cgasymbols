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
    id = "de.orat.math.cga.cgasymbols.Grade2ExtractionSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_Grade2ExtractionSymbolAction"
)
@NbBundle.Messages("CTL_Grade2ExtractionSymbolAction=grade-2 extraction")
public final class Grade2ExtractionSymbolAction extends CGASymbolAction {
    public Grade2ExtractionSymbolAction(){
        super("\u003C\u003E\u2082");
        putValue(NAME, Bundle.CTL_Grade2ExtractionSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert grade-2 extraction symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/grade-2 extraction.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/grade-2 extraction.png");
    }  
}
