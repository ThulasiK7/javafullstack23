import java.util.*;
class Diamondpattern{
public static void printline(char ch1,int nhash,char ch2,int nstar){
for(int i=0;i<nhash;i++)System.out.print(ch1);
for(int i=0;i<nstar;i++)System.out.print(ch2);
for(int i=0;i<nhash;i++)System.out.print(ch1);}


public static void upper(int n,char c){int i,j;
for(i=n/2,j=1;i>0&&j<n;i--,j+=2){
printline('#',i,c,j);System.out.println();}}


public static void lower(int n,char c){int i,j;
for(i=0,j=n;i<=n/2&&j>=1;i++,j-=2){
printline('#',i,c,j);System.out.println();}}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char c=sc.next().charAt(0);
upper(n,c);
lower(n,c);
}}