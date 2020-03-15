package flyweightexample;

public class LuxuryCar implements Car{

	private String label;

    public LuxuryCar(){
        label = "LuxuryCar";
    }
	
	
	@Override
	public void create(String name, String color, int speed, int modelYear) {
		// TODO Auto-generated method stub
		System.out.println(label+" , name : " + name + " ," +
		                   "color : " + color + " , speed : " + speed + " , modelYear : " + modelYear);
    }

}
