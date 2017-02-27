/**
 * @author Sandra
 * @param 
 *
 * precondtion: le fichier image doit �tre sauvegarde dans le package data
 */

package Images;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

//import ImageBuffer;

public class Images {
	
	//variables privees
	private PApplet parent;
	private int width;
	private int height;

	
		
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

	public PImage imageImport(String pFileName){

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

	
	/* param [in] 2 fichiers image
	 * les 2 images doivent avoir le meme size
	 * image 2 est en niveau de gris
	 * retourne image masquee par une autre image
	 * */
	public PImage imageMask(PImage img1, PImage img2){
		PImage image1 = img1;
		PImage maskImage = img2;
		
		maskImage.resize(image1.width, image1.height);
		maskImage.filter(PConstants.GRAY);
		image1.mask(maskImage);
		parent.image(image1,0,0);
		return image1;
	}


	//void imageTint(String){
	//	parent.tint(pTint);
	//}

};
