package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    public void setX(int xValue) {
    	x = xValue;
    }
    public int getX() {
    	return x;
    }
    public void setY(int yValue) {
    	y = yValue;
    }
    public int getY() {
    	return y;
    }
    public void setWidth(int w) {
    	width = w;
    }
    public int getWidth() {
    	return width;
    }
    public void setHeight(int h) {
    	height = h;
    }
    public int getHeight() {
    	return height;
    }
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
