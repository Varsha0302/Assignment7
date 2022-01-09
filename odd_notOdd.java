package v;
import java.util.Scanner;
public class odd_notOdd {
	
	public static void main (String args[]){

	Scanner scan=new Scanner(System.in);
	//create a scanner object for input

	System.out.print("Enter the number for check odd or not a odd: ");

	int num=scan.nextInt();
	//reads the value from the user
	find_Odd(num);//calling the method
	}

	//create a user defined metod
	static void find_Odd(int num){//method definition
	if(num%2==0) 
	    System.out.println(num+" is not a odd  false"); 
	else 
	    System.out.println(num+" is a odd  true");
	}
	}





