import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JPanel;

//ZoneDessin
/*traite les evenements souris lies aux choix de dessin et choix mode*/

public class DrawZone extends JPanel implements MouseListener {//ok

	//private JButton colorButton;//test	
	public static final int dimension = 0;//ok
	Point pt1;
	Point pt2;
	private Forms2D dessin;//nouveau
			
	public DrawZone(){//ok
		super();
		Drawable2D dessin;//???
		this.addMouseListener(this);//nouveau
		//ButtonBar bb;
	}		
	
	public void paint(Graphics g) {//ok
		super.paint(g);
		/*for (Iterator iter = this.iterator(); iter.hasNext();) {
			Forms2D d = (Forms2D) iter.next();
			d.draw(g, dimension);	
		}*/
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
