package javaprogram;
import java.util.*;
public class AmstrongNumber {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enetr the number");
		int n=obj.nextInt();
		int n1=n;
		int n1,result=0;
		while(n>0) {
			n1=n%10;
			result+=n1*n1*n1;
			n=n/10;
		}
		if(n1==result)
			System.out.println("the number is armstrong number");
		else
			System.out.println("not armstrong number");
		
	}

}
