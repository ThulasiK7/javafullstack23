class TestThread3{
public static void main(String args[]) throws Exception{
Thread t=Thread.currentThread();
System.out.println("currentThread="+t);
t.setName("TK");
t.setPriority(t.getPriority()-1);
System.out.println("current="+t);
System.out.println("name="+t.getName());}}