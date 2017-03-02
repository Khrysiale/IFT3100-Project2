package Utils;

import java.awt.Color;

/**
 * Encodage d'information des elements en Color pour la selection
 * dans le back buffer.
 * 
 * Sur 24 bits (on ne peut utiliser le alpha sinon la selection ne fonctionnera pas):
 * 
 * [ 3210 0000 | 0000 0000 0000 0000 ]
 *   (0)  (1)            (2)
 * 
 * (1) :
 * 	   Indice de la sortie (max. 16) si (0:1) == 1, sinon ignorer ce champ.
 * 
 * (2) :
 *     Le id de l'element (maximum 2^16 elements disponibles).
 *     
 * Si la valeur est 0xffffffff, alors on considere qu'aucun element n'a ete selectionne.
 * 
 */
public class ColorIdMapper {

	private int id;
	private int index;
	private boolean isExit;
	private boolean isEntry;
	private boolean isArrow;
	private boolean isHandle;
	private boolean hit;
	
	public ColorIdMapper(int color) {
		int r = (color & 0xff0000) >> 16;
		index = r & 0x0f;
		id = (color & 0x0000ff00) | (color & 0x000000ff);
		hit = id != 0xffff ? true : false;
	}
	
	public int getId() {
		return id;
	}

	public int getIndex() {
		return index;
	}

	public boolean isExit() {
		return isExit;
	}

	public boolean isEntry() {
		return isEntry;
	}

	public boolean isArrow() {
		return isArrow;
	}

	public boolean isHandle() {
		return isHandle;
	}
	
	public boolean isHit() {
		return hit;
	}
	
	
	public boolean hasChanged(ColorIdMapper mapper) {
		if (
			id != mapper.getId() ||index != mapper.getIndex()) {
			return true;
		}
		return false;
	}

	/**
	 * Encode un element en une couleur pour la selection avec le back buffer.
	 * @param id
	 * @param index
	 * @return
	 */
	public static Color idToColor(int id,int index) {
		int r = (index & 0x0f);
		return new Color(r,(id & 0xff00) >> 8, (id & 0x00ff));
	}
}