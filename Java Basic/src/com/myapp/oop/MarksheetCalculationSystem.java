package com.myapp.oop;

class MarksheetCalculator{

	int mark1=45; //out of 100
	int mark2=65; //out of 100
	int mark3=85; //out of 100
	
	public int calcTotal() {
		int total =mark1+mark2+mark3;
		System.out.println("Total Marks : "+total);
		return total;
	}
	public void calcAvrage(int total) {
		double avg =total/3;
		System.out.println("Avergae Marks : "+avg);
	}
	public void calcPercentage(int total) {
		double percentage =(total*100)/300;
		System.out.println("Percentage : "+percentage +"%");
	}
	
	
}
public class MarksheetCalculationSystem {
	public static void main(String[] args) {
		MarksheetCalculator calculator=new MarksheetCalculator();
		
		int total=calculator.calcTotal();
		calculator.calcAvrage(total);
		calculator.calcPercentage(total);
	}
}
