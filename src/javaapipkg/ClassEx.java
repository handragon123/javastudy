package javaapipkg;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnvEx env = new EnvEx(); // 참조변수생성
		
		Class c1 = env.getClass(); // 참조변수 env를 통해 get해옴
		System.out.println(c1.getName());
		// forName 안에 오타나면 오류발생하므로 try,catch 문사용
		try {
			Class c2 = Class.forName("javaapipkg.PropertyEx");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
