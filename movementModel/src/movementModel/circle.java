package movementModel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class circle extends JPanel implements ActionListener, KeyListener{
	double x = 0, y = 0, velx = 0, vely = 0;
	Timer t = new Timer(5, this);
	public circle() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(new Ellipse2D.Double(x, y, 40, 40));
		
	}


	public void left() {
		vely=0;
		velx=1.5;
	}

	public void right() {
		velx = -1.5;
		vely = 0;
	}

	public void up() {
		vely = -1.5;
		velx = 0;
	}

	public void down() {
		vely=1.5;
		velx = 0;
	}
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			up();
		}
		if(code == KeyEvent.VK_DOWN) {
			down();
		}
		if(code == KeyEvent.VK_RIGHT) {
			left();
		}
		if(code == KeyEvent.VK_LEFT) {
			right();
		}
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		x += velx;
		y += vely;
	}
}
