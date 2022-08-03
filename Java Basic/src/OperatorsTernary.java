
public class OperatorsTernary {
	public static void main(String[] args) {
		/*
			(expression)?(true value):(false value)
	 */
		int num1=100;
		int num2=10;
		int discount=(num1>num2)?20:10;
		System.out.println("Discount : "+discount);
		
		boolean result=(num1>num2)?true:false;
		System.out.println("Result : "+result);
	}
}
