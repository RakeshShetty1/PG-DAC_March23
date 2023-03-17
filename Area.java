import java.util.*;
class Area{
	
	final double pi =3.14;
	
    void circleArea(double r){
		double area = pi*r*r;
		System.out.println("Area of Circle: "+area);
	}
	
	void triangleArea(double b,double h){
		double area = (b*h)*0.5;
		System.out.println("Area of Triangle: "+area);
	}
	
	void rectangleArea(double l,double w){
		double area = l*w;
		System.out.println("Area of Rectangle: "+area);
	}
	
	void squareArea(double s){
		double area = s*s;
		System.out.println("Area of Square: "+area);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Area Calculator"+"\n"+"\n"+
		"1. Area of Circle"+"\n"+
		"2. Area of Triangle"+"\n"+
		"3. Area of Rectangle"+"\n"+
		"4. Area of Square");
		System.out.println();
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println();
		Area a1 = new Area(); 
		switch(num){
			case 1: System.out.println("Circle");
			        System.out.print("Enter Radius(r): ");
			        double r = sc.nextInt();
			        a1.circleArea(r);
			        break;
			case 2: System.out.println("Triangle");
			        System.out.print("Enter Base(b): ");
			        double b = sc.nextInt();
					System.out.print("Enter Height(h): ");
			        double h = sc.nextInt();
			        a1.triangleArea(b,h);
		         	break;
			case 3: System.out.println("Rectangle");
			        System.out.print("Enter Length(l): ");
			        double l1 = sc.nextInt();
					System.out.print("Enter Width(w): ");
			        double w1 = sc.nextInt();
			        a1.rectangleArea(l1,w1);
					break;
			case 4: System.out.println("Square");
			        System.out.print("Enter Side(s): ");
			        double s = sc.nextInt();
					a1.squareArea(s);
					break;
			default: System.out.print("Enter a valid number");
		}
	}
}