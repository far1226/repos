package com.hdfc.loans.carloans;

public class Childclass extends FirstAbstract {

	public static void main(String[] args) {
		
		Childclass c = new Childclass();
				c.m1();
		        c.m2();
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
			System.out.println("Im m2 an overridden child class from FirstAbstract ");
		
		
	}
	
	
	
}
