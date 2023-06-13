import java.util.*;
class Day8exam{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double i=sc.nextDouble();
double j=sc.nextDouble();
double k=sc.nextDouble();
double ans=(i*j*k)/100;
if(ans%1==0)
System.out.println((int)ans);
else
System.out.println(ans);

}}