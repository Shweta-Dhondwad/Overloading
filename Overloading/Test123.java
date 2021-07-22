package Overloading;

public class Test123 {
	void m1(){
		System.out.println("Hello");
	}
	Object m1(Integer a){
		System.out.println(a);
		return a;
		
	}
	

	public static void main(String[] args) {
		Test123 t=new Test123();
		t.m1();
		t.m1(null);
	}

}
