package zy4;

public class S {double r;}
class Circle extends S{
	private final double PI=3.14;
	public Circle(double r){
	super();
	super.r=r;
	}
	public void area(){
	System.out.println(r*r*PI);
	}
	public static void main(String[] args) {
	Circle c=new Circle(2.5);
	c.area();
	}
	} 
