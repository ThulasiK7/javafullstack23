import java.util.*;
class Replaceall{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String c=sc.next();
String ch=sc.next();
String str=s.replaceAll(c,ch);
System.out.println(str);
}}
