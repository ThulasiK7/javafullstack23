import java.util.*;
class Factorial{
public static int calfact(int n){
if(n==0)return 1;
else return n*calfact(n-1);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
if(i>=0) System.out.println(calfact(i));
else System.out.println("INVALID");}}