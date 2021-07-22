package Overloading;

import java.util.Arrays;

class Animal {
	String s="ABC";
	int a=8;
	   protected void displayInfo() {
	      System.out.println("I am an animal.");
	   }
	}
	class Dog extends Animal {
		 String s="PQR";
int a=10;
	   public void displayInfo() {
	      System.out.println("I am a dog.");
	      super.displayInfo();
		  
	   }
	}

	class Main extends Dog{
		 void m1(){
			System.out.println("hellooooooooooo");
		}
	   public static void main(String[] args) {
Animal d1 = new Dog();
System.out.println(d1.s+d1.a);



	   /* //d1.displayInfo();
	    d1=null;
	    d1.m1();
	    
	   // Dog d2 = (Dog)d1;
       // d2.displayInfo();
		 //  main(s);
	  //  String[] s={"ANBC","DKFJ"};
	//	   main(s);
    System.out.println("helloooooo");
		   */
		  }
	}
