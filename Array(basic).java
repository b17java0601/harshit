import java.util.Scanner;
class User
{
public static void main(String args[])
{
int num[][];
num=new int [3][2];
int i,j;
System.out.println("enter elements");
Scanner s=new Scanner(System.in);
for(i=0;i<3;i++)
{
for(j=0;j<2;j++)
{
num[i][j]=s.nextInt();
}
System.out.println();
}
for(i=0;i<3;i++)
{
	for(j=0;j<2;j++)
	{
		System.out.print(num[i][j]);
	}
	System.out.println();
}
}
}
