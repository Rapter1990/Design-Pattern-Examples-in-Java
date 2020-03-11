package decoratorexample;

public class JapaneseFood extends FoodDecorator {

	public JapaneseFood(Food newFood) {
		super(newFood);
	}

	public String foodContent() {
		return "Onigiri";
	}

	public double foodPrice() {
		return 15.0;
	}
}
