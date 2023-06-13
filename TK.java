class A{
public void funa1(){
System.out.println("funa1 called from class a");
}
public void funa2(){
System.out.println("funa2 called from class a");
}
}
class B{
public static void main(String args[]){
A ob=new A();
ob.funa1();
ob.funa2();
}
}