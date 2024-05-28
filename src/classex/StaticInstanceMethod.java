package classex;

public class StaticInstanceMethod {
	
	static int sVar;
	int iVar;
	 public static void staticCall() {

	        System.out.println("staticCall()");
	        System.out.println("sVar="+ sVar);
	        //instannceCall(); // error : new 해서만 부를 수 있음
	        //System.out.println("iVar="+ iVar);// error : new 해서만 사용가능
	    }
	 // new 생성 후 호출 가능
	 public void instanceCall() {
	        System.out.println("instantCall()");
	        System.out.println("iVar=" + iVar);
	    }

	public static void main(String[] args) {
		 // static
        staticCall();
        System.out.println("main() - staticVar="+StaticInstanceMethod.sVar);
        System.out.println("main() - staticVar="+sVar); // 같은 클래스 : 클래스명 생략 가능

        // new
        StaticInstanceMethod sm = new StaticInstanceMethod();
        sm.instanceCall();
        System.out.println("main() - var=" +  sm.iVar);
	}

}
