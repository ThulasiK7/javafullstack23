abstract class Bike{abstract void run();}
class Honda4 extends Bike{
void run(){System.out.println("running");}
public static void main(String args[]){
Bike ob=new Honda4();
ob.run();}}