class Parent extends Child {
int z;
Parent ()
{ 
System.out.println("this is z");
z=10;
}
void display()
{
	System.out.println("the parent class"+" "+z);
}
}
 class Child 
 {
	 int y;
	 Child ()
	 {
		 
		 System.out.println("this is y");
		 y=20;
		 
	 }
	 void show()
	 {
		 
	System.out.println(y+" "+y);
		 	
	 }
 }
class Demo 
{
	
	public static void main(String args[])
	{
		Parent  p=new Parent();
		p.show();
        p.display();
        System.out.println("the parent class"+" "+);
	}
}
