package base.progress_bar;

import javax.swing.*;
import java.awt.*;


public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();
    public ProgressBarDemo() {
        progressBar.setValue(0);
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);


        frame = new JFrame("Slider demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(progressBar);
        frame.setSize(420,420);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter = 0;
        while (counter <= 100){
            progressBar.setValue(counter);
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter++;
        }
    }
}
