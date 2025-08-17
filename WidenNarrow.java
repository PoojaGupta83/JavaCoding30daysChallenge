class WidenNarrow{
public static void main(String ds[]){
byte b=10;
System.out.println(b);
short s=10;
int i=10;
long l=10l;
float f=10.1f;
double d=10.0;
char c=10;
s=b;
i=b;
l=b;
f=b;
b=(byte)i;
f=(float)d;
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(b);
System.out.println(d);
}
}