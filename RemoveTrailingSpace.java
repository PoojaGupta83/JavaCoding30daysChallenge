class RemoveTrailingSpace{
public static void main(String d[]){
String str="    abc  vbn   ssss    ";
System.out.println(str.replaceAll("\\s+","").trim());
}
}
