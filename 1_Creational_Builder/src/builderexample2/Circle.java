package builderexample2;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {
	private double radius;
	private final double pi = Math.PI;

	public Circle() {
		super();
	}

	public Circle(CircleDTOBuilder builder) {
		this.radius = builder.radius;
	}

	@Override
	public double area() {
		// A = π r^2
		return pi * Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		// P = 2πr
		return 2 * pi * radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	// Get builder instance
	public static CircleDTOBuilder getBuilder() {
		return new CircleDTOBuilder();
	}

	// Builder Design Pattern
	public static class CircleDTOBuilder {
		private double radius;
		
		public CircleDTOBuilder() {
		}
		
		public CircleDTOBuilder setRadius(double radius) {
			this.radius = radius;
			return this;
		}
		
		public Circle build() {
			return new Circle(this);
		}

	}
}
