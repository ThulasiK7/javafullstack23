class Animal{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void eat(){System.out.println("eating..bread...");}
void work(){
super.eat();eat();
}}
class Testsuper2{
public static void main(String args[]){
Dog d=new Dog();
d.work();}}