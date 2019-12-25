package deepVSshallowCopyWork;
import java.util.*;

public class Point2 {
	
	int x;
	int y;
	List<Point2> myList = new ArrayList<>();
	
	Point2(int x, int y){ //argument constructor
		this.x = x;
		this.y = y;
	}
	
	Point2(){ //no argument constructor... uses constructor chaining.
		this(0,0);
	}
	
	
	
	Point2(Point2 other){ //copy constructor... also uses constructor chaining.
		this(other.x, other.y);
	}
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Point2 scalarMultiplication(int factor) {
		
		this.x *= factor;
		this.y *= factor;
		return this;
	}
	
	
}
