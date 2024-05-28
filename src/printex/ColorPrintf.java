package printex;

public class ColorPrintf {

	public static void main(String[] args) {
		
		char a = 'a';
		char z = 'z';
		// char은 정수로 형변환이 가능하다
		
		int ia = (int)a; //97
		int iz = z; //122
		
		char ii = 92;
		char ci = (char)ia;
		
		System.out.printf("%s %s %s %s %s %s %n", a, z,ia ,iz,ci,ii);
		// a,z s 문자열로 찍어서 a,z로나오고 ia,iz는 정수형 변환하여 97,122가나옴
		System.out.printf("%c %c %c %c %c %c", a, z,(char)ia ,iz,ci,ii);
		// char 문자로 받았기 때문에 문자그대로의 a,z,a,z가 나옴
	}

}
