class First implements Runnable{
Thread t;String s;
First(String Name){
s=Name;
t=new Thread(this,s);
System.out.println("CHILD:"+t);
t.start();
}
public void run(){
try{for(int i=5;i>0;i--){
System.out.println(s+":"+i);
Thread.sleep(1000);}}
catch(InterruptedException e){}
System.out.println("EXIT CHILD"+s);
}}
class Second1{
public static void main(String args[])throws Exception{
new First("t");new First("k");new First("b");
 
try{
Thread.sleep(20000);
}
catch(Exception e){}
System.out.println("exit main");
}}