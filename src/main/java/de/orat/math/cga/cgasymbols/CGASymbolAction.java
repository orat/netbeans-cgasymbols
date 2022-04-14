package de.orat.math.cga.cgasymbols;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.cookies.EditorCookie;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
//import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "de.orat.math.cga.cgasymbols.CGASymbolAction"
)
@ActionRegistration(
        iconBase = "de/orat/math/cga/cgasymbols/plus_sign.png",
        displayName = "#CTL_CGASymbolAction"
)
@ActionReference(path="Editors/Toolbars/Default")
@Messages("CTL_CGASymbolAction=CGA Symbol")
public final class CGASymbolAction implements ActionListener {

    private final EditorCookie context;

    public CGASymbolAction(EditorCookie context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        // TODO use context
    }
}
