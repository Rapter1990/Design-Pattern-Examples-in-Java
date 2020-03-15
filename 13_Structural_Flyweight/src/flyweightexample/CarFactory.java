package flyweightexample;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private static final Map<String, Car> carList = new HashMap();

    public static Car getPiece(String pieceType) {
    	Car car = null;

        if (carList.get(pieceType) != null) {
        	car = carList.get(pieceType);
        } else {
            if (pieceType.equalsIgnoreCase("LuxuryCar")) {
            	car = new LuxuryCar();
            } else if (pieceType.equalsIgnoreCase("ClassicCar")) {
            	car = new ClassicCar();
            } else if (pieceType.equalsIgnoreCase("SportCar")) {
            	car = new SportCar();
            } else if (pieceType.equalsIgnoreCase("PassengerCar")) {
            	car = new PassengerCar();
            }

            carList.put(pieceType, car);
        }

        return car;
    }
}
