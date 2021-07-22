package Overriding;

class Scenario1{
	public Object m1(){
		return 5;
	}
}

public abstract class Scenario2 extends Scenario1 {
	
	 public abstract Object m1();

	public static void main(String[] args) {
		Scenario1 s=new Scenario1();
		System.out.println(s.m1());
	}
}
