class A1{
public void sleep(){
System.out.println("sleeping");
}
public void eat(){
System.out.println("eating");
}
public void runn(){
System.out.println("running");
}
public void walk(){
System.out.println("walking");
}
}
class BB{
public static void main(String args[]){
A1 ob=new A1();
ob.sleep();
ob.eat();
ob.runn();
A1 ob1=new A1();
ob1.walk();
ob1.sleep();
}
}