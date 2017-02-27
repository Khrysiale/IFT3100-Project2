package Ui;

import processing.core.PApplet;

public class Menu {

	PApplet p;
	String titre;
	boolean rectOver = false;
	boolean rectClicked = false;
	int rectX, rectY;
	

	public Menu(PApplet parent, String name, int posX, int posY){
		p = parent;
		titre = name;
		rectX = posX;
		rectY = posY;
	}

	void setup() {
		
	}

	void display() {
		
		p.fill(235);		 
		p.stroke(255);
		p.rect(rectX, rectY, 50, 15);
		p.fill(0);
		p.text(titre, rectX+5,10);
	}

}
