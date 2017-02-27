package Ui;

import java.awt.Button;

import javax.swing.JFrame;

import Images.Images;
import processing.core.PApplet;


public class App {
	
	
	Images img ;	
	
	PApplet p;
	JFrame frame;
	

	public App(PApplet parent){
		p = parent;
	}
	
		
	
	public void display(){
		Menu[] menuList = new Menu[10];
		
		Menu file = new Menu(p,"Fichier", 0, 0);		
		menuList[1] = file;		
		
		Menu edit = new Menu(p, "Éditer", 60,0);
		menuList[2] = edit;
		
		Menu tool = new Menu(p, "Outils",120,0);
		menuList[3] = tool;
		
		
		for(int i = 0; i < menuList.length; i++){
			menuList[i].display();
			
		}
		
		
		
		/*p.fill(255,100);		
		img = new Images(p);
		p.image(img.ImageImport("data/winni.png"), 50, 50);*/
	}
	
	
}