package decoratorexample;

public class TurkishFood extends FoodDecorator{    
	
    public TurkishFood(Food newFood) {  
        super(newFood);  
    }  
    public String foodContent(){  
        return "Shish kebab";   
    }  
    public double foodPrice()   {  
        return 25.0;  
    }  
}  
