package genericpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlogGeneric {

	public static void main(String[] args) {
		// Blog 객체를 저장할 배열 생성
		Blog[] blogsArray = new Blog[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < blogsArray.length; i++) {
			System.out.println("블로그 정보 입력");
			System.out.print("제목 입력 > ");
			String title = sc.nextLine();
			System.out.print("위치 입력 > ");
			String location = sc.nextLine();
			System.out.print("공감 수 입력 > ");
			int likes = sc.nextInt();
			System.out.print("댓글 수 입력 > ");
			int comments = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

			// 입력 받은 정보로 Blog 객체 생성 후 배열에 저장
			blogsArray[i] = new Blog(title,location,likes,comments);
		}

		// ArrayList에 Blog 객체 저장
		ArrayList<Blog> blogsArrayList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("블로그 정보 입력");
			System.out.print("제목 입력 > ");
			String title = sc.nextLine();
			System.out.print("위치 입력 > ");
			String location = sc.nextLine();
			System.out.print("공감 수 입력 > ");
			int likes = sc.nextInt();
			System.out.print("댓글 수 입력 > ");
			int comments = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

			// 입력 받은 정보로 Blog 객체 생성 후 ArrayList에 추가
			blogsArrayList.add(new Blog(title, location, likes, comments));
		}

		// 배열 출력
		System.out.println("배열 출력:");
		for (Blog blog : blogsArray) {
			System.out.printf("%s,[%s], 공감 %d, 댓글 %d\n", blog.getTitle(), blog.getLocation(), blog.getLikes(), blog.getComments());
		}

		// ArrayList 출력
		System.out.println("\nArrayList 출력:");
		for (Blog blog : blogsArrayList) {
			System.out.printf("%s,[%s], 공감 %d, 댓글 %d\n", blog.getTitle(), blog.getLocation(), blog.getLikes(), blog.getComments());
		}

		// 스캐너 닫기
		sc.close();
	}

}
