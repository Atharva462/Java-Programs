import java.awt.*;

public class Pract1_Basic {
  
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        Label l1 = new Label();
        l1.setText("Enter Your name");

        TextField tf = new TextField("Atharva");

        Label l2 = new Label("Address");
        TextArea ta = new TextArea("", 3, 4);

        Button b1 = new Button("Submit");
        Label l3 = new Label("Select subjects:");

        Checkbox cb1 = new Checkbox("Marathi");
        Checkbox cb2 = new Checkbox("Hindi");
        Checkbox cb3 = new Checkbox("English");
        Checkbox cb4 = new Checkbox("Sanskrit");

        Label l4 = new Label("Select gender:");
        
        Checkbox c1 = new Checkbox("Male",true);
        Checkbox c2 = new Checkbox("Female",true);

        f.add(l3);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(l4);
        f.add(c1);
        f.add(c2);
        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(ta);
        f.add(b1);
    }
}
