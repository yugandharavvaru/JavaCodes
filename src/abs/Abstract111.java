package abs;
abstract class Shape
     {
	abstract void draw();
	abstract double area();
	abstract void display();
     }
class Rectangle extends Shape
{
	double length;
	double breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	@Override
	void draw() {
		System.out.println("this is Rectangle");
	}
	@Override
	double area() {
		
		return length*breadth;
	}
	@Override
	void display() {
		System.out.println(length*breadth);
	}
	
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	void draw() {
		System.out.println("this is Circle");
		
	}
	@Override
	double area() {
		
		return 2*Math.PI*radius*radius;
	}
	@Override
	void display() {
		System.out.println( 2*Math.PI*radius*radius);
		
	}
}
class Square extends Shape
{
	double side;
	Square(double side)
	{
		this.side=side;
	}
	@Override
	void draw() {
		System.out.println("this is square");
	}
	@Override
	double area() {
		
		return side*side;
	}
	@Override
	void display() {
	System.out.println(side*side);
		
	}
}
public class Abstract111 {

	public static void main(String[] args) {
		
          Square s=new Square(5);
          s.draw();
          s.area();
          System.out.println("the area of the Square is :"+s.area());
          Rectangle r=new Rectangle(10, 6);
          r.draw();
          System.out.println("the area of the Rectangle is :"+r.area());
          Circle c=new Circle(5);
          c.draw();
          System.out.println("the area of the circle is :"+c.area());
        
         
	}

}
