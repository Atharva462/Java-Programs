import java.awt.*;
class CheckBox1
{
 public static void main(String[] args){
Frame f1=new Frame("CheckBox");
f1.setSize(400,400);
f1.setVisible(true);
f1.setLayout(null);
Checkbox c1,c2,c3,c4;
c1=new Checkbox("Hindi");
c1.setBounds(10,20,140,50);
c2=new Checkbox("Marathi",true);
c2.setBounds(10,50,140,50);
c3=new Checkbox("English");
c3.setBounds(10,80,140,50);
c4=new Checkbox("Sanskrit");
c4.setBounds(10,110,140,50);
f1.add(c1);
f1.add(c2);
f1.add(c3);
f1.add(c4);
}
}