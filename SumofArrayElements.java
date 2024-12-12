package javaprogram;//write a java program sum of elements in array
import java.util.*;
public class SumofArrayElements {
	public static void main(String args[]) {
	int[]array= {2,4,6,8,5};
	int sum=0;
	for(int i=0 ;i<array.length;i++) 
	{
		sum+=array[i];
	}
System.out.println("Sum of the array  is :"+sum);
}
	}
