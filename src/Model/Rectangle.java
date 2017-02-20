package Model;
import java.awt.Color;

import processing.core.PApplet;

public class Rectangle extends PApplet{
	
	private int width ;
	private int height;
	private Color color ;
	
	public Rectangle(int w, int h, Color c){
		
		width = w;
		height = h;
		color = c;
	}
	
	public void setup(){
		fill(color.getRGB());
		stroke(0);
		
	}
	
	public void draw(){
		rect(width/2,height/2, width, height);
	}

	public void settings(){
		size(50,50);
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
