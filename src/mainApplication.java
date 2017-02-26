
import Ui.App;
import Utils.Screen;
import processing.core.PApplet;


public class mainApplication extends PApplet{

	public static void main(String[] args) {
		PApplet.main("mainApplication");
	}
	
	public void settings(){
		Screen screen = new Screen();
		size((int)screen.screenSize.getWidth()/2,(int)screen.screenSize.getHeight()/2);
	}
	
	public void setup(){
		App ui = new App(this);
		
	}
	
	public void draw(){
		
	}

}
