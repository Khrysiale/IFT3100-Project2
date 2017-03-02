package Application;

import java.awt.Graphics2D;

import Utils.Transform;

public abstract class Element {
	
	private int id;
	private DrawArea parent;
	private Transform transform;
	
	public Element(DrawArea parent, int id){
		this.id = id;
		this.parent = parent;
		this.transform = transform;
	}
	
	public int getId(){
		return id;
	}
	
	public DrawArea getParent(){
		return parent;
	}
	
	public Transform getTransform() {
		return transform;
	}
	
	public void drawSelectableAreas(Graphics2D g2d,Transform transform) {
		// Override si l'element dessiner doit repondre au evenement souris.
	}
	
	public void drawSelected(Graphics2D g2d) {
		// Override si l'element peut etre selectionne par l'utilisateur.
	}
	
	public abstract void draw(Graphics2D g2d);
	
	public boolean clicked(DrawSpaceEvent ev, DrawAreaListener listener) {
		System.out.println("Element::clicked()");
		return false;
	}

}
