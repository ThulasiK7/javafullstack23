import java.util.*;
class Alphabetornot{
public static void main(String args[]){
System.out.println("enter a character:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
System.out.println();
if((ch>='a'&&ch<'z')||(ch>='A'&&ch<='Z'))
System.out.println(ch+"is alphabet");
else if(ch>='0'&&ch<='9') System.out.println(ch+"is a digit");
else System.out.println(ch+"is a special character");
}}