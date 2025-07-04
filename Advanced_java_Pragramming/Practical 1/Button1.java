import java.awt.*;
class Button1
{
public static void main(String[] args){
Frame f1=new Frame("Button");
f1.setSize(500,500);
f1.setVisible(true);
f1.setLayout(null);
Button b1=new Button("OK");
b1.setBounds(10,100,100,80);
Button b2=new Button("RESET");
b2.setBounds(120,100,100,80);
Button b3=new Button("CANCEL");
b3.setBounds(230,100,100,80);
f1.add(b1);
f1.add(b2);
f1.add(b3);
}
}

