package Model;

public class Rectangle {
	private int x = 0, y = 0, height, width;

	public Rectangle(int x, int y, int height, int width) {
        this.x = x;
    	this.y = y;
        this.height = height;
        this.width = width;
	}

	public void setX(int x) {
      this.x = x;
    }

	public void setY(int y) {
      this.y = y;
    }

	public void setHeight(int height) {
      this.height = height;
    }

	public void setWidth(int width) {
      this.width = width;
    }

	public int getX() {
      return x;
    }

	public int getY() {
      return y;
    }

	public int getHeight() {
      return height;
    }

	public int getWidth() {
      return width;
    }

}
