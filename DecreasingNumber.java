package javaprogram;
import java.util.*;

public class DecreasingNumber {
	public static void main (String[]args) {
		int i,j,n;
		System.out.println("enter the number");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int a=1;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(a); 
				}
			
				System.out.println();
			a++;
		}
	}

}
