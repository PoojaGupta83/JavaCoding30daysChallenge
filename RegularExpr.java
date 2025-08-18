class RegularExpr{
public static void main(String d[]){
String str="a";
System.out.println(str.matches("."));
System.out.println(str.matches("[abc]"));
System.out.println(str.matches("^[abc]"));
System.out.println(str.matches("[abc][vz]"));
System.out.println(str.matches("[a-z][0-7]"));
System.out.println(str.matches("a|b"));
System.out.println(str.matches("ab"));

System.out.println(str.matches("\\d"));
System.out.println(str.matches("\\D"));
System.out.println(str.matches("\\w"));
System.out.println(str.matches("\\W"));
System.out.println(str.matches("\\s"));
System.out.println(str.matches("\\S"));




}
}