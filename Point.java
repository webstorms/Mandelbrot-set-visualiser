import java.awt.Color;


public class Point {

	private static final int MAX_ITERATIONS = 250;
	private Color color;
	
	public Point(double c_re, double c_im) {
		double x = 0;
		double y = 0;
		
		this.color = Color.black;
		for(int i = 0; i < MAX_ITERATIONS; i++) {
			double x_new = x*x - y*y + c_re;
			y = 2*x*y + c_im;
			x = x_new;
			
			if(x*x + y*y > 4) {
				this.color = Color.white;
				break;
			}
			
		}
		
	}
	
	public Color getColor() {
		return this.color;
		
	}
	
	
}
