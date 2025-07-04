import java.awt.*;
// import java.applet.*;

public class myGridLayout{
	Frame f ;
	myGridLayout(){
	f = new Frame();
	Button b1 = new Button("button 1");
	Button b2 = new Button("button 2");
	Button b3 = new Button("button 3");
	Button b4 = new Button("button 4");
	Button b5 = new Button("button 5");
	f.add(b1);
	f.add(b2); 
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.setSize(400, 400);
	f.setLayout(new GridLayout(2,3));
	f.setVisible(true);	
	}
	public static void main(String args[]){
		new myGridLayout();
	}
}