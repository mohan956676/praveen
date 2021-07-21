package org.jav;

public class Classss implements Parent, Main {
	@Override
	public void savings() {
		System.out.println("10%");
	}
	@Override
	public void profit() {
		System.out.println("20%");
	}
	

	public static void main(String[] args) {
		Classss a = new Classss();
		a.profit();
		a.savings(); 
	}

}

