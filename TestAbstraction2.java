abstract class Bike{
Bike(){System.out.println("bike is created");}
abstract void run();
void gear(){System.out.println("gear changed");}}
class Honda extends Bike{
void run(){System.out.println("running");}}
class TestAbstraction2{
public static void main(String args[]){
Bike obj=new Honda();
obj.run();
obj.gear();
}}