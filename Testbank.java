abstract class Bank{abstract int interest();}
class SBI extends Bank{
int interest(){return 7;}}
class PNB extends Bank{
int interest(){return 8;}}
class Testbank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println(b.interest());
b=new PNB();
System.out.println(b.interest());
}}