package deepVSshallowCopyWork;

import static org.junit.Assert.*;

import org.junit.Test;

public class Point2Tester {

	@Test
	public void cTorTest01() {
		Point2 p1 = new Point2();
		int expectX = 0;
		int gotX = p1.getX();
		int expectY = 0;
		int gotY = p1.getY();
		
		assertEquals(expectX, gotX);
		assertEquals(expectY,gotY);
	}
	@Test
	public void cTorTest02() {
		Point2 p1 = new Point2(5,5);
		int expectX = 5;
		int gotX = p1.getX();
		int expectY = 5;
		int gotY = p1.getY();
		
		assertEquals(expectX, gotX);
		assertEquals(expectY,gotY);
	}
	@Test
	public void cTorTest03() {
		Point2 p1 = new Point2(5,1);
		int expectX = 5;
		int gotX = p1.getX();
		int expectY = 1;
		int gotY = p1.getY();
		
		assertEquals(expectX, gotX);
		assertEquals(expectY,gotY);
	}
	@Test
	public void multiplyTest01() {
		Point2 p1 = new Point2(5,5);
		p1.scalarMultiplication(5);
		
		int expectX = 25;
		int gotX = p1.getX();
		int expectY = 25;
		int gotY = p1.getY();
		
		assertEquals(expectX, gotX);
		assertEquals(expectY,gotY);
	}

}
