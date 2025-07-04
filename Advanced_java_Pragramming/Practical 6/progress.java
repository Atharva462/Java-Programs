import java.awt.*;
import javax.swing.*;

public class progress {
    public static void main(String[] args) {
     JFrame f1 = new JFrame();   
     f1.setSize(400, 400);
     f1.setVisible(true);
     f1.setLayout(null);
     JProgressBar p1 = new JProgressBar(0,100);
     p1.setBounds(50, 50, 150, 30);
     p1.setValue(69);
     p1.setStringPainted(true);
     f1.add(p1);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fillBar();
    }
    public static void fillBar(){
        int i = 0;
        try{
            while (i<=100) {
                // p1.setValue(i);
                Thread.sleep(10);
                i = i+20;
            }
        }
        catch(Exception e){}
    }
}
