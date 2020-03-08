package abstractfactory1;

public class Shape3DFactory extends ShapeFactory{

	@Override
	public IGeometricShape getShape(String name) {
		// TODO Auto-generated method stub
		switch (name) {
		case "Cube":
			return new Cube();
		default:
			break;
		}
		return null;
	}

}
