package base.text_field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button ;
    JTextField textField;
    public MyFrame() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Submit");
        button.addActionListener(this);
         textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 50));
        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                String text = textField.getText();
                System.out.println(text);
            }
    }
}
