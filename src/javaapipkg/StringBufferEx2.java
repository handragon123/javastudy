package javaapipkg;

public class StringBufferEx2 {

	public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcd";
        // 문자열이있으면 생성하지 않고 사용
        System.out.println("str1 = "+System.identityHashCode(str1));
        System.out.println("str2 = "+System.identityHashCode(str2));
        // 더하면 새로운 주소값이 나옴
        str1 = str1 + "efg";
        System.out.println("str1 = " + str1);
        System.out.println("str1 = "+System.identityHashCode(str1));
        
        //새로 만들어서 주소 다름
//      String str3 = new String( "abcd");
//      String str4 = new String ("abcd");
//      System.out.println("str3 = "+System.identityHashCode(str3));
//      System.out.println("str4 = "+System.identityHashCode(str4));
        
//        StringBuffer 클래스는 위치는 변하지않고 append로 메서드만 추가해줌
        StringBuffer sb1 = new StringBuffer("abcd"); // 생성자값
        System.out.println("문자열 연결전 sb1 = "+System.identityHashCode(sb1));
        
        sb1.append("efgh");
        System.out.println("문자열 연결후 sb1 = "+System.identityHashCode(sb1));
	}

}
