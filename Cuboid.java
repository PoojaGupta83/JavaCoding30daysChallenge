import java.util.Scanner;
class Cuboid{
public static void main(String d[]){
int length=0,breadth=0,height=0;
float area=0.0f,volume=0.0f;
System.out.println("Enter the length,breadth,height");
Scanner sc=new Scanner(System.in);
length=sc.nextInt();
breadth=sc.nextInt();
height=sc.nextInt();
area=2*((length*breadth)+(breadth*height)+(height*length));
volume=length*breadth*height;
System.out.println("Area of Cuboid="+area);
System.out.println("volume of Cuboid="+volume);
}
}