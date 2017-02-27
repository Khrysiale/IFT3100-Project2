
import Ui.App;
import Utils.Screen;
import processing.core.PApplet;


public class mainApplication extends PApplet{//public class Sankhrys extends PApplet{
	App app;

	
	public static void main(String[] args) {
		PApplet.main("mainApplication");
	}
	
	public void settings(){
		Screen screen = new Screen();
		size(1024,968);
	}
	
	public void setup(){		
		app = new App(this);		
	}
	
	public void draw(){
		app.display();
	}


}
