
public class View {
	
	private java.awt.Point reference;
	private double zoom;
	private Point[][] points;
	
	public View() {
		this.reference = new java.awt.Point(Frame.WIDTH/2, Frame.HEIGHT/2);
		this.points = new Point[Frame.HEIGHT][Frame.WIDTH];
		zoom = Frame.ZOOM;
		this.setView(0, 0);
		
	}
	
	public void zoom(boolean direction) {
		
		int height = Frame.HEIGHT;
		int width = Frame.WIDTH;
		
		zoom = (direction) ? zoom / 2 : zoom * 2;
		
		for(int row = 0; row < height; row++) {
			for(int col = 0; col < width; col++) {
				double c_re = (col - this.reference.x) * (zoom / width);
				double c_im = (row - this.reference.y) * (zoom / width);
				this.points[row][col] = new Point(c_re, c_im);
				
			}

		}
		
	}
	
	public void setView(int wDis, int hDis) {
		int height = Frame.HEIGHT;
		int width = Frame.WIDTH;
		
		this.reference.x += wDis;
	    this.reference.y += hDis;
	    
		for(int row = 0; row < height; row++) {
			for(int col = 0; col < width; col++) {
				double c_re = (col - this.reference.x) * (zoom / width);
				double c_im = (row - this.reference.y) * (zoom / width);
				this.points[row][col] = new Point(c_re, c_im);
				
			}

		}
		
	}
	
	public Point[][] getView() {
		return this.points;
		
	}
	
	public double getZoom() {
		return this.zoom;
		
	}
	

}
