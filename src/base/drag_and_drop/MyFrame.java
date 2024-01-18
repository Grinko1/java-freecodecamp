package base.drag_and_drop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
     MyFrame()  {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(500,500);
         this.setTitle("Drag and drop");
         this.setLayout(null);
         this.add(dragPanel);

         this.setVisible(true);
    }
}
