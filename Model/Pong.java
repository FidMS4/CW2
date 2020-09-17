package Model;

import java.awt.*;

public class Pong {

	private Color color;

	public class rectPos {
		private int x, y, w, h;

		public rectPos(int x, int y, int w, int h) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
	}

	public void setBallColor(Color color) {
		this.color = color;
	}

	public Color getBallColor() {
		return color;
	}

	public void setBackgroundColor(Color color) {
		this.color = color;
	}

	public Color getBackgroundColor() {
		return color;
	}

}