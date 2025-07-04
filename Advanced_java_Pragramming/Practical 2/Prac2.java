import java.awt.*;
public class Prac2 {
    public static void main(String[] args) {
        Frame fr = new Frame("window");
        fr.setSize(400, 400);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        List l1 = new List(3, false);
        l1.add("Summer");
        l1.add("Rainy");
        l1.add("Winter");
        fr.add(l1); 
    }
}
