class User
{
public static void main(String args[])
{
int i,j,x;
for(i=2;i<=100;i++)
{
x=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{	
x=1;
break;
}
}
if(x==0)
System.out.println(i);
}
}
}
