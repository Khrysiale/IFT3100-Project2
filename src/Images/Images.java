/**
 * @author Sandra
 * @param 
 *
 */

package Images;

import processing.core.PApplet;
import processing.core.PImage;

//import ImageBuffer;

public class Images {
	
	//variables privees
	private PApplet parent;
	private String fileName;
	private int width;
	private int height;
	private PImage image;
		
	//Constructeur
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
 		image = ImageImport(fileName);
		if (image ==null) {
	      System.out.println ("failed");
		}		
 				
 	}
 	
 	
 	public void draw(){
 		parent.imageMode(parent.CENTER);
 		parent.image(image, width/2, height/2, width/2, height/2);
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

	public PImage ImageImport(String pFileName){
		
	PImage img = parent.loadImage(pFileName);
		//creer un buffer pour image importee
	//BufferedImage image = ImageIO.read(new File("pFileName"));
	
	//creer un nouveau buffer
	//BufferedImage source = new BufferedImage(512, 512, BufferedImage.TYPE_CUSTOM);											
	
	//sauvegarde le buffer vers un fichier image
	//ImageIO.write(image, "GIF", new File("winni.gif"));
	return img;
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
