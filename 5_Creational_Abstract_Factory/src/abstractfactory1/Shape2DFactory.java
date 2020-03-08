package abstractfactory1;

public class Shape2DFactory extends ShapeFactory{

	@Override
	public IGeometricShape getShape(String name) {
		// TODO Auto-generated method stub
		switch (name) {
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		default:
			break;
		}
		return null;
	}

}
