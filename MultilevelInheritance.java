package javaprogram;
class GrandFather{
	public void pattaivatten() {
		System.out.println("This is my Grandfather");
		
	}
}
class Father extends GrandFather{
	public void Beeman() {
		System.out.println("This is my Father");
	}
}
class Son extends Father{
	public void Prem() {
		System.out.println("This is me PREMKUMAR");
	}
	
}

public class MultilevelInheritance {
	public static void main(String[]args) {
		Son prem=new Son();
			prem.Prem();
			prem.Beeman();
			prem.pattaivatten();
	}

}
