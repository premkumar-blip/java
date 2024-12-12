package javaprogram; //write a java program to print 20to1 in reverse order using array without using build in  function
import java.util.*;
public class ArrayReversed {
	public static void main(String args[]) {
		int a[]=new int[20];
		for(int i=0;i<=a.length;i++) {
			int Array=+i;
			System.out.println(Array);
			
		}
		System.out.println("THE REVERSED ARRAAY IS:");
		for(int i=a.length-1;i>0;i--) {
			int Reversed=i;
			System.out.println(Reversed);
		}
		}}