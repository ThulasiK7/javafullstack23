import java.util.*;
class Test8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double P=sc.nextDouble();
double T=sc.nextDouble();
double R=sc.nextDouble();
double ans=(P*T*R)/100;
if(ans%1==0)
System.out.println((int)ans);
else
System.out.println(ans);
}
}