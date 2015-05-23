package net.tpdl.lib.text;

import java.awt.Graphics;

public class Text {
	private float x;
	private float y;
	private String text;
	
	
	
	
	public Text(String text, float x, float y){
		this.x = x;
		this.y = y;
		this.setText(text);
	}
	
	
	
	
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void paint(Graphics g){
		g.drawString(text, (int)x, (int) y);
	}





	public String getText() {
		return text;
	}





	public void setText(String text) {
		this.text = text;
	}
	
	
}