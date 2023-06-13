import java.util.Scanner;
class Evenodd{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter a num:");
int n=scob.nextInt();
if(n%2==0)
System.out.println("EVEN");
else
System.out.println("ODD");
}
}