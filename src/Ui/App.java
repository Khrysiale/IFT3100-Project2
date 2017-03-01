package Ui;

import javax.swing.JFrame;

import Images.Images;
import processing.core.PApplet;
import processing.core.PImage;

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
		p.size(512, 512);
		
	}
	
	public void draw(){
		
			
	}
	
	public void display(){
		p.fill(255,100);
		//p.rect(100, 100, 100, p.height);
		
		/*importer une image
		//img = new Images(p);
		//p.image(img.ImageImport("https://us.123rf.com/450wm/mettus/mettus1312/mettus131200502/24740422-lettre-s-dans-l-illustration-d-incendie.jpg?ver=6"), 50, 50);
		//p.image(img.imageImport("data/winni.png"), 50, 50);*//// BON
	
		//appliquer mask sur image
		/*img = new Images(p);
		PImage img1 = img.imageImport("data/Gorille.jpg");
		PImage img2 = img.imageImport("data/canard.jpg");
		PImage img3 = img.imageMask(img1, img2);
		p.image(img3, 50, 50);*//////BON
		//p.image(img.imageMask(img, img), 50, 50);?????
		
		//exporter une image//////marche pas
		//PImage img1 = img.imageImport("data/Gorille.jpg");
		//img.imageExport(img1, "../workspace/IFT3100-Project2/src/data/singe.png");
		//img1.save("singe.png");
		
	}

	public void run(){
		
	}
	
	
}