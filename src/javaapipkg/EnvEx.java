package javaapipkg;

public class EnvEx {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version")); // 자바버전
		System.out.println(System.getProperty("java.home")); // 위치
		System.out.println(System.getProperty("os.name")); // OS
		System.out.println(System.getProperty("file.separator")); // \
		System.out.println(System.getProperty("user.name")); //  유저명
		System.out.println(System.getProperty("user.home")); //  유저홈위치
		System.out.println(System.getProperty("user.dir")); // 디렉토리위치
	}

}
