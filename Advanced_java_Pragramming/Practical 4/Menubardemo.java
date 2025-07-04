import java.awt.*;

public class Menubardemo extends Frame {

    Menubardemo() {
        setSize(500, 500);
        setVisible(true);
        setLayout(null);

        // Bar
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        
        Menu F = new Menu("File");
        mb.add(F);
        Menu E = new Menu("Edit");
        mb.add(E);
        Menu V = new Menu("View");
        mb.add(V);
        Menu H = new Menu("Help");
        mb.add(H);

        // menuitems
        MenuItem one = new MenuItem("New");
        F.add(one);
        MenuItem two = new MenuItem("Open");
        F.add(two);
        MenuItem three = new MenuItem("Save");
        F.add(three);
        MenuItem four = new MenuItem("SaveAs");
        F.add(four);

    }

    public static void main(String[] args) {
        new Menubardemo();
    }
}
