cass Animal{void move(){System.out.println("Animals ");}}
class Wild extends Animal{void move(){System.out.println("wild");}}
class Pet extends Animal{void move(){System.out.println("pet");}}

class TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal b=new Wild();
Animal c=new Pet();
a.move();
b.move();c.move();
}}