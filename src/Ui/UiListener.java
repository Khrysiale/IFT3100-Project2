package Ui;



public interface UiListener {

	

	void onNewFile();

	void onInit(float worksheetWidth, float worksheetHeight);

	void onSaveFile();

	void onOpenFile();

	void onExportFile();

	void onExitApp();

	void onSaveAs(String pathToSave);

	void onUndo() ;

	void onRedo() ;

}
