package Model;

import Utils.Transform;

public abstract class AreaElement {
	
	private int id;
	private Area parent;
	private Transform transform;

	public AreaElement(Area parent, int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.parent = parent;
		this.transform = new Transform();
	}
	
	public int getId() {
		return id;
	}

	public Area getParent() {
		return parent;
	}

	public Transform getTransform() {
		return transform;
	}


}
