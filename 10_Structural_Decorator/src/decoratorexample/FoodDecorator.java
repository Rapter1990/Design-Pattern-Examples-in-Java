package decoratorexample;

public abstract class FoodDecorator implements Food{  
	
    private Food newFood;  
    
    public FoodDecorator(Food newFood)  {  
        this.newFood=newFood;  
    }  
    
    @Override  
    public String foodContent(){  
        return newFood.foodContent();   
    }  
    public double foodPrice(){  
        return newFood.foodPrice();  
    }  
}  
