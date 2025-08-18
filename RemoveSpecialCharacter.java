class RemoveSpecialCharacter{
public static void main(String argd[]){
String s="a%73!@783*$";
System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
}
}
