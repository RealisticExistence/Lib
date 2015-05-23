package net.tpdl.lib.img;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Img{
	private Image img = null;
	private float x;
	private float y;
	
	public Img(String path, float x, float y){
		this.x = x;
		this.y = y;
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			throw new RuntimeException("Error de lectura: " + path);
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



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}
	public void paint(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}



	public void setImage(Image image) {
		this.img = image;
	}
	
}