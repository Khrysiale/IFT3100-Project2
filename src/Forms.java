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

//dont derive toutes les formes
public abstract class Forms implements Drawable, ItemListener, ActionListener{
	
	protected Dialog dialog;
	protected Color color;
	protected int dim;//nombre de pixels
	//protected Rectangle rect;
	//protected Point2D.Double pt;
	
	
	
	public Figure(Color color, Point pos){
		
	}
	
	//Le rôle de cette méthode est d’appeler les commandes de tracé
	//du contexte graphique g
	public abstract void draw(Graphics g);
	public abstract double distance(Point p);
	
	
	

	
	

}
