package Assignment_6;

import java.awt.*;

class graphic extends Frame
{
	
	graphic(){
	setSize(800, 800);
	setVisible(true);
	setBackground(Color.GREEN);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		// corodinates for the house outer body
		int x[] = {315, 80, 550, 120, 120, 250, 250, 350, 350, 500, 500, 550, 315};
		int y[] = {50, 300, 300, 300, 600, 600, 450, 450, 600, 600, 300, 300, 50};

			// outer body of the house
			// g.drawPolygon(x, y, 13);
			g.setColor(Color.RED);
			g.fillPolygon(x, y, 13);

			g.setColor(new Color(155, 105, 35));
			g.fillPolygon(x, y, 3);

			// windows of the house
			g.setColor(Color.GRAY);
			// g.drawRect(150, 350 , 70, 70);
			// g.drawRect(390, 350, 70, 70);
			g.fillRect(150, 350 , 70, 70);
			g.fillRect(390, 350, 70, 70);

			// door of the house
			g.fillRect(250, 450, 100, 150);

	}

	public static void main(String[] args) 
	{
		new graphic();
	
	}
}