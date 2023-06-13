import java.util.*;
class Smallest_lar_arr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[n-1]);
int sum=0;
for(int i:a)sum+=i;
System.out.println(sum);
System.out.println((double)sum/n);
System.out.println("2nd lar:"+a[n-2]);
for(int i=n-2;i>=0;i--){
if(a[i]!=a[n-1]){System.out.print(a[i]);break;}
}

}}