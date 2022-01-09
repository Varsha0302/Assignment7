package v;
import java.util.*;
public class factorial {

 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int no=sc.nextInt();
     int factorial = fact(no);
     System.out.println("FACTORIAL of "+no+" = "+factorial);
 //another way of calling a function
 //comment above two lines if you want to use this
     //System.out.println("FACTORIAL of "+no+" = "+fact(no));
 }
 
 static int fact(int n)
 {
 int i,f=1;
     for(i=1;i<=n;i++)
     {
         f=f*i;
     } 
     return f;
 
}

}
