
public class ForLoopExample4 {
	public static void main(String[] args) {
		
		/*Book Hotel for 3 weeks - 7days*/
		
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 * */
		
		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}
