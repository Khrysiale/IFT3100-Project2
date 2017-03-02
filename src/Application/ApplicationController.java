package Application;

import java.util.ArrayList;

import Model.Area;

public class ApplicationController implements ApplicationListener{
	
	
	private static ApplicationUi ui;
	private Area area;
	private int selectedId;
	private int selectedIdIndex;
	private static ArrayList<byte[]> maByteArray = new ArrayList<byte[]>();
	private static int current;

	public ApplicationController(ApplicationUi ui) {
		ApplicationController.ui = ui;
		this.area = new Area();
		ApplicationController.ui.addListener(this);
		this.selectedId = -1;
		this.selectedIdIndex = -1;
		initCurrent();
	}

	private void initCurrent() {
			current = 0;
			ui.setCurrentUndoRedo(current, maByteArray.size());
		
	}

	@Override
	public void onInit(float worksheetWidth, float worksheetHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEllipse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCircle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTriangle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNewFile() {
		this.area = new Area();
		buildView();
				
	}

	private void buildView() {
		ui.clearAll();
		
		//Area
		this.area = new Area();
		
		
		
	}

	@Override
	public void onOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onImportImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onExportImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onQuit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPaint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUndo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRedo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onColorMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSquare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPentagone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onHexagone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onQuad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRectangle() {
		// TODO Auto-generated method stub
		
	}

}
