import java.util.Scanner;
public class ReadKeyboard{
public static void main(String h[]){
int x =0;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
System.out.println(sc.useRadix(2));
System.out.println(x);
}
}
