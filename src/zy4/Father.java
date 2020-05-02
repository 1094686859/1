package zy4;
public	class Father{
	    private String name = "zhangjun";
	    public class Child{
	        public void introFather(){
	            System.out.println(Father.this.name);
	        }
	    }
	 }
class Test {

	    public static void main(String[] args) {
	        Father.Child child= new Father().new Child();
	        child.introFather();
	    }

	}
