package abstractfactory1;

public class Circle implements IGeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
}
