import java.util.*;
class Main9
{
public static void main(String args[])
{
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("Horse");
animals.add("Cat");
String Element=animals.get(2);
System.out.println("Element at index 2:"+Element);
Iterator<String>iterate=animals.iterator();
System.out.println("Vector:");
while(iterate.hasNext())
{
System.out.print(iterate.next());
System.out.print(",");
}}}


