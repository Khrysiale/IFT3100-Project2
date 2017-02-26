/**
 * @author Sandra
 * @param 
 *
 */

package Images;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShapeSVG;
//import ImageBuffer;

public class Images {
	
	//variables privees
	private PApplet parent;
	private String fileName;
	private int width;
	private int height;
//	private int color;	
	
		
	//Constructeur avec parametres
 	public Images(PApplet p, String pFileName) {
		fileName = pFileName;
		width = 0;
		height = 0;
		parent = p;
		
		
 	}
 	
 	public void setup(){
 		parent.size(512, 512);
 		parent.background(255);
 		//parent.colorMode(HSB, 360, 100, 100);	//teinte, saturation, luminosite
 				
 	}
 	
 	
 	public void draw(){
 		PImage img = imageImport(fileName);
 		parent.imageMode(parent.CENTER);
 		parent.image(img, width/2, height/2, width/2, height/2);
 	}
 	
	//*************   ACCESSEURS *************
	//Retourne le nom du fichier image
	public String getFileName() {  
		return fileName;
	}

  	//Retourne la largeur du fichier image
	public int getWidth() {
		return width;
	}
   
  	// Retourne la hauteur du fichier image
	public int getHeight() {
		return height;
	} 

	//*************   MUTATEURS   *************
	
	//Definit le nom du fichier image
	public void setName(String pFileName) {
		fileName = pFileName;
	}

	//Definit la largeur du fichier image
	public void setwidth(int pWidth) {
		width = pWidth;
	}

	//Definit la largeur du fichier image
	public void setHeight(int pHeight) {
	    height = pHeight;
	}
	
	//*************   METHODES   *************

	public PImage imageImport(String pFileName){
		PImage image = parent.loadImage(pFileName);
				
		//parent.imageMode(CENTER);
		//parent.image(img, width/2, height/2, b.width, b.height);
		
		return image;
	}
	
	public void imageExport(String pFileName){
		parent.saveFrame("pFileName"); 
	}
	
	/*void espaceCouleur(){
		colorMode(HSB, 360, 100, 100);	//teinte, saturation, luminosite
	}*/
	
	void imageMask(PImage pImg){
		parent.mask(pImg);
	}
	

	void imageTint(int pTint, int pColorMode){
		parent.colorMode(pColorMode);
		parent.tint(pTint);
	}

};
