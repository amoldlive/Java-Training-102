
public class JumpExample {
	public static void main(String[] args) {
		
			
		/*
		 
		continue break
		 
		 * */
		/*for ex - i ==3  break;*/
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			if(i==3) {
				break;
			}
		}
		
		System.out.println("******************************");
		/*0-5 : 4,5 step print*/
		
		for(int i=0;i<=5;i++) {
			if(i<4) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}
}
