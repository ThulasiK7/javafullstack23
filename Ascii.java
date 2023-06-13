import java.util.*;
class Ascii{
public static void main(String args[]){
System.out.println("enter a character:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int ascii=(int)ch;
System.out.println("ascii of"+ch+" is "+ascii);
}}