/**
 * 
 */
package Model;

/**
 * @author Sandra
 *
 */

public class Image extends PApplet{
	//variables privees
	private String m_fileName;
	private int m_weight;
	private int m_height;
	
	//Constructeur par défaut
	public Image(){
		m_weight = 512;
		m_height = 512;
		m_fileName = "";
	}
	
	//Constructeur avec paramètres
 	public Image(String pFileName, int pWeight, int pHeight, ) {
		m_fileName = pFileName;
		m_weight = pWeight;
		m_height = pHeight;
	}        
	
	//*************   ACCESSEURS *************
	//Retourne le nom du fichier image
	public String getFileName() {  
		return m_fileName;
	}

  	//Retourne la largeur du fichier image
	public int getWeight() {
		return m_weight;
	}
   
  	// Retourne la hauteur du fichier image
	public int getHeight() {
		return m_height;
	} 

	//*************   MUTATEURS   *************
	
	//Définit le nom du fichier image
	public void setName(String pFileName) {
		m_fileName = pFileName;
	}

	//Définit la largeur du fichier image
	public void setWeight(int pWeight) {
	    m_weight = pWeight;
	}

	//Définit la largeur du fichier image
	public void setHeight(int pHeight) {
	    m_height = pHeight;
	}
	
	//*************   METHODES   *************
	Import(String pNom){};
	Export(){};
	ColorSpace(){};
	Treatment(){};

}
