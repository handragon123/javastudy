package exception;

public class ExceptionEx06 {
//	던질 메소드 = exception
	  public void exceptionMethod() throws Exception{
	        throw  new Exception(); // 예외 객체를 임의로 발생시켜 주는 예약어
	    }
	    /**
	     * throws 테스트
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        ExceptionEx06 et6 = new ExceptionEx06();
	        try{
	            et6.exceptionMethod();
	        }
	        catch(Exception e){ // 메서드 호출
	            System.out.println("호출한 메소드에서 예외 처리함");
	        }
	    }
}
