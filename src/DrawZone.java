import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JPanel;

//ZoneDessin
/*traite les evenements souri lies aux choix de dessin et choix mode*/

public class DrawZone extends JPanel implements MouseListener {

	private static LinkedList figures = new LinkedList();
	
	public static final int dim;
	Point position1;
	Point position2;
	Figure f;
	
		
	public DrawZone(){
		Figure f;
	}		
	
	
	public void paint(Graphics g) {
		super.paint(g);
		for (Iterator iter = figures.iterator(); iter.hasNext();) {
			Figure d = (Figure) iter.next();
			d.draw(g);	
		}
	}
	
	

	
	public static void add(Drawable d) {
		figures.add(d);
	}

	public static void remove(Drawable d) {
		figures.remove(d);
	}
	
	public static Figure plusProche(Point p){
		return null;
		
	}
	
	public static void drawAll(Graphics g, double dim){}

	public static void clear() {
		figures.clear();
		
		
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		position1 = (e.getX(), e.getY()) ;
		repaint();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		position2 = (e.getX(), e.getY()) ;
		repaint();
		
	}
	
	

	
}
