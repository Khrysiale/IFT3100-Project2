package Primitive;

import processing.core.PApplet;

public class Polygon {
	
	private String name;
	int w,h,x,y;
	Rectangle rectangle;
	
	public Polygon(String s, int width, int height, int posX, int posY){
		name = s;
		w = width;
		h = height;
		x = posX;
		y = posY;
		
		switch (name){
		
		case "rectangle":
			rectangle = new Rectangle(w,h,x,y);
			break;
		case "square":
			break;
		case "triangle":
			break;
		case "pentagone":
			break;
		case "hexagonee":
			break;
			
		}
		
	}

	public void render (PApplet p){
		rectangle.render(p);
	}
	
	
	
	

}
