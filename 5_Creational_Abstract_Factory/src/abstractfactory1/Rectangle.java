package abstractfactory1;

public class Rectangle implements IGeometricShape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}
