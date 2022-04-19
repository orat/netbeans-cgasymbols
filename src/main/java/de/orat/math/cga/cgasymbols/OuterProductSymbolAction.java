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
    id = "de.orat.math.cga.cgasymbols.OuterProductSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_OuterProductSymbolAction"
)
@NbBundle.Messages("CTL_OuterProductSymbolAction=Outer product")
public final class OuterProductSymbolAction extends CGASymbolAction {
    public OuterProductSymbolAction(){
        super("\u2227");
        putValue(NAME, Bundle.CTL_OuterProductSymbolAction()); 
        putValue(SHORT_DESCRIPTION, "Insert the wedge operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/wedge.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/wedge.png");
    }  
}
