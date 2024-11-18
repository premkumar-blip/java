package javaprogramming;
// task
import java.util.*;
public class ReturnType {
	static int addNumbers(int a,int b) {
		int c=a+b;
		return c;
		
	}
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		int a;
		System.out.println("enter the value A");
		a=obj.nextInt();
		System.out.println("the value of A:" +a);
		
		int b;
		System.out.println("enter the value B");
		b=obj.nextInt();
		System.out.println("the value B:" +b);
		

		int c=addNumbers(a,b);
		System.out.println("the result value is"+" "+c);
	}

}
 