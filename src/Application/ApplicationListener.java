package Application;

public interface ApplicationListener {

	void onInit(float worksheetWidth, float worksheetHeight);

	void onEllipse();

	void onCircle();

	void onTriangle();

	void onNewFile();

	void onOpen();

	void onSave();

	void onSaveAs();

	void onImportImage();

	void onExportImage();

	void onQuit();

	void onDelete();

	void onPaint();

	void onUndo();

	void onRedo();

	void onColorMode();

	void onDraw();

	void onSquare();

	void onPentagone();

	void onHexagone();

	void onQuad();

	void onRectangle();

}
