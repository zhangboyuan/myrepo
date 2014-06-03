package tools;

public class Triangle {
	double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isPositiveSides() {
		if (a > 0 && b > 0 && c > 0)
			return true;
		return false;
	}
	
	public boolean isValidTriangle() {
		boolean flag = false;
		if (isPositiveSides()) {
			if (hasTwoSidesCreaterThanOther())
				flag = true;
		}
		return flag;
	}

	private boolean hasTwoSidesCreaterThanOther() {
		return a + b > c || a + c > b || b + c > a;
	}

	public boolean isTriangleSidesWhichTwoAreEqaully() {
		boolean flag = false;
		if (isValidTriangle()) {
			if (isWhichSidesAreEqually())
				flag = true;
		}
		return flag;
	}

	private boolean isWhichSidesAreEqually() {
		return a == b || b == c || a == c;
	}

	public boolean isTriangleSidesAreAllEqually() {
		boolean flag = false;
		if (isValidTriangle()) {
			if (allSidesAreEqually())
				flag = true;
		}
		return flag;
	}

	private boolean allSidesAreEqually() {
		return a == b && b == c;
	}
}
