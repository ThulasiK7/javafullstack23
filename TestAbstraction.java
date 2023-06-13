abstract class Shape{abstract void draw();}
class Rectangle extends Shape{
void draw(){System.out.println("rectangle");}}
class Circle extends Shape{
void draw(){System.out.println("circle");}}
class TestAbstraction{
public static void main(String args[]){
Shape ob=new Rectangle();Shape obj=new Circle();
ob.draw();obj.draw();
}}