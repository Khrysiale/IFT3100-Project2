package Ui;

import javax.swing.JFrame;

import Images.Images;
import processing.core.PApplet;

public class App  {
	
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
		p.size(200, 200);

	}
	
	public void draw(){
			
	}
	
	public void display(){
		p.fill(255,100);
		//p.rect(100, 100, 100, p.height);
		img = new Images(p);
		p.image(img.ImageImport("https://us.123rf.com/450wm/mettus/mettus1312/mettus131200502/24740422-lettre-s-dans-l-illustration-d-incendie.jpg?ver=6"), 50, 50);
	}

	public void run(){
		
	}
	
	
}