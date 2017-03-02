package Utils;

import java.awt.Color;

public class AbsColor {
	
	public int r;
	public int g;
	public int b;
	
	public AbsColor(int r, int g, int b) {
		
		this.r = r;
		this.g = g;
		this.b = b;
		
	}
	
	public AbsColor(Color c){
		this.r = c.getRed();
		this.g = c.getGreen();
		this.b = c.getBlue();
	}
	
	
	public String toString() {
		return "" + r + "," + g + "," + b;
	}
	
	public Color toSwingColor(){
		Color c = new Color(r,g,b);
		return c;
		
	}

}
