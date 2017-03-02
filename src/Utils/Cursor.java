package Utils;


import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;


import javax.swing.ImageIcon;

public class Cursor {
	
	private int idCursor;
	
	public Cursor(int id){
		idCursor = id;
		switch(idCursor){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.getBestCursorSize(32, 32);
	    Image image = toolkit.getImage(getClass().getResource("pencil.gif"));
	    Point hotspot = new Point(0,0);
	    java.awt.Cursor cursor = toolkit.createCustomCursor(image, new Point(0, 0), "Pencil");
	    setCursor(cursor);
	}

	private void setCursor(java.awt.Cursor cursor) {
		// TODO Auto-generated method stub
		
	}
	

}
