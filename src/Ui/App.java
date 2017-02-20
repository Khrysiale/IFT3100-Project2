package Ui;
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.KeyEventDispatcher;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Controller.Controller;
import Model.Rectangle;

@SuppressWarnings("unused")
public class App extends JFrame implements ActionListener, KeyEventDispatcher{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6945076473945649773L;

	//Create event listener
	private UiListener listener;
	
	//Create main area to draw
	Sketch sketch;
	
	//Create variable to make Window Ui
	private JFrame frameMain;
	
	//Create variable to set Menu
	private JMenu file;
	private JMenu edit;
	private JMenu tools;
	private JMenu help;
	private JMenuItem newFile;
	private JMenuItem openFile;
	private JMenuItem saveFile;
	private JMenuItem exportFile;
	private JMenuItem exitApp;
	private JMenuItem undo;
	private JMenuItem redo;
	
	//Create variable for the button
	private JButton btnUndo;
	private JButton btnRedo;
	
	//Create variable to configurage panel
	private BorderLayout back;
	private JPanel topPanel;
	private JPanel leftPanel;
	private JPanel centerPanel;
	private JPanel rightPanel;
	private JPanel bottomPanel;
	
	//Create variable button
	private JButton bntRect;
	
	//other variable
	int screenWidth ;
	int screenHeight ;
	

	
	/**
	 * App Constructor
	 * 
	 * @param width
	 * @param height
	 * 
	 */
	public App(double width, double height){
		
		screenWidth = (int) width;
		screenHeight = (int) height;
		
		/*MainWindow*/
		frameMain = new JFrame();
		frameMain.setBounds(0, 0,(int)(width/2), (int)(height-height/5));
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setTitle("Titre de notre projet");
		frameMain.setLayout(new GridLayout(3, 1));
		
		frameMain.setVisible(true);
		
		//MenuTop
		initMenuTop();
		
		back = new BorderLayout();
		
		frameMain.setLayout(back);
		
		
		
		//Top
		initTop();
		
		//MenuLeft
		initLeft();
		
		//MenuLeft
		initRight();
		
		//Central sketch
		initCenter();
		
		//bottomPanel
		initBottom();
		
	}

	

	private void initRight() {
		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(screenWidth/30, screenHeight-50));
		rightPanel.setBackground(new Color(225,225,225));
		
		frameMain.add(rightPanel,BorderLayout.EAST);
		
	}



	private void initTop() {
		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(screenWidth, screenHeight/30));
		topPanel.setBackground(new Color(225,225,225));
		
		frameMain.add(topPanel,BorderLayout.NORTH);
		
	}
	
	private void initBottom() {
		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(screenWidth, screenHeight/30));
		bottomPanel.setBackground(new Color(225,225,225));
		
		frameMain.add(bottomPanel,BorderLayout.SOUTH);
		
	}

	private void initLeft() {
		
		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(screenWidth/30, screenHeight-50));
		leftPanel.setBackground(new Color(225,225,225));
	
		
		frameMain.add(leftPanel,BorderLayout.WEST);		
		
		
	}
	
	


	private void initCenter() {
		centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(screenWidth/4, screenHeight/4));
		centerPanel.setBackground(new Color(255,255,255));
		
		frameMain.add(centerPanel,BorderLayout.CENTER);
		
	}

	/**
	 *  Function to initialise the main menu of the application
	 */
	private void initMenuTop() {
		BackgroundMenuBar menuBar = new BackgroundMenuBar();
		frameMain.setJMenuBar(menuBar);
		
		// Item File and sub-item
		
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
		
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == newFile){
			listener.onNewFile();
		}
		else if (ev.getSource() == saveFile){
			listener.onSaveFile();
		}
		else if (ev.getSource() == openFile){
			listener.onOpenFile();
		}
		else if (ev.getSource() ==exportFile){
			listener.onExportFile();
		}
		else if (ev.getSource() ==exitApp){
			listener.onExitApp();
		}
		if (ev.getSource() == undo){
			try {
				listener.onUndo();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		else if (ev.getSource() == redo){
			try {
				listener.onRedo();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void addListener(UiListener listener) {
		this.listener = listener;
		this.listener.onInit(sketch.getWORKSHEET_HEIGHT(), sketch.getWORKSHEET_HEIGHT());
		
	}

	public void askSave() {
		int answer = showChoiceDialog("Voulez-vous sauvegarder?", "oui","non");
		if( answer == 0){
			onSaveAs();
		}	
		System.exit(0);
		
	}

	private int showChoiceDialog(String text, String choice1, String choice2) {
		Object[] options = {choice1,choice2};
		int choice = JOptionPane.showOptionDialog(frameMain, text,null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,options,options[0]);
        if(choice == 0){
        	return 0;
        }
        else return 1;
	}

	private void onSaveAs() {
		String PathToSave = null;

		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File(System.getProperty("user.home")));
		int response = fc.showSaveDialog(App.this);
		if(response == JFileChooser.APPROVE_OPTION){
			PathToSave = fc.getSelectedFile().toString();
			if (!PathToSave.isEmpty())
			{
				listener.onSaveAs(PathToSave);
			}
		}
		else {
			showMessageDialog("Sauvegarde annuler", "Ok");
		}

	}

	private void showMessageDialog(String text, String buttonText) {
		int dialogButton = JOptionPane.OK_OPTION;
        JOptionPane.showMessageDialog (frameMain, text,"Information",0);

        if(dialogButton == JOptionPane.OK_OPTION){ //The ISSUE is here
        }

	}

	public void setCurrentUndoRedo(int current, int max) {
		btnUndo.setEnabled(current > 0);
		btnRedo.setEnabled(current < max - 1);
		
	}

}
