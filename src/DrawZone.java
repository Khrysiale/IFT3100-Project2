import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	
	public static final int ladder = 0;//ok  -> échelle ce n'est pas une dimension. et dimension est un mot clé de java awt
	
	private Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
	Point pt1;
	Point pt2;
	private Forms2D dessin;//nouveau
			
	public DrawZone(){//ok
		super();
		Drawable2D drawing = new Drawable2D(ladder, pt1, pt1);//???
		this.addMouseListener(this);//nouveau (jcomprend pas pourquoi on passe this on a déclarer aucun mouseListerner
		//ButtonBar bb;
	}		
	
	public void paint(Graphics g) {//ok
		super.paint(g);
		/*for (Iterator iter = this.iterator(); iter.hasNext();) {
			Forms2D d = (Forms2D) iter.next();
			d.draw(g, dimension);	
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
		pt1 = e.getPoint();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		pt2 = e.getPoint();
		
	}
	
		
	
	
	

	
}
