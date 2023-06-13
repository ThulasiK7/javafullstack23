import java.util.Scanner;
class Evenrodd1{
public static boolean iseven(int n){
return((n/2)*2==n);
}
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter a num:");
int n=scob.nextInt();
if(iseven(n))
System.out.println("EVEN");
else
System.out.println("ODD");
}}