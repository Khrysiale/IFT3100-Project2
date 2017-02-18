import Controller.Controller;
import Ui.App;
import Utils.Screen;

public class main {

	public static void main(String[] args) {
		Screen screen = new Screen();
		App ui = new App(screen.screenSize.getWidth(), screen.screenSize.getHeight());
		Controller controller = new Controller(ui);
		

	}

}
