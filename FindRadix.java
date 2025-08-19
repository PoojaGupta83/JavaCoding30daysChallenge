import java.util.Scanner;
class FindRadix{
public static void main(String jh[]){
String num;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextLine();
if(num.matches("[01]+"))
System.out.println("Radix:Binary");
else if(num.matches("[0-7]+"))
System.out.println("Radix:Octal");
else if(num.matches("[0-7A-F]+"))
System.out.println("Radix:HexaDecimal");
else if(num.matches("[0-9]"))
System.out.println("Radix:Decimal");
}
}