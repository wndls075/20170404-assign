public class Circle {

	public double radius;
	
	public static double PI = 3.141592;
	
	//생성자 구현
	public Circle(double radius){
		this.radius = radius;
	}
	
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea(){
		return radius * radius * PI;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

}

------------------------------------------------------------------------------------------------------------------------------------------


public class Cylinder extends Circle{

	double h;
	double m = getArea();

	public Cylinder(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getVolume(double h,double circle){
		this.m = circle;
		this.h = h;
		return h*circle;
	}
	
	public static void main(String[] args){
		
		Cylinder c = new Cylinder(2.8);
		c.h = 5.6;
		System.out.println(c.getVolume(c.h,c.m));
		
	}

}
