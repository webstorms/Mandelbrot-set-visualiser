import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel {

	private View view;
	
	public Panel() {
		this.view = new View();
		repaint();

	}

	public void update(int x, int y) {
		this.view.setView(x, y);
		repaint();
		
	}
	
	public void zoom(boolean direction) {
		this.view.zoom(direction);
		repaint();
		
	}
	
	public void paintComponent(Graphics g){
		for(int i = 0; i < Frame.HEIGHT; i++) {
			for(int j = 0; j < Frame.WIDTH; j++) {
				g.setColor(this.view.getView()[i][j].getColor());
				g.drawRect(j, i, 1, 1);

			}

		}
		
		// g.drawRect(Frame.WIDTH/2 - 3, Frame.HEIGHT/2 - 3, 3, 3);
		
	}
	
	public double getZoom() {
		return this.view.getZoom();
		
	}


}
