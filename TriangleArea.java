import java.util.Scanner;
class TriangleArea{
public static void main(String args[]){
float base=0.0f,height=0.0f,area=0.0f;
System.out.println("Enter the base and height");
Scanner sc=new Scanner(System.in);
base=sc.nextFloat();
height=sc.nextFloat();
area=(base*height)/2;
System.out.println("Area of triangle="+area);
}
}