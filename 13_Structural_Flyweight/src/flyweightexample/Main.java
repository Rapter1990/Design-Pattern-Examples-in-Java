package flyweightexample;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		 Car car = null;

	        for (int i=1;i<15;i++){

	            int a = i % 3;

	            if (a == 0){
	                car = CarFactory.getPiece("LuxuryCar");
	                car.create("LuxuryCar" + a , getColor(a), 210, 2020);
	            }else if (a == 1){
	            	car = CarFactory.getPiece("ClassicCar");
	            	car.create("ClassicCar" + a , getColor(a), 100, 2020);
	            }else if (a == 2){
	            	car = CarFactory.getPiece("SportCar");
	            	car.create("SportCar" + a , getColor(a), 270, 2020);
	            }else if (a == 3){
	            	car = CarFactory.getPiece("PassengerCar");
	            	car.create("PassengerCar" + a , getColor(a), 150, 2020);
	            }
	            
	        }
		
	}
	
	private static String getColor(int number) {
		// TODO Auto-generated method stub
		String color = "";
		int colorNumberResult = new Random().nextInt(5);
		
		switch (colorNumberResult) {
		case 1:
			color = "green";
			break;
		case 2:
			color = "red";
			break;
		case 3:
			color = "blue";
			break;
		case 4:
			color = "grey";
			break;
		default:
			break;
		}
		
		return color;
	}

}
