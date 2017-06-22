
public class Circle {
private double radius;
public Circle(double radius)
{
	this.radius=2;
}
public Circle()
{
	this(0);
}
public double getArea()
{
	return this.radius*this.radius*Math.PI;
	
}
public static void main(String args[])
{
	Circle c=new Circle();
	System.out.println(c.getArea());
	
}
}
