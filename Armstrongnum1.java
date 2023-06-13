import java.util.*;
class Armstrongnum1{
public static boolean check(int num){
int original=num,sum=0,digits=String.valueOf(num).length();
while(num>0){int digit=num%10;sum+=Math.pow(digit,digits);num/=10;}
return num==sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
if(check(n1)) System.out.println("YES");
else System.out.println("NO");}}