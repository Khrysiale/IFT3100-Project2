package Model.Primitives.Polygon;

import java.util.Random;

import Model.Area;
import Model.CollectionElement;
import Utils.AbsColor;

public class Rectangle extends CollectionElement {
	
	private int id;
	public String name;
	public float width;
	public float height;
	private AbsColor color;
	public boolean overflow;
	
	
	public Rectangle(Area parent, int id){
		super(parent,id);
		
		this.name = "Rectangle_" + id;
		this.overflow = false;
		
		this.width = 5.0f;
		this.height = 5.0f;
		this.color = new AbsColor(
			(new Random()).nextInt(255),
			(new Random()).nextInt(255),
			(new Random()).nextInt(255));
		
	}

}
