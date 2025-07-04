import java.awt.*;

public class checkbox {
    public static void main(String[] args) {
        Frame fr = new Frame("multiple");
        fr.setLayout(new FlowLayout());
        fr.setSize(400, 400);
        fr.setVisible(true);
        Label x = new Label("select");
        x.setBounds(50, 150, 150, 20);
        Checkbox c1 = new Checkbox("A");
        Checkbox c2 = new Checkbox("B");
        Checkbox c3 = new Checkbox("C");
        Checkbox c4 = new Checkbox("D");

        fr.add(x);
        fr.add(c1);
        fr.add(c2);
        fr.add(c3);
        fr.add(c4);
    }
}