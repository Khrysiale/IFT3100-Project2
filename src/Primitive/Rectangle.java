package Primitive;

import processing.core.PApplet;

public class Rectangle {
	
	private int w ;
	private int h ;
	private int x;
	private int y ;
	
	public Rectangle(int width, int height, int posX, int posY){
		w = width;
		h = height;
		x = posX;
		y = posY;
		
	}
	
	public void render(PApplet p){
		p.strokeWeight(2);
		p.rect(x,y , w, h);
	}

}
