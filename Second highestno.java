import java.util.Scanner;


class User
{
public static void main(String args[])
{
int num,y = 0, x = 0;
int a[]=new int[5];
int var[]=new int[1];
Scanner s=new Scanner(System.in);
System.out.println("enter the no in array"); 
for(int i=0;i<a.length;i++)
a[i]=s.nextInt();
System.out.println("Second Largest No");

for(int i=0;i<a.length;i++)
{
if (a[i]>var[0])
{
var[0]=a[i];
x=var[0];
}
}
for(int i=0;i<a.length;i++)
{
if(a[i]>y && a[i]<x)
y=a[i];
var[0]=y;
}
System.out.println(var[0]);
}
}
