package movementModel;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Enemy {
	
	double speed;
	int xcoor;
	int ycoor;
	
	Enemy(){
		Random r  = new Random();
		xcoor = r.nextInt(500);
		ycoor = r.nextInt(400);
		speed = 1.0;
	}
}
