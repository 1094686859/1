package zy4;

public class Student {
	String name;
	String age;
	public void show(){
		System.out.println("���֣�"+name+"   ���䣺"+age);
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
		 System.out.println("ѧλ��"+degree);
		 Undergraduate und=new Undergraduate("����","20","��ʿ");
		 und.show();
	}
}

