package interpreterexample;

public class Main {

	public static void main(String[] args) {
		
		Expression person1 = new CaseExpression("Kushagra"); 
        Expression person2 = new CaseExpression("Lokesh"); 
        Expression isSingle = new OrExpression(person1, person2); 
          
        Expression vikram = new CaseExpression("Julia"); 
        Expression committed = new CaseExpression("Married"); 
        Expression married = new AndExpression(vikram, committed);   
        
        Expression robert = new CaseExpression("Robert");
        Expression john = new CaseExpression("John");
        Expression isMale =  new OrExpression(robert, john);
        
        Expression anna = new CaseExpression("Anna");
        Expression lisa = new CaseExpression("Lisa");
        Expression isFemale =  new OrExpression(anna, lisa);
  
        System.out.println(isSingle.interpret("Kushagra")); 
        System.out.println(isSingle.interpret("Lokesh")); 
        System.out.println(isSingle.interpret("Achint")); 
          
        System.out.println(married.interpret("Married, Vikram")); 
        System.out.println(married.interpret("Married, Julia")); 
        
        
        System.out.println(isMale.interpret("John"));
        System.out.println(isMale.interpret("Janet")); 
        
        System.out.println(isFemale.interpret("Anna"));
        System.out.println(isFemale.interpret("John"));
	}
}
