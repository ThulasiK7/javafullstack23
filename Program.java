import java.util.Scanner;
class Program{
static int diff(int a,int b){return a-b;}
static int product(int a,int b){return a*b;}
static int smallest(int a,int b){if(a<b)return a; if(b<a) return b; return 0;}
static int largest(int a,int b){if(a>b)return a; if(b>a) return b; return 0;}
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter a num:");
int n1=scob.nextInt();
System.out.println("enter a num:");
int n2=scob.nextInt();
int result;
result=diff(n1,n2);
System.out.println("diff:"+result);
result=product(n1,n2);
System.out.println("Prod:"+result);
result=smallest(n1,n2);
System.out.println("smallest:"+result);
result=largest(n1,n2);
System.out.println("largest:"+result);
}}


