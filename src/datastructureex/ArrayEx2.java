package datastructureex;

import java.util.Arrays;

public class ArrayEx2 {
	  public static void main(String[] args) {
	       int len = 100;
	       int [] nArr = new int [len];
	       
	       // 값을 입력한 부분
	       for(int i=0; i<len; i++) {
	    	   nArr[i] =  i+1;
	       }
	       // 값 출력 #1
	       for (int i=0;i<len;i++) {
	    	   int n = nArr[i];
	    	   System.out.print(n + " ");
//	    	   System.out.print(nArr[i]);
	    	   if(n % 10 == 0) System.out.println();
	       }
	       // 갑 출력 #2
	       for (int n : nArr) {
	    	   System.out.print(n + " ");
	    	   if(n % 10 == 0) System.out.println();
	       }
	    }
}
