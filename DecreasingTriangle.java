package javaprogram;
import java.util.*;

public class DecreasingTriangle {
	public static void main(String[]args) {
		int i,j,n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the input value");
		n=obj.nextInt();
		for( i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--) 
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
		
	}

}
