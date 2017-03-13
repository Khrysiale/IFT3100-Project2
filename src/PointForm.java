/**
 * 
 * Class qui génère un simple point en x, y .
 * 
 * */


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.geom.Point2D;

public class PointForm  extends Figure{
	
	public PointForm(Color color, Point pos, Dimension dim){
		super(color, pos, dim);
	}


	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		((Graphics2D) g).setStroke(new BasicStroke(2.0f));
		g.drawLine((int)this.x,(int)this.y,(int)this.x,(int)this.y);
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double distance(Point p) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void draw(Graphics g, int �chelle) {
		// TODO Auto-generated method stub
		
	}

	
}
