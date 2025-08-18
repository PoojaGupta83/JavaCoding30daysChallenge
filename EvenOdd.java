import java.util.Scanner;
class EvenOdd{
public static void main(String d[]){
int n=0;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%2==0)
System.out.println("Number is Even");
else if(n%2!=0)
System.out.println("Number is Odd");
else
System.out.println("Anonymous Number");
}
}