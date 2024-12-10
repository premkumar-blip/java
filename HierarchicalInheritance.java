package javaprogram;
class Maths{
		int num=30;
	}
class A extends Maths{
		int num1=2;
	}

class B extends Maths{
		int num2=5;
	}

class C extends Maths{

		int num3=5;
	}
public class HierarchicalInheritance {
	public static void main(String[]args) {
		C division=new C();
		B Addition=new B();
		A squre=new A();
		System.out.println("num*num1="+squre.num*squre.num1);
		System.out.println("num+num2="+Addition.num + Addition.num2);
		System.out.println("num/num3="+division.num/division.num3);
		
	}

}
