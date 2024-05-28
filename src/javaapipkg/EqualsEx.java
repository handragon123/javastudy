package javaapipkg;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		// 주소가 달라서 다르다고 나옴.
		// equals는 주소체크이지 값 체크가 아니기 떄문에
		// equals는 부모꺼 오버 라이딩해서 재정의하여서 사용해야함.
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		if(obj1.equals(obj2)) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		// 재정의한 equals
		ObjOverride objo1 = new ObjOverride(100);
		ObjOverride objo2 = new ObjOverride(100);
		if(objo1 == objo2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
//		equals 의 값은 같다고 나옴
		if(objo1.equals(objo2)) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
	}

}
