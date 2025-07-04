// Textfield, TextArea, Button, Checkbox, RadioButton, Label
import java.awt.*;

// import javax.swing.ImageIcon;
// import javax.swing.JRadioButton;
// import javax.swing.JLabel;

public class thread1 {

    public static void main(String[] args) {
        Frame f1 = new Frame("one");
        f1.setSize(400, 400);
        f1.setVisible(true);
        f1.setLayout(new FlowLayout());
        // Label l1 = new Label("ok");
        // Label l2 = new Label("cancel");
        // f1.add(l1);
        // f1.add(l2);                               labels

        // Button b1 = new Button("Submit");
        // b1.setBounds(100, 50, 70, 50);
        // Button b2 = new Button("cancel");
        // b2.setBounds(100, 80, 70, 50);
        // f1.add(b1);
        // f1.add(b2);                               button

        // Checkbox c1 = new Checkbox("candy");
        // Checkbox c2 = new Checkbox("ice-cream");
        // Checkbox c3 = new Checkbox("salad");
        // f1.add(c1);
        // f1.add(c2);
        // f1.add(c3);                               checkbox 

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("candy",cbg,true);
        Checkbox c2 = new Checkbox("ice-cream",cbg,false);
        Checkbox c3 = new Checkbox("salad",cbg,false);
        Checkbox c4 = new Checkbox("chinese",cbg,false);
        Checkbox c5 = new Checkbox("veg",cbg,false);
        Checkbox c6 = new Checkbox("non-veg",cbg,false);
        f1.add(c1);
        f1.add(c2);
        f1.add(c3);                               
        f1.add(c4);                                                  
        f1.add(c5);                               
        f1.add(c6);                              

        // Scrollbar h1 = new Scrollbar(Scrollbar.HORIZONTAL);
        // Scrollbar v1 = new Scrollbar(Scrollbar.VERTICAL);
        // f1.add(h1);
        // f1.add(v1);                              scrollbar

        // Label l1 = new Label();
        // l1.setText("enter your name");
        // TextField t1 = new TextField(10);
        // f1.add(l1);
        // f1.add(t1);                              Textfield

        // Label l1 = new Label();
        // l1.setText("enter your address:");
        // TextArea t1 = new TextArea(10,20);
        // f1.add(l1);
        // f1.add(t1);                              TextArea

        // List l1 = new List(4,false);
        // l1.add("Berlin");
        // l1.add("Moscow");
        // l1.add("Tokyo");
        // l1.add("Denver");
        // l1.add("Rio");
        // l1.add("Nairobi");
        // l1.add("Palermo");
        // l1.add("Helsinki");
        // l1.add("Oslo");
        // l1.add("Lisboa");
        // f1.add(l1);                                list

        // Choice c1 = new Choice();
        // c1.add("male");
        // c1.add("female");
        // f1.add(c1);                                choice

        // JLabel l1 = new JLabel("which fruit you like?");
        // JRadioButton r1 =new JRadioButton("Apple",true); 
        // JRadioButton r2 =new JRadioButton("Grapes",false); 
        // JRadioButton r3 =new JRadioButton("Orange",false); 
        // f1.add(l1);
        // f1.add(r1);
        // f1.add(r2);
        // f1.add(r3);                               JRadioButton

        // ImageIcon g1 = new ImageIcon("./k3.jpg");
        // JLabel l1 = new JLabel(g1);
        // f1.add(l1);                               ImageIcon
    }
}
