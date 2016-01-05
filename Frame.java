import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Frame extends JFrame implements KeyListener {
	
	public static double ZOOM = 6;
	public static int WIDTH;
	public static int HEIGHT;
	private static Panel panel;
	
	public Frame() {
		this.addKeyListener(this);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		WIDTH = (int) screenSize.getWidth();
		HEIGHT = (int) screenSize.getHeight();
		this.panel = new Panel();
		setContentPane(this.panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        
	}
	
	public static void main(String[] args) { 
        new Frame();
        
	}

	// Listeners
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int move = (int) (1d/this.panel.getZoom()) + 100;
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.panel.update(move, 0);
			
        }
        
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.panel.update(-move, 0);
			
        }
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.panel.update(0, -move);
			
        }
        
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.panel.update(0, move);
			
        }
		
		if(e.getKeyCode() == KeyEvent.VK_Z) {
			this.panel.zoom(true);
			
        }
		
		if(e.getKeyCode() == KeyEvent.VK_X) {
			this.panel.zoom(false);
			
        }
		
	}
	

}
