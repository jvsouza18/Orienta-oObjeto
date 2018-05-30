package aulaImagem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Imagem extends ArrayList {
	
	private BufferedImage bf;
	
	public Imagem(String path) throws IOException
	{
		 bf = ImageIO.read(new File(path));
		
		
	}
	

	public void mostrarPixels()
	{
		for (int i = 0; i < bf.getHeight(); i++) {
			for (int j = 0; j < bf.getWidth(); j++) {
				//System.out.println(i + " " + j);
			//nt k =  bf.getRGB(i, j);
			int[] pixel = new int[3]; 
			pixel = bf.getRaster().getPixel(j, i, pixel);
			System.out.println("R " +  pixel[0]);
			System.out.println("G " +  pixel[1]);
			System.out.println("B " +  pixel[2]);
			}
		}
	}
}
