class Animal{void move(){System.out.println("Animals can move");}}
class Dog extends Animal{void move(){System.out.println("dogs can walk,run");}}
class Testdog{
public static void main(String args[]){
Animal a=new Animal();
Animal b=new Dog();
a.move();
b.move();
}}