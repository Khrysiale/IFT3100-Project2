import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JPanel;

//contient toutes les figures
public class Drawable extends JPanel{
	
	public static final int dim = 0;
	Point position1;
	Point position2;
	Figure fig;
	
	public static LinkedList<Figure> figures = new LinkedList();
	
	public void paint(Graphics g) {
		super.paint(g);
		for (Iterator iter = figures.iterator(); iter.hasNext();) {
			Figure d = (Figure) iter.next();
			d.draw(g);	
		}
	}
	public static void add(Figure f) {
		figures.add(f);
	}

	public static void remove(Figure f) {
		figures.remove(f);
	}
	
	public static Figure plusProche(Point p){
		return null;
		
	}
	
	public static void drawAll(Graphics g, double dim){}

	public static void clear() {
		figures.clear();
	}
	
}
