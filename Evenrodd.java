import java.util.Scanner;
class Evenrodd{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter a num:");
int n=scob.nextInt();
if(((n/2)*2)==n)
System.out.println("EVEN");
else
System.out.println("ODD");
}
}