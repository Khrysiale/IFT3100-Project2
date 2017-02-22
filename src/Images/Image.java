/**
 * @author Sandra
 * @param 
 *
 */

package Images;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShapeSVG;



public class Images extends PApplet{
	//variables privees
	private String m_fileName;
	private int m_width;
	private int m_height;
	private int m_c;	//couleur
	//private String m_colorSpace = "HSB";	//teinte, saturation, luminosite
	
	
	/*//Constructeur par defaut
	public Images(){
		m_width = 512;
		m_height = 512;
		m_fileName = "";
	}*/
	
	//Constructeur avec parametres
 	public Images(String pFileName) {
		m_fileName = pFileName;
		m_width = width;
		m_height = height;
		//m_colorSpace = "HSB";
		importImage(pFileName);
	}        
	
	//*************   ACCESSEURS *************
	//Retourne le nom du fichier image
	public String getFileName() {  
		return m_fileName;
	}

  	//Retourne la largeur du fichier image
	public int getWidth() {
		return m_width;
	}
   
  	// Retourne la hauteur du fichier image
	public int getHeight() {
		return m_height;
	} 

	//*************   MUTATEURS   *************
	
	//Definit le nom du fichier image
	public void setName(String pFileName) {
		m_fileName = pFileName;
	}

	//Definit la largeur du fichier image
	public void setwidth(int pWidth) {
		m_width = pWidth;
	}

	//Definit la largeur du fichier image
	public void setHeight(int pHeight) {
	    m_height = pHeight;
	}
	
	//*************   METHODES   *************
	public void importImage(String pFileName){
		String fileName = getFileName();
		PImage img = loadImage(pFileName);
		image(img, 0, 0);
	}
	
	public void exportImage(String pFileName){
		saveFrame("pFileName"); 
	}
	
	/*void espaceCouleur(){
		colorMode(HSB, 360, 100, 100);	//teinte, saturation, luminosite
	}*/
	
	void maskImage(PImage pImg){
		this.mask(pImg);
	}
	

	void tintImage(int pTint, int, int){
		colorMode(HSB);
		tint(255, 0, 0, 255);

	}
}
