package net.lib.frame.window;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Img{
	Image img = null;
	public Img(String path){
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong");
		}



	}


	public void setHeight(int newHeight){
		img = img.getScaledInstance(img.getWidth(null), newHeight, Image.SCALE_SMOOTH);



	}
	public void setWidth(int newWidth){
		img = img.getScaledInstance(newWidth, img.getHeight(null), Image.SCALE_SMOOTH);

	}
	public Image getImage(){
		return img;
		
		
	}
	
}