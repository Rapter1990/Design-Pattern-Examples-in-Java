package interpreterexample;

public class CaseExpression implements Expression {

	private String data;

	public CaseExpression(String data){
	      this.data = data; 
	   }

	@Override
	public boolean interpret(String context) {

		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
