package javaprogram;
import java.util.*;
public class AverageofElementsArray {
	public static void main(String args[])throws Exception {
		int[] array= {2,4,8,5,6};
		int sum=0;
		for(int i=0;i<=array.length;i++) {
			sum+=array[i];
		}
		double average=(double)sum/array.length;
		System.out.println("Average of the Array is :"+average);
	}

}
