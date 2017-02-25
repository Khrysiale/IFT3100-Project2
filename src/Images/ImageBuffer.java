package Images;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ImageBuffer {
	
	public ImageBuffer(){
		
	}
	
	//creer un buffer pour image importee
	//BufferedImage image = ImageIO.read(new File("winni.png"));
	
	//creer un nouveau buffer
	BufferedImage source = new BufferedImage(512, 512, BufferedImage.TYPE_CUSTOM);											
	
	//sauvegarde le buffer vers un fichier image
	//ImageIO.write(image, "GIF", new File("winni.gif"));

};
