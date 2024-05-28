package exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		for(int i=0; i < 10; i++) {
			// 오류 나는 부분 try catch
			try {
//				이곳에서 오류값 발생하기 떄문에 try 문에 넣어줘야함
				result = number / (int)(Math.random() * 10); // 0 ~ 0.9999
				System.out.println(result);
			}
			// catch 콜백함수에서 오류 0 발생시 실행
			catch (ArithmeticException e){
				System.out.println("error");
			}
        }
	}

}
