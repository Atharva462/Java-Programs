import java.awt.*;

public class lists {
    public static void main(String[] args) {
        Frame fr = new Frame("City");
        fr.setSize(400, 400);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        List l1 = new List(4, false);
        l1.add("Berlin");
        l1.add("Moscow");
        l1.add("Tokyo");
        l1.add("Denver");
        l1.add("Rio");
        l1.add("Nairobi");
        l1.add("Palermo");
        l1.add("Helsinki");
        l1.add("Olso");
        l1.add("Lisboa");
        fr.add(l1); 
    }
}
