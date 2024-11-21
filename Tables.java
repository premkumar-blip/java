package javaprogram;
import java.util.*;//write tables task
public class Tables {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number between 1-10");
		int a=obj.nextInt();
		if(a<=10) {
			System.out.println("the table is:"+a);
			for(int i=1;i<=10;i++) {
				System.out.println(i+ "X" +a+ "=" + (i* a));
			}}
			else {
				System.out.println("enter the correct number");
			}
		}
	}


