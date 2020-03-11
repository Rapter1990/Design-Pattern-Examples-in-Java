package decoratorexample;

public class Main {

	public static void main(String[] args) {
		
		Food turkishFood = new TurkishFood(new BasicFood());
		System.out.println("Turkish Food Content : " + turkishFood.foodContent());
		System.out.println("Turkish Food Price : " + turkishFood.foodPrice());
		
		Food japaneseFood = new JapaneseFood(new BasicFood());
		System.out.println("Japanese Food Content : " + japaneseFood.foodContent());
		System.out.println("Japanese Food Price : " + japaneseFood.foodPrice());
	}
}
