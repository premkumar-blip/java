package Program;
import java.util.*;
public class AccesstheindexArray {
	public static void main(String args[])throws Exception{
		//String[] cars= {"Skoda","ford","mazda"};
		//Access the index
		//System.out.println(cars[0]);
		int myarray[]=new int[10];
		myarray[0]=9;
		myarray[1]=91;
		myarray[3]=99;
		myarray[4]=96;
		myarray[5]=100;
		System.out.println("contents of array");
		for(int element:myarray) {
			System.out.println(element);
		}
	}
		

}
