import java.util.*;
class Factors{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s="";
for(int i=1;i<=n;i++){
if(n%i==0) s=s+i+",";
}for(int i=0;i<s.length()-1;i++)
System.out.print(s.charAt(i));
}}