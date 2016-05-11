package Grafikeditor;

import java.awt.*;

class RectangleFigure extends Figure{
	private int width, heigth;
	
	RectangleFigure(int x, int y, int width, int heigth){//, Color color, float strokeWidth) {
		super(x, y);//,color, strokeWidth);
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.fillRect(x, y, width, heigth);
	}
}