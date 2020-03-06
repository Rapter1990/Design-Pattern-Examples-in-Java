package builderexample2;

import java.io.Serializable;

public class Triangle extends Shape implements Serializable{
    private double a, b, c; // sides

    public Triangle() {
        super();
    }
    public Triangle(TriangleDTOBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    @Override
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return a + b + c;
    }
    
    public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	
	// Get builder instance
 	public static TriangleDTOBuilder getBuilder() {
 		return new TriangleDTOBuilder();
 	}

 	// Builder Design Pattern
 	public static class TriangleDTOBuilder {
 		private double a, b, c; // sides

		public TriangleDTOBuilder() {
			
		}

		public TriangleDTOBuilder setA(double a) {
			this.a = a;
			return this;
		}
		
		public TriangleDTOBuilder setB(double b) {
			this.b = b;
			return this;
		}
		
		public TriangleDTOBuilder setC(double c) {
			this.c = c;
			return this;
		}
		
		public Triangle build() {
			return new Triangle(this);
		}
 	}
}
