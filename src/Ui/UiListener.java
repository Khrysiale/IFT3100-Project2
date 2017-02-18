package Ui;

import java.io.IOException;

public interface UiListener {

	

	void onNewFile();

	void onInit(float worksheetWidth, float worksheetHeight);

	void onSaveFile();

	void onOpenFile();

	void onExportFile();

	void onExitApp();

	void onSaveAs(String pathToSave);

	void onUndo() throws ClassNotFoundException, IOException;

	void onRedo() throws ClassNotFoundException, IOException;

}
