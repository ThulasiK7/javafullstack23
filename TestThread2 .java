class TestThread2 extends Thread{
public static void main(String args[]){
TestThread2 ob=new TestThread2();
ob.start();
System.out.println("inside of thread");
}
public void run(){
System.out.println("This code is overridden");
}}