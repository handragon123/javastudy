package javaapipkg;

public class Fruit {
	String name;
	String color;
// 기본생성자	
//	public Fruit() {
//		
//	}
	// 오버라이딩
	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// 부모 string 오버라이드
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}
}
