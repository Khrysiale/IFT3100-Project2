package Controller;

import java.io.IOException;


import Ui.App;
import Ui.UiListener;

public class Controller implements UiListener {
	
	private static App ui;
	
	
	public Controller(App ui){
		Controller.ui = ui;
		Controller.ui.addListener(this);
	}

	


	@Override
	public void onNewFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInit(float worksheetWidth, float worksheetHeight) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSaveFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onOpenFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExportFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExitApp() {
		ui.askSave();

	}

	@Override
	public void onSaveAs(String pathToSave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUndo() throws ClassNotFoundException, IOException {
		undo();
	}

	@Override
	public void onRedo() throws ClassNotFoundException, IOException {
		redo();
		
	}


	public void undo() throws ClassNotFoundException, IOException {

	}


	public void redo() throws ClassNotFoundException, IOException{
		// TODO Auto-generated method stub

	}

}
