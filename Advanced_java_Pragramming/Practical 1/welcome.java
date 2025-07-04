import java.awt.*;


public class welcome {
    public static void main(String[] args) {
        Frame f = new Frame("Hello World!");
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400, 400);
        Label l1 = new Label("Welcome to java");
        l1.setBounds(50, 150, 150, 150);
        f.add(l1);
    }
}
