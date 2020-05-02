package zy4;

public class Student {
	String name;
	String age;
	public void show(){
		System.out.println("名字："+name+"   年龄："+age);
	}
}
class Undergraduate extends Student{
	String degree;
	public Undergraduate(String name,String age,String degree){
		 super.name=name;
		 super.age=age;
		 this.degree=degree;
	}
	public void show(){
		 super.show();
		 System.out.println("学位："+degree);
		 Undergraduate und=new Undergraduate("张三","20","博士");
		 und.show();
	}
}

