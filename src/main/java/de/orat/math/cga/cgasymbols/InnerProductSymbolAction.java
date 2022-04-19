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
    id = "de.orat.math.cga.cgasymbols.InnerProductSymbolAction"
)
@ActionRegistration(
    lazy = false,
    displayName = "#CTL_InnerProductSymbolAction"
)
@NbBundle.Messages("CTL_InnerProductSymbolAction=Inner product")
public final class InnerProductSymbolAction extends CGASymbolAction {

    public InnerProductSymbolAction(){
        super("\u22C5");
        putValue(NAME, Bundle.CTL_InnerProductSymbolAction());
        putValue(SHORT_DESCRIPTION, "Insert the inner product operator symbol");
        putValue(SMALL_ICON, ImageUtilities.loadImageIcon("de/orat/math/cga/cgasymbols/dot.png", false));
        putValue("iconBase", "de/orat/math/cga/cgasymbols/dot.png");
    }  
}
