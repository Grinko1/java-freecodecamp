package base.drag_and_drop;

import javax.swing.*;
import java.awt.*;

public class DragPanel extends JPanel {
    JLabel label;
    public DragPanel() {
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        this.add(label);
    }
    //9:38
}
