package Images;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ImageBuffer {
	
	//creer un buffer a partir dune image importee au format:bmp, gif, png, jpeg
	BufferedImage source = ImageIO.read(new File("winni.png"));
	
	//
	BufferedImage dest = new BufferedImage(source.getWidth(), source.getHeight(),
											source.getType());
	
	//sauvegarde le buffer vers un fichier image
	ImageIO.write( source, "GIF", new File("winni.gif"));

}
