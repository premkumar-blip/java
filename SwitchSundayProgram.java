package javaprogramming;
import java.util.*;

public class SwitchSundayProgram {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		int variable;
	System.out.println("please enter the number in between 1-7");
         variable=obj.nextInt();
         switch(variable) {
         case 1:
 			System.out.println("sunday");
 			break;
 		case 2:
 			System.out.println("monday");
 			break;
 		case 3:
 			System.out.println("tuesday");
 			break;
 			
 		case 4:
 			System.out.println("wednesday");
 			break;
 		case 5:
			System.out.println("the value of one");
			break;
		case 7:
			System.out.println("saturday");
			break;
		case 6:
			System.out.println("friday");
			break;
 			default:
 				System.out.println("please enter the correct value");	
 		
         }
	}}
         