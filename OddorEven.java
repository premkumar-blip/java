package javaprogram;
import java.util.*;//odd or even task

public class OddorEven {
	public static void main(String[]args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the number");
		int num=obj.nextInt();
		if(num%2==0) {
			System.out.println("this number is even");
		}
		else {
			System.out.println("odd number");
		}

	}

}
