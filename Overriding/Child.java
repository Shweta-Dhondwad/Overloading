package Overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	void m1(int a,int b)throws ArithmeticException{
		System.out.println("hello");
	}
	
}
public class Child extends Parent  {
	 void m1(int a,int b){
		System.out.println("jello");
	}
	 public static void main(String[] args) {
	Parent c=new Child();
	c.m1(0, 5);
		}

}
