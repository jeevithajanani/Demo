package org.tct.test;

public class Jeevi implements Test {
	public void current() {
		System.out.println("current:70%");

	}
	
	public static void main(String[] args) {
		Jeevi c=new Jeevi();
		c.current();
		c.empId();
		c.fixed();
		c.savings();
		
		
	}

	@Override
	public void empId() {
		System.out.println("empid is 100");
		
	}

	@Override
	public void savings() {
		
      System.out.println("savings :40%");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		
	}

	
	

}
