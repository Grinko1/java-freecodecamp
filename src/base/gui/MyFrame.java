package base.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("first title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x123456));
        this.setVisible(true);
    }
}
