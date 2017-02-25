package Ui;

import javax.swing.JFrame;

import processing.core.PApplet;

public class App {
	
	 PApplet p; 
	
	//other variable
	int screenWidth ;
	int screenHeight ;
	
	JFrame frame;
	

	public App(PApplet parent){
		p= parent;
		p.text("test", 10, 30);
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
		//fill(255);
	}
	
	public void display(){
		
	}
	
	public void run(){
		
	}
	
	
}