package randomgame;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		int com1 = (int)(Math.random() * 9 + 1);
		int com2 = (int)(Math.random() * 9 + 1);
		int com3 = (int)(Math.random() * 9 + 1);
		Scanner sc1 = new Scanner(System.in);
		
			
		while(true) {
			System.out.println("3개의 숫자를 입력하시오");
//			System.out.println(com1);
//			System.out.println(com2);
			int num1 = sc1.nextInt();
			int num2 = sc1.nextInt();
			int num3 = sc1.nextInt();
			// 스트라이크
			boolean s1 = (com1==num1); 
			boolean s2 = (com2==num2); 
			boolean s3 = (com3==num3); 
			// 볼
			boolean b1_1 = (com1==num2); // 2
			boolean b2_1 = (com1==num3); //3
			boolean b3_2 = (com2==num1);//1
			boolean b4_2 = (com2==num3); //3
			boolean b5_3 = (com3==num1); //1
			boolean b6_3 = (com3==num2); //2
			// 아웃
			boolean o1 = (com1!=num1);
			boolean o2 = (com2!=num2);
			boolean o3 = (com3!=num3);

			boolean st3 = (s1 && s2 && s3); // 3스트라이크
			boolean st2_1 = (o1 && s2 && s3); // 2스트라이크
			boolean st2_2 = (s1 && o2 && s3); // 2스트라이크
			boolean st2_3 = (s1 && s2 && o3); // 2스트라이크
			
			boolean st1_1 = (s1 && o2 && o3); // 1스트라이크
			boolean st1_2 = (o1 && s2 && o3); // 1스트라이크
			boolean st1_3 = (o1 && o2 && s3); // 1스트라이크
			
			boolean ball_1 = (b1_1&& o2 &&o3); //1볼
			boolean ball_2 = (b2_1&& o2 &&o3); //1볼
			boolean ball_3 = (o1&& b3_2 &&o3); //1볼
			boolean ball_4 = (o1&& b4_2 &&o3); //1볼
			boolean ball_5 = (o1&& o2 &&b5_3); //1볼
			boolean ball_6 = (o1&& o2 &&b6_3); //1볼
			
			boolean s1b1_1 = (s1 && b3_2 && o3); //1스트라크 1볼
			boolean s1b1_2 = (s1 && b4_2 &&o3); //1스트라크 1볼
			boolean s1b1_3 = (s1 && o2 && b5_3); //1스트라크 1볼
			boolean s1b1_4 = (s1 && o2 && b6_3); //1스트라크 1볼
			
			boolean s1b2_1 = (s1 && b3_2 && b6_3); //1스트라크 2볼
			boolean s1b2_2 = (s1 && b4_2 && b6_3); //1스트라크 2볼
			boolean s1b2_3 = (s1 && b4_2 && b5_3); //1스트라크 2볼
			
			boolean s1b1_5 = (b1_1&& s2 &&o3); //1스트라크 1볼
			boolean s1b1_6 = (b2_1&& s2 &&o3); //1스트라크 1볼
			boolean s1b1_7 = (o1&& s2 &&b5_3); //1스트라크 1볼
			boolean s1b1_8 = (o1&& s2 &&b6_3); //1스트라크 1볼
			
			boolean s1b2_4 = (b2_1&& s2 &&b6_3); //1스트라크 2볼
			boolean s1b2_5 = (b2_1&& s2 &&b5_3); //1스트라크 2볼
			boolean s1b2_6 = (b1_1&& s2 &&b5_3); //1스트라크 2볼
			
			
			boolean s1b1_9 = (b1_1&& o2 &&s3); //1스트라크 1볼
			boolean s1b1_10= (b2_1&& o2 &&s3); //1스트라크 1볼
			boolean s1b1_11= (o1&& b3_2 &&s3); //1스트라크 1볼
			boolean s1b1_12= (o1&& b4_2 &&s3); //1스트라크 1볼

			boolean s1b2_7 = (b1_1&& b4_2 &&s3); //1스트라크 2볼
			boolean s1b2_8 = (b1_1&& b3_2 &&s3); //1스트라크 2볼
			boolean s1b2_9 = (b2_1&& b3_2 &&s3); //1스트라크 2볼
			
			boolean out = (o1&& o2 && o3); // 아웃
			
			
			
			if (st3) {
				System.out.println("3Strick 모두맞음");
				break;
			}
			else if (st2_1 || st2_2 || st2_3 ) {
				System.out.println("2스트라이크");		
			}
			else if (st1_1|| st1_2 || st1_3) {
				System.out.println("1스트라이크");		
			} 
			else if (ball_1 || ball_2 ||ball_3 ||ball_4 ||ball_5 ||ball_6) {
				System.out.println("1볼");
			}
			else if (s1b1_1 || s1b1_2 || s1b1_3 || s1b1_4 || s1b1_5 || s1b1_6 ||s1b1_7 ||s1b1_8 ||s1b1_9 ||s1b1_10 ||s1b1_11 ||s1b1_12 ) {
				System.out.println("1볼1스트라이크");
			}
			else if (s1b2_1||s1b2_2||s1b2_3||s1b2_4||s1b2_5||s1b2_6||s1b2_7||s1b2_8||s1b2_9) {
				System.out.println("2볼1스트라이크");
			}
			else if (out); {
				System.out.println("다시 입력하시오");
			}
		}
		

	}

}
