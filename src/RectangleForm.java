
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class RectangleForm extends Figure{

	public RectangleForm(Color color, Point pos, Dimension dim) {
		super(color, pos, dim);
		// TODO Auto-generated constructor stub
	}


	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		g.fillRect(rect.x, rect.y, rect.height, rect.width);
		g.setColor(c);
	}


	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double distance(Point p) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void draw(Graphics g, int échelle) {
		// TODO Auto-generated method stub
		
	}

}