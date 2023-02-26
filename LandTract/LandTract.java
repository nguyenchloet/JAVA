// Tested with LandTractTest.java
// LandTract class has two fields: one for tract length (double) and width (double)
// Class should have constructor that accepts arguments for the two fields
// Method that returns tract's area (length * width)
// Equals method that accepts a LandTract object as argument.
// If the argument object holds the same data (length and width), method should return true, else false
// toString method that returns string representation of tracts length, width and area

public class LandTract {
	private double length;
	private double width;

	public LandTract(double l, double w) { 
		length = l;
		width = w;

	}

	public double getLength(double length) {
		return length;
	}

	public double getWidth(double width) {
		return width;
	}

	public double getArea() {
		return length * width;
	}

	// SHOULD PASS AN OBJECT (LandTract t)
	public boolean equals(LandTract tract2) {
		if (tract2.length == this.width && tract2.width == this.length) || 
			(tract2.width == this.length && tract2.length == this.width) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return ("Length = " + length + "\n" 
				+ "Width = " + width + "\n" +
				"Area = " + (width*length)); 
	}
}
