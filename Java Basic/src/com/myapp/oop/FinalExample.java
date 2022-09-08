package com.myapp.oop;

/*final Keyword  : variable , method , class*/
/*
 * variable : can not change value
 * Method : can not override methods
 * Class : can not inherit the classes
 * */
final class PasswordManager {
	final String password = "ABC";

	/*
	 * public void changePassword() { password = "XYZ"; }
	 */
	// final can not be override
	public final void printPassword() {
		System.out.println("Current Password : " + password);
	}
}

/*
 * class Gallary extends PasswordManager { // can not override final methods
 * 
 * public void printPassword() {
 * 
 * }
 * 
 * }
 */

public class FinalExample {
	public static void main(String[] args) {
		// Gallary gallary = new Gallary();
		// gallary.printPassword();

		// gallary.changePassword();

		// gallary.printPassword();

		PasswordManager manager = new PasswordManager();
		manager.printPassword();
	}
}
