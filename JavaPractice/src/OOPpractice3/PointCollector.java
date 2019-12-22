package OOPpractice3;

public class PointCollector {
	Point[] points;
	int nop;
	
	PointCollector(){
		points  = new Point[100];
		
	}
	
	void addPoint(double x, double y) {
		points[nop] = new Point(x,y);
		nop ++;
	}
	
	
	Point[] getPointsInQuadrant1() {
		Point [] ps = new Point[nop];
		int count = 0;
		
		for(int i = 0; i < nop;i++) {
			Point p = points[i];
			if(p.x > 0 && p.y > 0) {
				ps[count] = p;
				count ++;
			}
			
		}
		Point [] q1Points = new Point[count];
		for(int i = 0; i < count; i++) {
			q1Points[i] = ps[i];
		}
		return q1Points;
 	}
	
	
}
