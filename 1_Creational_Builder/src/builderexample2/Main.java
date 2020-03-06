package builderexample2;

import builderexample1.Developer;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = createRectangle();
		Circle circle = createCircle();
		Triangle triangle = createTriangle();
		
		showInformation(rectangle);
		System.out.println();
		showInformation(circle);
		System.out.println();
		showInformation(triangle);
	}

	private static Rectangle createRectangle() {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle().getBuilder()
				.setWidth(6)
				.setLength(7)
				.build();
		
		return (Rectangle) rectangle;
	}

	private static Circle createCircle() {
		// TODO Auto-generated method stub
		Shape circle = new Circle().getBuilder()
				.setRadius(5)
				.build();
		return (Circle) circle;
	}

	private static Triangle createTriangle() {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle().getBuilder()
				.setA(5)
				.setB(3)
				.setC(4)
				.build();
		
		return (Triangle) triangle;
	}
	
	private static void showInformation(Object shape) {
		// TODO Auto-generated method stub
		if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			System.out.println("Rectangle Information");
			System.out.println("Rectangle Width : " + rectangle.getWidth());
			System.out.println("Rectangle Height : " + rectangle.getLength());
			System.out.println("Rectangle Area : " + rectangle.area());
			System.out.println("Rectangle Perimeter : " + rectangle.perimeter());
		}else if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			System.out.println("Circle Information");
			System.out.println("Circle Radius : " + circle.getRadius());
			System.out.println("Rectangle Area : " + circle.area());
			System.out.println("Rectangle Perimeter : " + circle.perimeter());
		}else if(shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
			System.out.println("Triangle Infomation");
			System.out.println("Triangle A : " + triangle.getA());
			System.out.println("Triangle B : " + triangle.getB());
			System.out.println("Triangle C : " + triangle.getC());
			System.out.println("Triangle Area : " + triangle.area());
			System.out.println("Triangle Perimeter : " + triangle.perimeter());
			System.out.println("");
		}else {
			System.out.println("No defined Shape");
		}
	}
}
