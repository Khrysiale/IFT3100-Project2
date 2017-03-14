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
public class Drawable2D extends LinkedList{
	
	private int dimension = 0;
	//Point position1;
	//Point position2;
	//Forms2D fig;
	
	public static LinkedList<Forms2D> figures = new LinkedList();//ok
	
	
	public static void add(Forms2D f) {//ok
		figures.add(f);
	}

	public static void remove(Forms2D f) {//ok
		figures.remove(f);
	}
	
	public static Forms2D plusProche(Point p){//ok
		return null;
		
	}
	
	public static void drawAll(Graphics g, double dimension){//ok
		
	}

	public void clear() {
		figures.clear();
	}
	
}
