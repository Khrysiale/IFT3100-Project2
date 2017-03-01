package Application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import processing.core.PApplet;


import javax.swing.*;
import Utils.Screen;

import Primitive.Polygon;

public class ApplicationController extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ApplicationPanel centerPanel;
	
	JFrame frameMain;
	
	//Create variable to set Menu
	private JMenu file;
	private JMenu edit;
	private JMenu tools;
	private JMenu help;
	private JMenuItem newFile;
	private JMenuItem openFile;
	private JMenuItem saveFile;
	private JMenuItem exportFile;
	private JMenuItem exportImage;
	private JMenuItem importImage;
	private JMenuItem exitApp;
	private JMenuItem undo;
	private JMenuItem redo;
	
	//create button
	JButton btnRectangle;

	//Create variable for the button
	private JButton btnUndo;
	private JButton btnRedo;

	//Create variable to configurage panel
	private BorderLayout back;
	private JPanel topPanel;
	private JPanel leftPanel;
	private JPanel rightPanel;
	private JPanel bottomPanel;
	private JPanel controlPanel;
	 	
	
	private JTextField myShiftField;
	private JButton myStartButton, myPauseButton;
	
	//other variable
	 int screenWidth =900;
	 int screenHeight =600;
	
	public ApplicationController(){
		Screen screen = new Screen();
		
		frameMain = new JFrame();
		frameMain.setBounds(screenWidth/2, screenHeight/2,screenWidth,screenHeight);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setTitle("Titre de notre projet");
		frameMain.setLayout(new GridLayout(3, 1));
		

		BackgroundMenuBar menuBar = new BackgroundMenuBar();
		frameMain.setJMenuBar(menuBar);
		
				
		file = new JMenu("File");
		file.setPreferredSize(new Dimension(60, 20));
		file.setBackground(new Color(225,225,205));
		menuBar.add(file);

		newFile = new JMenuItem("New sketch");
		newFile.addActionListener(this);
		newFile.setBackground(new Color(245,245,245));
		file.add(newFile);

		openFile = new JMenuItem("Open sketch");
		openFile.addActionListener(this);
		openFile.setBackground(new Color(245,245,245));
		file.add(openFile);

		saveFile = new JMenuItem("Save sketch");
		saveFile .addActionListener(this);
		saveFile.setBackground(new Color(245,245,245));
		file.add(saveFile);

		exportFile = new JMenuItem("Export sketch");
		exportFile.addActionListener(this);
		exportFile.setBackground(new Color(245,245,245));
		file.add(exportFile);
		
		importImage = new JMenuItem("Import image");
		importImage.addActionListener(this);
		importImage.setBackground(new Color(245,245,245));
		file.add(importImage);
		
		exportImage = new JMenuItem("Export image");
		exportImage.addActionListener(this);
		exportImage.setBackground(new Color(245,245,245));
		file.add(exportImage);


		exitApp = new JMenuItem("Quit");
		exitApp.addActionListener(this);
		exitApp .setBackground(new Color(235,235,235));
		file.add(exitApp);


		// Item Edit dans sub-item
		edit = new JMenu("Edit");
		edit.setPreferredSize(new Dimension(60, 20));
		edit.setBackground(new Color(225,225,205));
		menuBar.add(edit);

		undo = new JMenuItem("Undo");
		undo.addActionListener(this);
		undo.setBackground(new Color(245,245,245));
		edit.add(undo);

		redo = new JMenuItem("Redo");
		redo.addActionListener(this);
		redo.setBackground(new Color(245,245,245));
		edit.add(redo);

		//Item tools and sub-item		
		tools = new JMenu("Tools");
		tools.setPreferredSize(new Dimension(60, 20));
		tools.setBackground(new Color(225,225,205));
		menuBar.add(tools);


		//Item help dans sub-item
		help = new JMenu("Help");
		help.setPreferredSize(new Dimension(60, 20));
		help.setBackground(new Color(225,225,205));
		menuBar.add(help);
		
		back = new BorderLayout();

		frameMain.setLayout(back);
		
		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(screenWidth, 50));
		topPanel.setBackground(new Color(225,225,225));

		frameMain.add(topPanel,BorderLayout.NORTH);
		
		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(120, screenHeight-50));
		leftPanel.setBackground(new Color(225,225,225));
		
		//choice of form
		btnRectangle = new JButton("Rectangle");
		btnRectangle.addActionListener(this);
		btnRectangle.setPreferredSize(new Dimension(110,20));
		leftPanel.add(btnRectangle);
		

		frameMain.add(leftPanel,BorderLayout.WEST);

		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(100, screenHeight-50));
		rightPanel.setBackground(new Color(225,225,225));

		frameMain.add(rightPanel,BorderLayout.EAST);

		centerPanel = new ApplicationPanel(screenWidth-210, screenHeight-110);		
		controlPanel = new JPanel(new FlowLayout());		
		controlPanel.setPreferredSize(new Dimension(screenWidth-210, screenHeight-110));
		centerPanel.init();
		
		
		frameMain.add(controlPanel,BorderLayout.CENTER);
		
		
		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(screenWidth, screenHeight/10));
		bottomPanel.setBackground(new Color(225,225,225));

		frameMain.add(bottomPanel,BorderLayout.SOUTH);
		
		frameMain.setVisible(true);

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource() == myStartButton ){
			
		}
		else if (e.getSource() == myPauseButton){
			
		}else if(e.getSource() == btnRectangle){
			Polygon  myRect= new Polygon("Rectangle",10,10,50,40);
			centerPanel.draw();
		}
		
	}


}
