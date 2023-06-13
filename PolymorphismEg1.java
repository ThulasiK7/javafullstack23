import java.util.*;
class PolymorphismEg1{
void print(){System.out.println("welcome");}
void print(String n){System.out.println("welcome "+n);}
}
class Test{
public static void main(String args[]){
PolymorphismEg1 ob=new PolymorphismEg1();
ob.print();
Scanner sc=new Scanner(System.in);
String str=sc.next();
ob.print(str);
}}