import java.util.*;
class SortElement
{
public static void main(String args[])
{
int n,x,i=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter no.of elements you want in array: ");
n=s.nextInt();
int[] a=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i1:a) System.out.println(i1);
}
}