package javaapipkg;

import java.util.Arrays;

public class StringMetEx {

	
	public static void main(String[] args) {
		String str = "Hello My Name is Hong Gil Dong";
		
		System.out.println(str.charAt(0)); // H
		System.out.println(str.equals("Hello My Name is Hong Gil Dong"));
		System.out.println(str.indexOf("Hong")); //17번시작
		System.out.println(str.indexOf('H')); // 문자열 H 위치
		System.out.println(str.substring(17)); //17번부터 끝까지
		System.out.println(str.substring(6, 13)); // 6부터 13번
		System.out.println(str.toLowerCase()); //소문자
		System.out.println(str.toUpperCase()); //대문자
		System.out.println(str.length()); // 문자열 길이
		System.out.println((str.startsWith("Hello"))); //Hello로 시작하는지
		System.out.println(str.endsWith("Dong")); // Dong로 끝나는지
		System.out.println(str.replace("Hong", "Kim")); // Hong을 kim으로 
		System.out.println(str.replaceAll("N+", "Nickname")); // N으로 시작하는 문자열 변환
		System.out.println(str.toString());
		
		 str = "            안녕하세요,반   갑습니다.        ";
		System.out.println(str.trim()); // 앞뒤 공백 제거
		System.out.println(str.replace(" ","")); // 모든공백 제거
		
		str = String.valueOf(10); // 자료형 int를 문자열로 변환
		str = String.valueOf(10.5); // 자료형 double를 문자열로 변환
		
		str = "홍길동, 이순신, 유관순, 안중근";
		String[] arr = str.split(","); // ,를 구분자로 나눠서 배열로 리턴
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+"번 인덱스값 = "+arr[i]);
		}
	}

}
