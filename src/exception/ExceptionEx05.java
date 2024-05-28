package exception;

public class ExceptionEx05 {
	public static void main(String[] args) {
		 System.out.println(1);
		 System.out.println(2);
		 try {
			 System.out.println(3);
			 System.out.println(0/0); //예외발생으로
			 System.out.println(4); // 실행되지않음
		 } catch (Exception e) { // exception 
			 e.printStackTrace();
		 } finally  { // 오류가나든말든무조건 실행
			System.out.println("final");
		}
		 System.out.println("end");
	}

}
