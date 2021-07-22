package org.jav;

public class Class {
	private void nameTwo() {
		// TODO Auto-generated method stub
		System.out.println("nameTwo");
	}
	public static void main(String[] args) {
		int a[] = new int[3];
		a[1]=10;
		a[2]=20;
		a[0]=30;
		int d=0;
			System.out.println(a[0]);
		int b = a.length;
			System.out.println(b);
			
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
				
		}
		
			for (int c : a) {
				System.out.print(c+" ");
				d = d+c;
			}
		System.out.println("\ntotal is "+d);						
	}

}
