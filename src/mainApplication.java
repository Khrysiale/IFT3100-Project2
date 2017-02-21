
import Ui.App;
import Utils.Screen;

public class mainApplication {

	public static void main(String[] args) {
		Screen screen = new Screen();
		App ui = new App(screen.screenSize.getWidth(), screen.screenSize.getHeight());		

	}

}
