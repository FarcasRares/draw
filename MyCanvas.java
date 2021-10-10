package Draw;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class MyCanvas extends Canvas {
	Menu f;
	int l=30;
    Random rand=new Random();
    String canvasShape=null;
    String canvasType=null;
    int numberOfShape=0;
	public MyCanvas() {
		this.setBackground(Color.WHITE);
		
	}
	public void paint(Graphics g) {
		if (canvasShape.equals("Square"))
		 {
			 int i,x,y;
			 if(canvasType.equals("Empty")) {
			 for(i=0;i<numberOfShape;i++) {
		     g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
			 x=rand.nextInt(getWidth()-2*l);
			 y=rand.nextInt(getHeight()-2*l);
			 g.drawRect(x, y, l, l);
			 }
			 }
			 else if (canvasType.equals("Fill")) {
				 for(i=0;i<numberOfShape;i++) {
				     g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
					 x=rand.nextInt(getWidth()-2*l);
					 y=rand.nextInt(getHeight()-2*l);
					 g.fillRect(x, y, l, l);
					 }
			 }
		 }
		else if (canvasShape.equals("Circle")) {
			 int i,x,y;
			 if(canvasType.equals("Empty")) {
			 for(i=0;i<numberOfShape;i++) {
		     g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
			 x=rand.nextInt(getWidth()-2*l);
			 y=rand.nextInt(getHeight()-2*l);
			 g.drawOval(x, y, l, l);
		      }
			 }
			 else if(canvasType.equals("Fill")) {
				 for(i=0;i<numberOfShape;i++) {
				     g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
					 x=rand.nextInt(getWidth()-2*l);
					 y=rand.nextInt(getHeight()-2*l);
					 g.fillOval(x, y, l, l);
				      }
			 }
			 
		}
   }
	public void draw(int nr, String shape,String type) {
		this.canvasShape=shape;
		this.numberOfShape=nr;
		this.canvasType=type;
		 repaint();
	   }
}
