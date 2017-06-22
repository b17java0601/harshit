class User
{
public static void main(String args[])
{
for(int p=1;p<=5;p++)
{
	for(int k=4;k>=p;k--)
{
System.out.print("  ");
}
	for(int q=p;q>=1;q--)
	{
		System.out.print(q);	
	}
	System.out.println();
}
}
}