class Sample
{
int x=10,y=20;
void sum()
{
x=x+y;
y=x-y;
x=x-y;
System.out.println("x="+x+" "+"y="+y);
}
public static void main(String args[])
{
System.out.println("x=10");
System.out.println("y=20");
Sample obj=new Sample();
obj.sum();
}
}
