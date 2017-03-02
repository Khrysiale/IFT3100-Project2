package Application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import processing.core.PApplet;


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Utils.Screen;

public class ApplicationUi extends JFrame implements ActionListener, KeyEventDispatcher, DrawAreaListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int selectedId;
	int selectedIdIndex;
	private DrawArea area;
	private ApplicationListener listener;
	
	private JButton btnRectangle;
	private JButton btnSquare;
	private JButton btnTriangle;
	private JButton btnPentagone;
	private JButton btnHexagone;
	private JButton btnQuad;
	private JButton btnCircle;
	private JButton btnEllipse;
	
	
	
	private JMenu File;
	private JMenuItem NewFile;
	private JMenuItem Open;
	private JMenuItem Save;
	private JMenuItem SaveAs;
	private JMenuItem ExportImage;
	private JMenuItem ImportImage;
	private JMenuItem Quit;
	
	private JMenu Edit;
	private JMenuItem undo;
	private JMenuItem redo;
	private JMenuItem delete;
	
	
	private JMenu Tools;
	private JMenuItem paint;
	private JMenuItem draw;
	private JMenuItem transform;
	private JMenuItem colorMode;


	private JPanel WorkFrame;
	private JPanel MidFrame;
	private JPanel bottom;
	private JPanel leftFrame;

	//Panneau de Gauche
	private GridBagConstraints gbc_LeftFrame;
	private GridBagLayout gbl_LeftFrame;
	


	private JTextArea botTextArea;


	JFrame frameMain;


	private int getScreenWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}




	public ApplicationUi(){

		initialize();
		frameMain.setVisible(true);
		selectedId = -1;
		selectedIdIndex = -1;
	}
	private void initialize() {
		/*MainWindow*/
		frameMain = new JFrame();
		frameMain.setBounds(100, 100, 1024, 768);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setTitle("Infographie - SanKhrys Project");

		//Initialisation du layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {187, 0, 0};
		gridBagLayout.rowHeights = new int[] {416, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frameMain.getContentPane().setLayout(gridBagLayout);
		
		
		/*EO MainWindow*/

		/*Menu du haut*/
		InitMenu();

		/*Menu de gauche*/
		InitLeft();

		/*Espace de travail*/
		InitWorkspace();

		/*Menu du bas*/
		InitBottom();

		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(this);

	}
	
	private JEditorPane createTextArea() {
		JEditorPane t = new JEditorPane();
		t.setEditable(false);
		t.setContentType("text/html");
		//t.setLineWrap(true);
		//t.setWrapStyleWord(true);
		return t;
	}



	private void InitBottom() {
		bottom = new JPanel();
		bottom.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_BotFrame = new GridBagConstraints();
		gbc_BotFrame.fill = GridBagConstraints.BOTH;
		gbc_BotFrame.gridx = 0;
		gbc_BotFrame.gridy = 1;
		WorkFrame.add(bottom, gbc_BotFrame);
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		
		botTextArea = new JTextArea();
		botTextArea.setEditable(false);
		botTextArea.setLineWrap(true);
		botTextArea.setWrapStyleWord(true);
		
		JScrollPane ScrollBot = new JScrollPane(botTextArea);
		ScrollBot.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		bottom.add(ScrollBot);
		
		
	}




	private void InitWorkspace() {
		WorkFrame = new JPanel();
		WorkFrame.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Espace de dessin", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_WorkFrame = new GridBagConstraints();
		gbc_WorkFrame.fill = GridBagConstraints.BOTH;
		gbc_WorkFrame.gridx = 1;
		gbc_WorkFrame.gridy = 0;
		frameMain.getContentPane().add(WorkFrame, gbc_WorkFrame);
		GridBagLayout gbl_WorkFrame = new GridBagLayout();
		gbl_WorkFrame.columnWidths = new int[]{0, 0};
		gbl_WorkFrame.rowHeights = new int[]{532, 154, 0};
		gbl_WorkFrame.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_WorkFrame.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		WorkFrame.setLayout(gbl_WorkFrame);
		WorkFrame.setFocusable(true);

		//Plant Area
		area = new DrawArea(this,this);
		MidFrame = new JPanel();
		GridBagConstraints gbc_MidFrame = new GridBagConstraints();
		gbc_MidFrame.insets = new Insets(0, 0, 5, 0);
		gbc_MidFrame.fill = GridBagConstraints.BOTH;
		gbc_MidFrame.gridx = 0;
		gbc_MidFrame.gridy = 0;
		WorkFrame.add(MidFrame, gbc_MidFrame);
		MidFrame.setLayout(new BorderLayout(0, 0));
		MidFrame.add(area);
		
	}




	private void InitLeft() {
		leftFrame = new JPanel();
		leftFrame.setBorder(null);

		gbc_LeftFrame = new GridBagConstraints();
		gbc_LeftFrame.insets = new Insets(0, 0, 0, 5);
		gbc_LeftFrame.fill = GridBagConstraints.BOTH;
		gbc_LeftFrame.gridx = 0;
		gbc_LeftFrame.gridy = 0;
		frameMain.getContentPane().add(leftFrame, gbc_LeftFrame);

		//Layout
		gbl_LeftFrame = new GridBagLayout();
		gbl_LeftFrame.columnWidths = new int[]{153, 0};
		gbl_LeftFrame.rowHeights = new int[]{532, 179, 0};
		gbl_LeftFrame.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_LeftFrame.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		leftFrame.setLayout(gbl_LeftFrame);

		
		LeftFramePlant();

	}


	private void LeftFramePlant() {
		leftFrame.removeAll();
		frameMain.getContentPane().add(leftFrame, gbc_LeftFrame);
		leftFrame.setLayout(gbl_LeftFrame);
		
		//Usine(TOP)
		JPanel menuLeft = new JPanel();
		menuLeft.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Form and primitive", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		menuLeft.setLayout(null);
		GridBagConstraints gbc_menuLeft = new GridBagConstraints();
		gbc_menuLeft.fill = GridBagConstraints.BOTH;
		gbc_menuLeft.insets = new Insets(0, 0, 5, 0);
		gbc_menuLeft.gridx = 0;
		gbc_menuLeft.gridy = 0;
		leftFrame.add(menuLeft, gbc_menuLeft);

		btnRectangle = new JButton("Rectangle");
		btnRectangle.setBounds(10, 25, 162, 25);
		btnRectangle.setPreferredSize(new Dimension(120, 35));
		btnRectangle.addActionListener(this);
		menuLeft.add(btnRectangle);

		btnSquare = new JButton("Square");
		btnSquare.setBounds(10, 60, 162, 25);
		menuLeft.add(btnSquare);
		btnSquare.addActionListener(this);
		btnSquare.setPreferredSize(new Dimension(120, 35));
		
		btnTriangle = new JButton("Triangle");
		btnTriangle.setBounds(10, 95, 162, 25);
		menuLeft.add(btnTriangle);
		btnTriangle.addActionListener(this);
		btnTriangle.setPreferredSize(new Dimension(120 ,35));

		btnPentagone = new JButton("Pentagone");
		btnPentagone.setBounds(10, 130, 162, 25);
		menuLeft.add(btnPentagone);
		btnPentagone.addActionListener(this);
		btnPentagone.setPreferredSize(new Dimension(120 ,35));
		
		btnHexagone = new JButton("Hexagone");
		btnHexagone.setBounds(10, 165, 162, 25);
		menuLeft.add(btnHexagone);
		btnHexagone.addActionListener(this);
		btnHexagone.setPreferredSize(new Dimension(120, 35));
		
		btnQuad = new JButton("Quad");
		btnQuad.setBounds(10, 200, 162, 25);
		menuLeft.add(btnQuad);
		btnQuad.addActionListener(this);
		btnQuad.setPreferredSize(new Dimension(120, 35));

		btnCircle= new JButton("Circle");
		btnCircle.setBounds(10, 235, 162, 25);
		menuLeft.add(btnCircle);
		btnCircle.addActionListener(this);
		btnCircle.setPreferredSize(new Dimension(120, 35));
		
		btnEllipse= new JButton("Ellipse");
		btnEllipse.setBounds(10, 270, 162, 25);
		menuLeft.add(btnEllipse);
		btnEllipse.addActionListener(this);
		btnEllipse.setPreferredSize(new Dimension(120, 35));
	}




	/**
	 * Methode qui initialise la barre de menu en haut
	 */

	private void InitMenu() {
		BackgroundMenuBar menuBar = new BackgroundMenuBar();

		frameMain.setJMenuBar(menuBar);

		File = new JMenu("File");
		File.setBackground(UIManager.getColor("Button.background"));		
		menuBar.add(File);

		NewFile = new JMenuItem("NewFile");
		NewFile.setBackground(UIManager.getColor("Button.background"));
		NewFile.addActionListener(this);
		NewFile.setMnemonic('F');
		File.add(NewFile);

		Open = new JMenuItem("Open");
		Open.setBackground(UIManager.getColor("Button.background"));
		Open.addActionListener(this);
		Open.setMnemonic('O');
		File.add(Open);

		Save = new JMenuItem("Save");
		Save.setBackground(UIManager.getColor("Button.background"));
		Save.addActionListener(this);
		Save.setMnemonic('S');
		File.add(Save);

		SaveAs = new JMenuItem("Save as");
		SaveAs.setBackground(UIManager.getColor("Button.background"));
		SaveAs.addActionListener(this);
		SaveAs.setMnemonic('A');
		File.add(SaveAs);

		ExportImage = new JMenuItem("Exporter image");
		ExportImage.setBackground(UIManager.getColor("Button.background"));
		ExportImage.addActionListener(this);
		ExportImage.setMnemonic('E');
		File.add(ExportImage);
		
		ImportImage = new JMenuItem("Importer image");
		ImportImage.setBackground(UIManager.getColor("Button.background"));
		ImportImage.addActionListener(this);
		ImportImage.setMnemonic('I');
		File.add(ImportImage);

		Quit = new JMenuItem("Quit");
		Quit.setBackground(UIManager.getColor("Button.background"));
		Quit.setMnemonic('Q');
		Quit.addActionListener(this);
		File.add(Quit);

		Edit = new JMenu("Edit");
		Edit.setBackground(UIManager.getColor("ButtonBackground"));
		menuBar.add(Edit);
		
		undo = new JMenuItem("Undo");
		undo.addActionListener(this);
		undo.setMnemonic('U');
		redo = new JMenuItem("Redo");
		redo.addActionListener(this);
		redo.setMnemonic('R');
		delete = new JMenuItem("Delete");
		delete.setMnemonic('D');
		delete.addActionListener(this);
		Edit.add(undo);
		Edit.add(redo);
		Edit.add(delete);

		Tools = new JMenu("Tools");
		Tools.setBackground(UIManager.getColor("ButtonBackground"));
		menuBar.add(Tools);
		
		paint= new JMenuItem("Paint");
		paint.addActionListener(this);
		draw= new JMenuItem("Draw");
		draw.addActionListener(this);
		transform= new JMenuItem("Transform");
		transform.addActionListener(this);
		colorMode= new JMenuItem("Color Mode");
		colorMode.addActionListener(this);
		Tools.add(paint);
		Tools.add(draw);
		Tools.add(transform);
		Tools.add(colorMode);

		
		Component horizontalGlue = Box.createHorizontalGlue();
		menuBar.add(horizontalGlue);		
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		menuBar.add(horizontalStrut);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == NewFile){
			listener.onNewFile();			
		}else if(e.getSource() == Open){
			listener.onOpen();			
		}else if(e.getSource() == Save){
			listener.onSave();		
		}else if(e.getSource() == SaveAs){
			listener.onSaveAs();
		}else if(e.getSource() == ExportImage){
			listener.onExportImage();
		}else if(e.getSource() == ImportImage){
			listener.onImportImage();
		}else if(e.getSource() == Quit){
			listener.onQuit();
		}else if(e.getSource() == undo ){
			listener.onUndo();
		}else if(e.getSource() == redo){
			listener.onRedo();
		}else if(e.getSource() == delete){
			listener.onDelete();
		}else if(e.getSource() == paint){
			listener.onPaint();
		}else if(e.getSource() == draw){
			listener.onDraw();
		}else if(e.getSource() == colorMode){
			listener.onColorMode();
		}else if(e.getSource() == btnRectangle){
			listener.onRectangle();
		}
		else if(e.getSource() == btnSquare){
			listener.onSquare();
		}
		else if(e.getSource() == btnTriangle){
			listener.onTriangle();
		}
		else if(e.getSource() == btnPentagone){
			listener.onPentagone();
		}
		else if(e.getSource() == btnHexagone){
			listener.onHexagone();
		}
		else if(e.getSource() == btnQuad){
			listener.onQuad();
		}
		else if(e.getSource() == btnCircle){
			listener.onCircle();
		}
		else if(e.getSource() == btnEllipse){
			listener.onEllipse();
		}


	}



	public ApplicationListener getListener(){
		return this.listener;
	}
	
	public void addListener(ApplicationListener listener){
		this.listener = listener;
		this.listener.onInit(area.getWorksheetWidth(), area.getWorksheetHeight());
	}

	
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public void onInit(float worksheetWidth, float worksheetHeight) {
		// TODO Auto-generated method stub
		
	}




	public void setCurrentUndoRedo(int current, int size) {
		undo.setEnabled(current > 0);
		redo.setEnabled(current < size - 1);
		
	}




	public void clearAll() {
		area.clearAll();
		
	}


}
