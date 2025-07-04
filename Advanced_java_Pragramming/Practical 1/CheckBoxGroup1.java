import java.awt.*;
public class CheckBoxGroup1 extends Frame
{
public static void main(String[] args)
{
Frame f1=new Frame("CheckBox Group(Radio buttons)");
Checkbox c1,c2,c3,c4;
CheckboxGroup cbg;
f1.setSize(400,400);
f1.setLayout(new FlowLayout());
f1.setVisible(true);

cbg=new CheckboxGroup();
c1=new Checkbox("RadioButton1",cbg,false);
c2=new Checkbox("RadioButton2",cbg,false);
c3=new Checkbox("RadioButton3",cbg,false);
c4=new Checkbox("RadioButton4",cbg,false);

f1.add(c1);
f1.add(c2);
f1.add(c3);
f1.add(c4);
}
}