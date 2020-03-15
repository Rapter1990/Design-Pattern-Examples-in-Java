package flyweightexample;

public class ClassicCar implements Car{

	private String label;

    public ClassicCar(){
        label = "ClassicCar";
    }
	
	@Override
	public void create(String name, String color, int speed, int modelYear) {
		// TODO Auto-generated method stub
		System.out.println(label+" , name : " + name + " ," +
                "color : " + color + " , speed : " + speed + " , modelYear : " + modelYear);
	}

}
