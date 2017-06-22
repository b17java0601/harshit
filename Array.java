class User
{
public static void main(String args[])
{
int num[]={1,2,3,5,6,7,89,8,6,4},var[]={4,5,6};
int m[];
m=new int [50];
int k;
for(k=0;k<num.length;)
{ 
for(int i=0;i<num.length;i++)                            
{
m[k]=num[i];
k++;
}
}
for(k=num.length;k<num.length+var.length;)
{
for(int j=0;j<var.length;j++)
{
m[k]=var[j];
k++;
}
}
for(k=0;k<num.length+var.length;k++)
{
System.out.println(m[k]);
}
}
}



System.out.println("enter the length of the array");
int v=s.nextInt();
System.out.println("enter the elements of array 1");
for(int j=0;j<v;j++)
var[j]=s.nextInt();
System.out.println("sum of elements");

for(int i=0;i<n;i++)
{
x=x+num[i];
}
for(int j=0;j<n;j++)
{
x=x+num[j];
}
System.out.println("sum="+x);
}}
