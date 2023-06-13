import java.util.*;



class Armstrongnum{
public static int lendigit(int n){
int len=0;
while(n>0){len++;n=n/10;}
return len;}


public static boolean check(int n){
int sum=0,exp=lendigit(n),num=n;
while(num>0){sum+=Math.pow((num%10),exp);num/=10;}
return n==sum;
}



public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
if(check(n1)) System.out.println("YES");
else System.out.println("NO");}}