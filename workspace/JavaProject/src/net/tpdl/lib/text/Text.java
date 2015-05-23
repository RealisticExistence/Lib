package net.tpdl.lib.text;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import net.tpdl.lib.point.Point;

public class Text {
	private float x;
	private float y;
	private String text;
	private List<Point> points = new ArrayList<Point>();
	private boolean isMoving;
	
	
	public Text(String text, float x, float y){
		this.x = x;
		this.y = y;
		this.setText(text);
	}
	public Point getNextPoint(){
		if(points.isEmpty())return null;
		Point p = points.get(0);
		points.remove(p);
		return p;
	}
	public void addPoint(Point p){
		points.add(p);
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
	public boolean isMoving() {
		return isMoving;
	}
	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}
	
	
}
