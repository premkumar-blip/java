package javaprogram;//task leap year program
import java.util.*;
public class LeapyearProgram {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the year");
	int year=obj.nextInt();
	if((year%4==0&&year%100!=0)||(year%400==0)) {
		System.out.println("the give year is leap year");}
		else 
			System.out.println("not a leap year");
			
	}

}
