package testing;

public class Rectangle {
	private int height, width;
	
	public Rectangle(int h, int w){
		height = h;
		width = w;
	}
	
	public void setHeight(int h){height = h;}
	public void setWidth(int w){width = w;}
	
	public int getHeight(){return height;}
	public int getWidth(){return width;}
	
	public int area(){return height * width;}
	
	public String toString(){return height + " " + width;}

}
