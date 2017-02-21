package Ui;

import javax.swing.JFrame;

import processing.core.PApplet;

public class App extends PApplet{
	
	//other variable
	int screenWidth ;
	int screenHeight ;
	
	
	

	public App(double width, double height){
		screenWidth = (int) width;
		screenHeight = (int) height;
		
		

	}
	
	public void setup()
	{
	  size(screenWidth, screenHeight);
	  JFrame frame =new JFrame("Controls");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  

	  //Display the window.
	  frame.pack();
	  frame.setVisible(true);
	}
}