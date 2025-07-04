import java.awt.*;


public class region {
    region(){
        Frame fr = new Frame();
        Button b1 = new Button("east");
        b1.setBounds(100, 150, 100, 50);
        Button b2 = new Button("west");
        b2.setBounds(200, 150, 100, 50);
        Button b3 = new Button("north");
        b3.setBounds(100, 200, 100, 50);
        Button b4 = new Button("south");
        b4.setBounds(200, 200, 100, 50);
        Button b5 = new Button("center");
        b5.setBounds(100, 250, 200, 50);
        Button b = new Button(null);
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
        fr.add(b5);
        fr.add(b);

        fr.setSize(400, 400);
        fr.setVisible(true);
        fr.setLayout(new BorderLayout());
    }
    public static void main(String[] args) {
        new region();
    }
}
