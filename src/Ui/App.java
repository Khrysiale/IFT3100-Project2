package Ui;

import javax.swing.JFrame;

import Images.Images;
import processing.core.PApplet;

public class App {
	
	 PApplet p; 
	 
	 Images img ;
	
	//other variable
	int screenWidth ;
	int screenHeight ;
	
	JFrame frame;
	

	public App(PApplet parent){
		p = parent;
	}
	
	public void settings()
	{
	 /* frame =new JFrame("Controls");
	  frame.setBounds(0, 0,(int)(width/2), (int)(height-height/5));
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setTitle("Titre de notre projet");

	  

	  //Display the window.
	  frame.pack();
	  frame.setVisible(true);*/
	  
	}
	
	public void setup(){
		img = new Images(p, "https://3.bp.blogspot.com/-W__wiaHUjwI/Vt3Grd8df0I/AAAAAAAAA78/7xqUNj8ujtY/s1600/image02.png");
	}
	
	public void draw(){
		p.translate(50,50);
		img.draw();
	}
	
	public void display(){
		p.fill(255,100);
		p.rect(100, 100, 100, p.height);
		
	}
	
	public void run(){
		
	}
	
	
}