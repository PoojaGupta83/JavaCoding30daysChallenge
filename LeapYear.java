import java.util.Scanner;
class LeapYear{
public static void main(String d[]){
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int year;
year=sc.nextInt();

if(year%4==0)
{
if(year %100==0){
{
if(year%400==0){
System.out.println("Given Year is leap year");
}
else
System.out.println("Given Year is not leap year");
}
else
System.out.println("Given Year is not leap year");
}

}