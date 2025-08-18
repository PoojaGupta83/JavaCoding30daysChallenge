class RemoveExtraSpace{
public static void main(String s[]){
String str="abc   def   jwj";
System.out.println(str.replaceAll("\\s+",""));
}
}