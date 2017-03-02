import Application.ApplicationController;
import Application.ApplicationUi;

public class main {

	public static void main(String[] args) {
		ApplicationUi ui = new ApplicationUi();
		ApplicationController controller = new ApplicationController(ui);
		
	}

}
