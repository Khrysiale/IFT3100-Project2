package Ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class Sketch extends JPanel implements MouseWheelListener, MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6348456417231079808L;
	private final int WORKSHEET_WIDTH = 50;
	private final int WORKSHEET_HEIGHT = 50;
	
	public Sketch(App ui, SketcheListener listener){
		
	}
	
	
	public int getWORKSHEET_HEIGHT() {
		return WORKSHEET_HEIGHT;
	}
	public int getWORKSHEET_WIDTH() {
		return WORKSHEET_WIDTH;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}
}
