import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		/* User Form*/
		System.out.println("Enter Your age");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		
		System.out.println("Enter Your Weight");
		double weight=scanner.nextDouble();
		
		System.out.println("is alive ? -> ");
		boolean isAlive=scanner.nextBoolean();
		
		
		System.out.println("Your Age : "+age);
		System.out.println("Your Weight : "+weight);
		System.out.println("alive status : "+isAlive);
		
	}
}
