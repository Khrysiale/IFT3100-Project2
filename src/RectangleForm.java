

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class RectangleForm extends Rectangle{

	public RectangleForm(Color c, Point2D pt1, Point2D pt2) {
		super();
        remplissage = c;
   }
		
	//private Point2D point1, point2;
	private static Color remplissage;	    
			

	public void draw(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(remplissage);
		g2d.draw(this);
	}

	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public double distance(Point p) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void translate(Point a, Point b) {
		// TODO Auto-generated method stub
		
	}

}