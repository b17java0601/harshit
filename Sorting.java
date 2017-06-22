import java.util.Scanner;

class User
{
public static void main(String args[])
{
int x=0,temp;
int m[]=new int[50];
int num[]=new int [50];
int var[]=new int [0];
Scanner s=new Scanner(System.in);
System.out.println("enter the length of the array");
int n=s.nextInt();
System.out.println("enter the elements of array 1");
for(int i=0;i<n;i++)
num[i]=s.nextInt();

for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(num[i]>num[j]) 
{
temp=num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.println(num[i]);
}
}}
