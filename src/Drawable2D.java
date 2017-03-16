import java.awt.Graphics;
import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JPanel;

//Dessin
/* contient un tableau de figures(l ensemble des figures du dessin
 * permet d ajouter ou de supprimer facilement une figure 
 * et qui peut renvoyer la figure la plus proche d un point donné.
 */
public class Drawable2D extends LinkedList<Object>{//public class Drawable2D extends LinkedList<Object>{
	

	private int ladder = 0;
	Point pt1;
	Point pt2;

	/**
	 * 
	 */
	private static final long serialVersionUID = -2281022592110204536L;
	private int dimension = 0;
	Point pos1;
	Point pos2;

	//Forms2D fig;
	/*public static LinkedList<Forms2D> figures = new LinkedList<Forms2D>();//ok
	
	public Figure(int dimension, Point p1, Point p2) {
		super();
		this.dimension = dimension;
		this.pt1 = p1;
		this.pt2 = p2;
	}*/
	
    
    public Drawable2D(){
	super();
    }

	public static void add(Forms2D f) {//ok
		Drawable2D.add(f);
	}

	public static void remove(Forms2D f) {//ok
		Drawable2D.remove(f);
	}
	
	public static Forms2D closer(Point p){//ok (plusproche)
		return null;
		
	}
	
	public static void drawAll(Graphics g, double dimension){//ok
		
	}

	public void clear() {
	}
	
}
