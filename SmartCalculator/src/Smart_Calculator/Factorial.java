package Smart_Calculator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Double factorial(Double f) {
		Double rez;
		
		if(f==1) 
			return f;
		{
			
			rez =  factorial(f-1)*f;
			return rez;
		}
		
		}
	}

