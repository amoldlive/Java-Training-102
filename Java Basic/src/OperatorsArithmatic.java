
public class OperatorsArithmatic {
	public static void main(String[] args) {
		/*
			+ (Addition)		
			- (Subtraction)	
			* (Multiplication)	
			/ (Division)		
			% (Modulus)			
			++ (Increment)		
			-- (Decrement) 	
		*/
		
		int num1=100;
		int num2=10;
		
		int add=num1+num2;
		System.out.println("Addition : "+add);
		System.out.println("Addition : "+(num1+num2));
		System.out.println("Addition : "+num1+num2); //invalid
		
		//sub - mul- div assignment
		
		int reminder=num1%num2;
		System.out.println("Reminder : "+reminder);
		
		System.out.println("increment : "+(num1++));
		System.out.println(num1);
		System.out.println("increment : "+(++num1));
		
		//decrement--assignment
	}
}
