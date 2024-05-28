package praparpkg;

public class Animal {

	 private String name;
	    private int age;    

	    // Overloading 생성자
	    public Animal(String name, int age) {
	    	super();
	    	this.name = name;
	    	this.age = age;
	    }
	    


	    public String getName() {
	        return name;
	    }




		public void setName(String name) {
	        this.name = name;
	    }



	    public int getAge() {
	        return age;
	    }



	    public void setAge(int age) {
	        this.age = age;
	    }



	    // 메서드
	    public void eat() {
	        System.out.println("Eat!!");
	    }
	    public void move() {
	        System.out.println("Move!!");
	    }
	    public void sleep() {
	        System.out.println("Sleep!!");
	    }
}
