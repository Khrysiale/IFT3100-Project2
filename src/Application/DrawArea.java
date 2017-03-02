package Application;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

import Utils.ColorIdMapper;
import Utils.Transform;
import Utils.Tuple2;
import Utils.Vec2;

public class DrawArea extends JPanel implements MouseWheelListener, MouseListener, MouseMotionListener{
	
	private final int WORKSHEET_WIDTH = 50;
	private final int WORKSHEET_HEIGHT = 50;
	
	private final int MOUSE_STATE_NONE = 0;
	private final int MOUSE_STATE_MOVING_CAMERA = 1;
	private final int MOUSE_STATE_DRAGGING_ELEMENT = 2;
	
	private DrawAreaListener listener;
	private List<Element> elements;
	
	private Transform cameraTransform;
	private Transform screenTransform;
	private ColorIdMapper selected;
	private ColorIdMapper activeElementMapper;
	private Map<Integer,Element> idMap;
	private BufferedImage backBuffer;
	private int state = MOUSE_STATE_NONE;
	private Tuple2<Integer,Integer> mouseLastPos;
	
	public DrawArea(ApplicationUi app, DrawAreaListener listerner){
		this.listener = listener;
		backBuffer = null;
		selected = null;
		activeElementMapper = null;
		
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
	
	private int getScreenWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	public Vec2 screenToWorld(int x, int y) {
		float tx = (x - cameraTransform.getTranslate().x) * 1.0f/(screenTransform.getScale() * cameraTransform.getScale());
		float ty = (y - cameraTransform.getTranslate().y) * 1.0f/(screenTransform.getScale() * cameraTransform.getScale());
		return new Vec2(tx,ty);
	}

	public float  getWorksheetWidth() {
		// TODO Auto-generated method stub
		return (float)WORKSHEET_WIDTH;
	}

	public float getWorksheetHeight() {
		// TODO Auto-generated method stub
		return (float)WORKSHEET_HEIGHT;
	}

	public void clearAll() {
		this.elements = new ArrayList<Element>();
		this.idMap = new HashMap<Integer,Element>();
		backBuffer = null;
		selected = null;
		activeElementMapper = null;
		state = MOUSE_STATE_NONE;
		activeElementMapper = null;		
		mouseLastPos = null;
		
		
	}

}
