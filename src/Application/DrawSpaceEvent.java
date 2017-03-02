package Application;

import java.awt.event.MouseEvent;

import Utils.Vec2;

public class DrawSpaceEvent {
	
	private int button;
	private Vec2 coords;
	
	public DrawSpaceEvent(DrawArea area, MouseEvent ev) {
		coords = area.screenToWorld(ev.getX(),ev.getY());
		button = ev.getButton();
	}

	public int getButton() {
		return button;
	}

	public Vec2 getCoords() {
		return coords;
	}

}
