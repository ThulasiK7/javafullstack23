class Array2
{
public static void main(String args[])
{
int[] numbers={2,3,4,5,-6,-7,8,9,12,13};
System.out.println("Using for-each loop");
int sum=0;
for(int number:numbers)
{
sum+=number;
}
int arrayLength=numbers.length;
double average=((double)sum/(double)arrayLength);
System.out.println("Sum: "+sum);
System.out.println("Average: "+average);
}
}