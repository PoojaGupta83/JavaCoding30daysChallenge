import java.util.Scanner;

class AreaOfTriangleThreeSides{
public static void main(String rgds[]){
int a,b,c=0,s=0;
System.out.println("Enter the sides");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
s=(a+b+c)/2;
double area=0.0;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of Triangle Using 3 sides"+area);
}
}

