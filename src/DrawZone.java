import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JPanel;

//ZoneDessin
/*traite les evenements souris lies aux choix de dessin et choix mode*/

public class DrawZone extends JPanel implements MouseListener {//ok

	public static final int dimension = 0;//ok
	//Point position1;
	//Point position2;
		
		
	public DrawZone(){//ok
		Drawable2D dessin;
		ButtonBar bb;
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
		
	
	
	

	
}
