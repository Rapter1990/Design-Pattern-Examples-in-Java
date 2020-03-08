package abstractfactory1;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory2D = ShapeFactoryProvider.getFactory(ShapeFactoryType.Shape2D);
		ShapeFactory shapeFactory3D = ShapeFactoryProvider.getFactory(ShapeFactoryType.Shape3D);
		
		IGeometricShape circleGeometricShape = shapeFactory2D.getShape("Circle");
		IGeometricShape rectangleGeometricShape = shapeFactory2D.getShape("Rectangle");
		IGeometricShape cubeGeometricShape = shapeFactory3D.getShape("Cube");
		
		draw(circleGeometricShape);
		draw(rectangleGeometricShape);
		draw(cubeGeometricShape);
	}

	private static void draw(IGeometricShape geometricShape) {
		// TODO Auto-generated method stub
		geometricShape.draw();
	}
}
