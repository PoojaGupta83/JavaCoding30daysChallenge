import java.util.Scanner;
public class QuadraticRoots{
public static void main(String d[]){
int a,b,c=0;
double disc=0.0;
double r1,r2=0.0;
System.out.println("Enter the value of a ,b and c");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
disc=Math.sqrt(b*b-(4*a*c));
r1=(-b+disc)/2*a;
r2=(-b-disc)/2*a;
System.out.println("First root of Quadratic equation="+r1);
System.out.println("Second root of Quadratic equation="+r2);

}
}