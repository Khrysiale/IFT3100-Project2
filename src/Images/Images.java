/**
 * @author Sandra
 * @param 
 *
 * precondtion: le fichier image doit être sauvegarde dans le package data
 */

package Images;

import processing.core.PApplet;
import processing.core.PImage;

//import ImageBuffer;

public class Images {
	
	//variables privees
	private PApplet parent;
	private int width;
	private int height;
	private PImage image;
		
	//Constructeur
 	public Images(PApplet p) {
		
		width = 0;
		height = 0;
		parent = p;
 	}
 	
 	
	//*************   ACCESSEURS *************
	

  	//Retourne la largeur du fichier image
	public int getWidth() {
		return width;
	}
   
  	// Retourne la hauteur du fichier image
	public int getHeight() {
		return height;
	} 

	//*************   MUTATEURS   *************
	
	

	//Definit la largeur du fichier image
	public void setwidth(int pWidth) {
		width = pWidth;
	}

	//Definit la largeur du fichier image
	public void setHeight(int pHeight) {
		height = pHeight;
	}

	//*************   METHODES   *************

	public PImage ImageImport(String pFileName){

		PImage image = new PImage(); 
		image = parent.loadImage(pFileName);
		if (image ==null) {
			System.out.println ("failed");
		}		
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
