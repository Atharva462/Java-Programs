import java.awt.*;

public class Form1 // menu and submenu
{
public static void main(String[] args){
Frame f1=new Frame("Applicatin Form");
MenuBar mb=new MenuBar();
Menu menu,submenu;
menu=new Menu("Menu");
submenu=new Menu("Result");
MenuItem m1,m2,m3,m4a,m4b;
m1=new MenuItem("LoginPage");
m2=new MenuItem("HomePage");
m3=new MenuItem("Colleges");
m4a=new MenuItem("Result 2018");
m4b=new MenuItem("Result 2019");
 
menu.add(m1);
menu.add(m2);
menu.add(m3);
menu.add(submenu);
submenu.add(m4a);
submenu.add(m4b);
mb.add(menu);

f1.setMenuBar(mb);
f1.setSize(400,400);
f1.setVisible(true);
f1.setLayout(null);

}
}