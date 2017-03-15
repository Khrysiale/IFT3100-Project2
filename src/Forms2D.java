import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.geom.Point2D;
import java.io.Serializable;


//Figure
/* dont derive toutes les formes,
 * contient les declarations des methodes et des variables communes
 * a toutes les figures.
 */
public abstract class Forms2D implements ItemListener, ActionListener, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1713682929136814987L;
	protected Dialog dialog;//ok
	protected Color color;//ok
	protected int dim;//nombre de pixels
	protected Point pt1, pt2;//ok
	//protected Rectangle rect;
	//protected Point2D.Double pt;
		
	public Forms2D(Color color, Point p1, Point p2){
		
	}
	
	//Le role de cette methode est d appeler les commandes de trace
	//du contexte graphique g, dimension = nombre de pixels
	public abstract void draw(Graphics g, int dimension);//ok
	public abstract double distance(Point p);//ok mesurer la distance d�un point � celle-ci.
	public abstract void translate(Point a, Point b);
	
	
}
