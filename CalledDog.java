package javaprogram;

public class CalledDog {
	String name;
	String color;
	CalledDog(String name,String color){
		this.name=name;
		this.color=color;
		}
		void display() {
			System.out.println("name" +" "+ name+" "+"color"+ " "+ color);
		}
		public static void main(String[] args) {
			CalledDog p1=new CalledDog("Batman","pink");
			p1.display();
	}

}
 