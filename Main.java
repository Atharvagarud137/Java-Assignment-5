package Main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
	{
		float t1,t2,t3,l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st side of triangle:");
		t1=sc.nextFloat();
		System.out.println("Enter 2nd side of triangle:");
		t2=sc.nextFloat();
		System.out.println("Enter 3rd side of triangle:");
		t3=sc.nextFloat();
		System.out.println("Enter length of rectangle:");
		l=sc.nextFloat();
		System.out.println("Enter breadth of rectangle:");
		b=sc.nextFloat();
		Tringle t = new Tringle(t1, t2, t3);
		Rectangle r = new Rectangle(l, b);
		t.getArea();
		t.getPeremeter();
		r.getArea();
		r.getPeremeter();
    }
}
