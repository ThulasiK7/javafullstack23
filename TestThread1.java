class TestThread1 extends Thread{
public static void main(String args[]){
TestThread1 ob=new TestThread1();
ob.start();
System.out.println("outsisde of thread");
}
public void run(){
System.out.println("This code is running");
}}