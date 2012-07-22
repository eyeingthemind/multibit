package org.multibit.viewsystem.swing.view.components;

import java.awt.Dimension;

import javax.swing.Action;

import org.multibit.controller.MultiBitController;

public class HelpButton extends MultiBitButton {

    private static final long serialVersionUID = 6708096174704292284L;

    public HelpButton(Action action, MultiBitController controller) {
        this(action, controller, false);
    }

    public HelpButton(Action action, MultiBitController controller, boolean paintBorder) {
        super(action, controller);

        setBorderPainted(paintBorder);
        setContentAreaFilled(paintBorder);

        if (getIcon() != null && (getText() == null || "".equals(getText()))) {
            int width = getIcon().getIconWidth();
            int height = getIcon().getIconHeight();
            setPreferredSize(new Dimension(width, height));
        }

    }
}
