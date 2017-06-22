class User
{
public static void main(String args[])
{
int x=1;
for(int p=1;p<=4;p++)
{
	for(int k=4;k>=p;k--)
	{
		System.out.print("  ");
	}
	for(int q=x;q>=1;q--)
	{
		System.out.print("* ");
		
	}
	x=x+2;
	System.out.println();
}
}
}