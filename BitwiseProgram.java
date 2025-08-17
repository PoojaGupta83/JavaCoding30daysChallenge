class BitwiseProgram{
public static void main(String st[]){
int x=0b1010;
int y=0b0110;
int z=0,r=0,t=0,u=0,v=0;
z=x&y;
System.out.println("And operation"+z);
r=x|y;
System.out.println("or operation"+r);
t=x^y;
System.out.println("not operation"+t);
u=x>>1;
System.out.println("Right Operand"+u);
v=x<<1;
System.out.println("Left Operand"+v);
System.out.println(Integer.toBinaryString(x));


}
}


