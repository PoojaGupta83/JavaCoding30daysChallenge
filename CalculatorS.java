
import java.util.*;
class CalculatorS
{
public static void CalculatorS(Scanner sc)
{
	int a=0,b=0,result=0;
	String operator;
	
	System.out.println("Enter the 1st number");
	a=sc.nextInt();
	
	System.out.println("Enter the 2nd number");
	b=sc.nextInt();
	
	System.out.println("select an operator(+,-,*,/)");
    operator=sc.next();
	
    switch(operator)
   {
     case "+":
	     result=a+b;
		 System.out.println("Result=" +result);
		 break;
		 
	 case "-":
	     result=a-b;
		 System.out.println("Result=" +result);
		 break;
		 
	case "*":
	     result=a*b;
		 System.out.println("Result=" +result);
		 break;
		 
	case "/":
	     result=a/b;
		 System.out.println("Result=" +result);
		 break;
	
	default:
	     break;
	
   }
 
}
   public static void main(String args[])
   {
	   
	   Scanner s=new Scanner(System.in);
	   CalculatorS(s);
	  	
   }
}