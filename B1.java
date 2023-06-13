 class B1{
public static void main(){
System.out.println("main method without arg called");
}
public static void main(String args[]){
System.out.println("main method with str arg");
main();
main(10);
}
public static void main(int x){
System.out.println("main method with int called"+x*2);
}}