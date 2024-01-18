package base.radio_buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    public MyFrame() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JRadioButton pizzaButton = new JRadioButton("pizza");
        JRadioButton hotdogButton = new JRadioButton("hotdog");
        JRadioButton sushiButton = new JRadioButton("sushi");
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hotdogButton);
        group.add(sushiButton);

        this.add(pizzaButton);
        this.add(hotdogButton);
        this.add(sushiButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
