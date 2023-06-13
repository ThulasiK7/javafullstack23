import java.util.*;
class Arraylist4
{
public static void main(String args[])
{
List<Integer>numbers=new LinkedList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+number);
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);
System.out.println("List:"+numbers);


}}
