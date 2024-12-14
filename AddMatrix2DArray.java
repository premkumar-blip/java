package javaprogram;//getting input from user
import java.util.*;
public class AddMatrix2DArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int rows=3;
		int cols=3;
		int [][]a=new int[rows][cols];
		int [][]b=new int[rows][cols];
		System.out.println("Enter the element for the first matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the elements for a["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element for second matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("eEnter the element for b["+i+"]["+j+"]");
				b[i][j]=sc.nextInt();
				
			}
		}
		int [][]c=new int [rows][cols];
		System.out.println("the sum of the matrix is:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"");
			}
			System.out.println();
		}
		}

}
