import java.util.Scanner;

class User
{
public static void main(String args[])
{
int i,j,x=0,num;
Scanner s=new Scanner(System.in);
System.out.println("enter a no");
num=s.nextInt();

for(j=2;j<num;j++)
{
if(num%j==0)
{	
x=1;
break;
}
x=0;
}
if(x==0)
System.out.println(num +" "+ "its a prime no");
else
System.out.println(num +" " +"its not prime");	
	
}
}

