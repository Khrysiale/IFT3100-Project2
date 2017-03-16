import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JPanel;


//ZoneDessin
/*traite les evenements souris lies aux choix de dessin et choix mode*/

public class DrawZone extends JPanel implements MouseListener {//ok

	/**
	 * 
	 */
	private static final long serialVersionUID = 4183267487055896483L;
	//private JButton colorButton;//test	
	public static final int dimension = 0;//ok  -> échelle ce n'est pas une dimension. et dimension est un mot clé de java awt
	public String flag = "";
	private Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
	private Point pt1, pt2, pt3;
	private Forms2D drawing;//nouveau
	private Color couleur = Color.black;
	RectangleForm rectangle; 
	
			
	public DrawZone(){//ok
		super();
		Drawable2D drawing = new Drawable2D();//???
		this.addMouseListener(this);//nouveau (jcomprend pas pourquoi on passe this on a déclarer aucun mouseListerner
		//ButtonBar bb;
	}		
	
	public void paint(Graphics g) {//ok
		super.paint(g);
		/*for (Iterator iter = this.iterator(); iter.hasNext();) {
			Forms2D d = (Forms2D) iter.next();
			d.draw(g, ladder);	
		}*/
	}
	
	public void currentMode(){
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
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
		if(flag.equals("rectangle")) {
			pt1 = e.getPoint();
			//liste.add(new Point2D.Double(pt1));
            System.out.println("premier point" + pt1);
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
		if (flag.equals("rect_draw")) {
			pt2 = e.getPoint();
			rectangle = new RectangleForm(couleur, pt1, pt2);
            Drawable2D.add(rectangle);
            repaint(); }
	}	
		
	
	
	

	
}
