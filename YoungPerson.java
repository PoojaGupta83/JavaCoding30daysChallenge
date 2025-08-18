import java.util.Scanner;
class YoungPerson{
public static void main(String s[]){
int age=0;
System.out.println("Enter the age");
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
if(age>14&&age<55)
System.out.println("Person is Young");
else
System.out.println("Person is not young");
}
} 
