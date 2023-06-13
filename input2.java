import java.util.Scanner;
class Input2{
public static int add(int a,int b){
int c=a+b;
return c;
}
public static int sub(int a,int b){
return a-b;
}
public static int mul(int x,int y){
return x*y;
}
public static double div(int a,int b){
double c=a/b;
return c;
}
public static int mdiv(int a,int b){
return a%b;
}
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter a num:");
int num1=scob.nextInt();
System.out.println("enter a num:");
int num2=scob.nextInt();
System.out.println("num1="+num1+",num2"+num2);
System.out.println(num1+"+"+num2+"="+add(num1,num2));
System.out.println(num1+"-"+num2+"="+sub(num1,num2));
System.out.println(num1+"*"+num2+"="+mul(num1,num2));
System.out.println(num1+"/"+num2+"="+div(num1,num2));
System.out.println(num1+"%"+num2+"="+mdiv(num1,num2));
}
}