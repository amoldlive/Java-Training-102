
public class WhileExample {
	public static void main(String[] args) {
		
		/*5 time*/
		//System.out.println("I Am  1 "); //repeat
		
		int time=5;
		int i=0;
		while(i<time) {
			System.out.println("I Am  1 "); 
			i++;	
		}
		
		System.out.println("*******************");
		
		int j=10;
		while(j>time) {
			System.out.println("I Am  1 ");
			j--;
		}
		
		System.out.println("*********************");
		while(true) {
			System.out.println("I am infinite"); //infinite loop
		}
		
		
		
	}
}
