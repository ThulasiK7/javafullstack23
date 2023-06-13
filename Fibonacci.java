import java.util.*;
class Fibonacci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1,sum=0;
while(sum<=n){
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;
}}}
