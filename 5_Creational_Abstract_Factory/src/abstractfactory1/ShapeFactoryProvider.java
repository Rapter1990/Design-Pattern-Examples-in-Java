package abstractfactory1;

public class ShapeFactoryProvider {

	public static ShapeFactory getFactory(ShapeFactoryType shapeFactoryType) {
		if (ShapeFactoryType.Shape2D == shapeFactoryType) {
			return new Shape2DFactory();
		} else if (ShapeFactoryType.Shape3D == shapeFactoryType) {
			return new Shape3DFactory();
		}
		return null;
	}
}
