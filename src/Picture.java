

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.ImageObserver;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * MyImage
 * Cree une image
 * param[in] pImage image choisi
 * param[in] pFile le nom du fichier image
 */
public class Picture  {

	private BufferedImage bImg = null;
	private String imgName = "";
	private int imgWidth = 0;
	private int imgHeight = 0;
	
	//constructor
	public Picture(Color color, Point pos, Dimension dim){
		super();
    }
	
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		if(bImg != null){
			g2.drawImage(bImg,0,0,(ImageObserver) this);
			g2.finalize();
		}
	}
	
	protected void importImage(File imgFile)	
	{   // importe image dans le buffer	
		try {
			imgName = imgFile.getName();
			bImg = ImageIO.read(imgFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("image importee");		

		imgWidth = bImg.getWidth();
		imgHeight = bImg.getHeight();
		
		BufferedImage bi = new
		    BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		g.drawImage(bImg, 0, 0, null);

	}
	
	protected BufferedImage getImagePanel()
	{   // recupere image affichee
				
		BufferedImage image = new BufferedImage(imgWidth, imgHeight,  BufferedImage.TYPE_INT_RGB);
		Graphics2D g2D = image.createGraphics();
		//on demande au panel de se dessiner sur les graphics de l'image
		//this.paintAll(g2D);
		g2D.dispose();
		return image;
	}
	
	
	//rend une image flou 
	protected void filterImage()
	{
		BufferedImageOp  bImgDest = (BufferedImageOp) new BufferedImage(imgWidth, imgHeight, bImg.getType());
		bImgDest.filter(bImg, (BufferedImage) bImgDest);
		float[ ] flou = 
		{
				0.1f, 0.1f, 0.1f,
				0.1f, 0.2f, 0.1f,
				0.1f, 0.1f, 0.1f
		};

		Kernel kernel = new Kernel(3, 3, flou);
		ConvolveOp cOp = new ConvolveOp(kernel, ConvolveOp.EDGE_ZERO_FILL, null);
		cOp.filter(bImg, (BufferedImage) bImgDest);
		//bImg = operation;
		
		System.out.println("filtrage fait");
		
	}

	//convertie image en vert
	protected void tintGreenImage()
	{
		int width = bImg.getWidth();
		int height = bImg.getHeight();
		
		BufferedImage imgGreen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		for(int y = 0; y < height; y++){
			for(int x = 0; x < width; x++){
				int p = imgGreen.getRGB(x, y);
				int a = (p >> 24)&0xff;
				int g = (p >>8)&0xff;
				
				//nouvelle couleur
				p = (a<<24) | (0<<16) | (g<<8) | 0;
				
				imgGreen.setRGB(x,  y,  p);
			}
		}
		
	}
	

	//enregistre image modifiee sur disque
	protected void exportImage(File imgFile)//protected void enregistrerImage(File fichierImage)

	{
		String format ="png";
		BufferedImage imgDest = getImagePanel();
		try {
			if(!ImageIO.write(imgDest, format, imgFile));
				JOptionPane.showMessageDialog(null, "Ecriture impossible : "+format);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}