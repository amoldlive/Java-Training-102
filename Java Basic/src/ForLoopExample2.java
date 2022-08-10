
public class ForLoopExample2 {
	public static void main(String[] args) {
		
		/*Book Hotel for 3 weeks - 7days/week */
		
		int week=3;
		int days=7;
		
		for(int i=1;i<=week;i++) {
			for(int j=1;j<=days;j++) {
				System.out.println("Hotel Booked For week "+i +"  Day : - "+j);
			}
		}
		
	}
}
