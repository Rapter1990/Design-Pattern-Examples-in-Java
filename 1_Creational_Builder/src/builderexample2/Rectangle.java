package builderexample2;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
	private double width, length; // sides

	public Rectangle() {
		super();
	}

	private Rectangle(RectangleDTOBuilder builder) {
		this.width = builder.width;
		this.length = builder.length;
	}

	@Override
	public double area() {
		// A = w * l
		return width * length;
	}

	@Override
	public double perimeter() {
		// P = 2(w + l)
		return 2 * (width + length);
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	// Get builder instance
	public static RectangleDTOBuilder getBuilder() {
		return new RectangleDTOBuilder();
	}

	// Builder Design Pattern
	public static class RectangleDTOBuilder {
		private double width, length; // sides

		public RectangleDTOBuilder() {
		}

		public RectangleDTOBuilder setWidth(double width) {
			this.width = width;
			return this;
		}

		public RectangleDTOBuilder setLength(double length) {
			this.length = length;
			return this;
		}
		
		public Rectangle build() {
			return new Rectangle(this);
		}
	}

}
