package com.myapp.oop;

interface Wheels {
	public void useWheels();
}

class SpokeWheel implements Wheels {

	@Override
	public void useWheels() {
		System.out.println("Spoke Wheels Used....");
	}

}

class AlloyWheel implements Wheels {

	@Override
	public void useWheels() {
		System.out.println("Alloy Wheels Used....");
	}

}

class Brezza {
	public void chooseWheels(Wheels wheels) {
		wheels.useWheels();
	}
}

public class InterfaceExample4 {
	public static void main(String[] args) {

		Wheels spokeWheel = new SpokeWheel();
		Wheels alloyWheel = new AlloyWheel();

		Brezza brezza=new Brezza();
		brezza.chooseWheels(alloyWheel);
	}
}
