package com.myapp.oop;

class AlphabetMould {

	String ink = "Black";

	public void print(String printerName,String inputInk) {
		System.out.println("Printer Name : "+printerName +" Ink Used : " + inputInk);

		for (int i = 65; i < 91; i++) {
			System.out.print((char) i + "\t");
		}
	}

}

public class AlphabetPrintingMachine {
	public static void main(String[] args) {
		AlphabetMould alphabetMould = new AlphabetMould();
		alphabetMould.print("Canon-101","Yellow");
	}
}
