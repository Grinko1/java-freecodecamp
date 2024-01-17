package base.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    JButton button;
    MyFrame(){
        button= new JButton();
        button.setBounds(200, 100, 100, 50);
        button.setText("Poo");
        button.addActionListener(e -> System.out.println("poo"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.add(button);
        this.setVisible(true);

    }

}
