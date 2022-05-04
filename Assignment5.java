package Main;
abstract class Shape
{
	float area, peremeter;
	public Shape()
	{

	}
	abstract void getArea();
	abstract void getPeremeter();
}
class Tringle extends Shape
{
	float side1, side2, side3;

	Tringle(float side1, float side2, float side3)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public void getArea()
	{
		float s = (float) (0.5*(side1 + side2 + side3));
		area = (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("Area of Tringle : " + String.valueOf(area));
	}
	public void getPeremeter()
	{
		peremeter = side3 + side2 + side1;
		System.out.println("Peremeter of Tringle : "+ String.valueOf(peremeter));
	}
}
class Rectangle extends Shape
{
	float width, height;

	Rectangle(float width, float height)
	{
		super();
		this.width = width;
		this.height = height;
	}
	public void getArea()
	{
		area = width*height;
		System.out.println("Area of Rectangle : " + String.valueOf(area));
	}
	public void getPeremeter()
	{
		peremeter = 2*(width + height);
		System.out.println("Peremeter of Rectangle : "+ String.valueOf(peremeter));
	}
}
