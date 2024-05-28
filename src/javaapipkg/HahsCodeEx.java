package javaapipkg;

public class HahsCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str1 = new String( "abc");
	        String str2 = new String( "abc");
	        System.out.println("str1.hashCode():"+str1.hashCode()) ;
	        System.out.println("str2.hashCode():"+str2.hashCode()) ;
	        System.out.println("System.identityHashCode(str1):"+
	                            System.identityHashCode(str1)) ;
	        System.out.println("System.identityHashCode(str2):"+
	                            System.identityHashCode(str2)) ;

	}

}
