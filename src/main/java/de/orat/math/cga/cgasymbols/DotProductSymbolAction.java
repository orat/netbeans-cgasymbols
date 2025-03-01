/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
	id = "de.orat.math.cga.cgasymbols.DotProductSymbolAction"
)
@ActionRegistration(
    lazy = false,
	displayName = "#CTL_DotProductSymbolAction"
)
@NbBundle.Messages("CTL_DotProductSymbolAction=Dot product")
// ⋅
public final class DotProductSymbolAction extends CGASymbolAction {

	public DotProductSymbolAction() {
        super("\u22C5");
		putValue(NAME, Bundle.CTL_DotProductSymbolAction());
		putValue(SHORT_DESCRIPTION, "Insert the dot product operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/dot.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/dot.png");
    }  
}
