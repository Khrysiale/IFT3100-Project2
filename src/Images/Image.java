package Images;
/**
 * 
 */


import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShapeSVG;

/**
 * @author Sandra
 *
 */

public class Image extends PApplet{
	//variables privees
	private String m_fileName;
	private int m_width;
	private int m_height;
	private color c;
	
	
	//Constructeur par defaut
	public Image(){
		m_width = 512;
		m_height = 512;
		m_fileName = "";
	}
	
	//Constructeur avec parametres
 	public Image(String pFileName, int pwidth, int pHeight) {
		m_fileName = pFileName;
		m_width = pwidth;
		m_height = pHeight;
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
	public void Import(String pFileName){
		String fileName = getFileName();
		PImage img = loadImage(fileName);
		image(img, 0, 0);
	}
	
	public void Export(){
		
	}
	
	void espaceCouleur(){
		colorMode(HSB, 360, 100, 100);	//teinte, saturation, luminosite
	}
	
	void masquer(){
		this.mask(this);
	}
	
	void teinter(){
		tint(255, 0, 0, 255);

	}
	

}
