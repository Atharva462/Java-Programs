import java.applet.*;
import java.awt.*;

public class news extends Applet{
    public static void main(String[] args) { 
      
        List l1 = new List(10, false);
        l1.setBounds(50, 60, 100, 120);
        l1.add("Times of India");
        l1.add("Sakal");
        l1.add("Lokmat");
        l1.add("Pudhari");
        l1.add("Hindustan Times");
        l1.add("The Economic India");
        add(l1);
 
        }
        public void paint(Graphics g){
            g.repaint();
        }
    }


