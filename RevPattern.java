import java.util.*;
class RevPattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print("#");
}
for(int k=1;k<=i;k++)
{
System.out.print(ch);
}
System.out.println();
}
}
}
