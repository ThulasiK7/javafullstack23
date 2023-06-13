class Thread3 extends Thread{
public static int a=0;
public static void main(String args[]){
Thread3 ob=new Thread3();
ob.start();
while(ob.isAlive()){System.out.println("wait..");}
System.out.println("main:"+a);
a++;
System.out.println("main:"+a);
}
public void run(){a++;}
}