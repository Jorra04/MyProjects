package OOPpractice3;

public class PointCollectorTester {

	public static void main(String[] args) {
		PointCollector pc = new PointCollector();
		
		pc.addPoint(3, -4);
		pc.addPoint(4, 7);
		pc.addPoint(-2, -1);
		pc.addPoint(-2, 1);
		
		Point[] ps  = pc.getPointsInQuadrant1();
		System.out.println(ps[0].x );
		System.out.println(ps[0].y );
	}

}
