package datastructureex;

public class MainArgsEx {

	public static void main(String[] args) {
		String s = "100 200 300";
		String[] sArr = s.split(" "); //s문자열에 split ""(공백)기준으로
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		for(String i :sArr) {
			System.out.println(i);
		}
	}
	

}
