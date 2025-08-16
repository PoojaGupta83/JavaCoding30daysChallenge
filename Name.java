import java.util.Scanner;
public class Name
{
public static void main(String args[]){
String name;
System.out.println("May I know your name");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("Welcome"+" "+name);
}
}