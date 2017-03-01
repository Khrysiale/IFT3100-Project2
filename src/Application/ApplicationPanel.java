package Application;



import java.awt.BorderLayout;

import processing.core.PApplet;

import Primitive.Polygon;

public class ApplicationPanel extends PApplet{
	
	private int width,height, myX, myY, myShift;
	private boolean myRunningStatus;
	
	
	
	public ApplicationPanel(int w, int h){
		width= w;
		height = h;
		
		myRunningStatus = true;
	}
	@Override
	public void setup(){
		size(width, height);
		smooth();
	}
	
	public void mousePressed() {
		
		}
	@Override
	public void draw() {
	
	}
	
	public void init(){
		
	}
	
	
	
	public void setRunning(boolean status) {
		myRunningStatus = status;
		}	
}
