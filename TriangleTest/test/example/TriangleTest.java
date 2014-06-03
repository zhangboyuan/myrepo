package example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tools.Triangle;

public class TriangleTest {

	@Test
	public void isATriangle() {
		assertTrue(new Triangle(3,4,5).isValidTriangle());
		assertFalse(new Triangle(-3,4,5).isValidTriangle());
		
		assertFalse(new Triangle(0,0,0).isValidTriangle());
		assertFalse(new Triangle(0,0,-1).isValidTriangle());
		assertFalse(new Triangle(0,0,1).isValidTriangle());
		assertFalse(new Triangle(0,-1,1).isValidTriangle());
		assertFalse(new Triangle(-1,-1,-1).isValidTriangle());
	}
	
	@Test
	public void isIsosceles()
	{
		assertTrue(new Triangle(2, 2, 3).isTriangleSidesWhichTwoAreEqaully());
		assertFalse(new Triangle(3, 4, 5).isTriangleSidesWhichTwoAreEqaully());
	}
	
	@Test
	public void isEquilateral()
	{
		assertTrue(new Triangle(2, 2, 2).isTriangleSidesAreAllEqually());
		assertFalse(new Triangle(2, 2, 3).isTriangleSidesAreAllEqually());
	}
	
}
