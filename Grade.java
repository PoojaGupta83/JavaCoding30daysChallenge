import java.util.Scanner;
class Grade{
public static void main(String h[]){
int m1,m2,m3=0;
float avg=0.0f;
System.out.println("Enter the marks");
Scanner s1=new Scanner(System.in);
m1=s1.nextInt();
m2=s1.nextInt();
m3=s1.nextInt();
avg=(m1+m2+m3)/3;
if(avg>=70 && avg<=100)
System.out.println("A");
else if(avg<70 && avg<50)
System.out.println("B");
else
System.out.println("C");
}
}

