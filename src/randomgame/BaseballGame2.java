package randomgame;

import java.util.Scanner;

public class BaseballGame2 {

	 public static void main(String[] args) {
	      // while문에서 선언하면 지역변수가 되어버리기 때문에 전역변수로 선언해줌
	      int com1 = 0, com2=0, com3=0;
	      while(true) {
	         // -0~9미만의 double 형태의 난수를 반환 (*9로 인해)
	         // -(int) 형번환으로 인해 소수점 이하를 버리고 정수만 취하는데
	         // 8까지 취하므로 +1하여 9까지 취할 수 있음 
	         // 랜덤한 값을 3개 받음
	         com1 = (int)(Math.random()*9)+1;
	         com2 = (int)(Math.random()*9)+1;
	         com3 = (int)(Math.random()*9)+1;
	         //같은 수가 나올수 없도록 해줌
	         // 전체가 같지 않을떄 break문을 통해 나오게됨 빠져나오게 됨
	         if(!(com1==com2 || com1==com3 || com2==com3)) break;
	      }
	      
	      //입력받을 수 있도록 해줌
	      Scanner scanner =new Scanner(System.in);
	      int count = 0;
	      
	      
	   
	      while(true) {
	         count++;
	         int strike = 0, ball = 0, out = 0;
	         System.out.println("중복 없이 입력하세요 ! !\n공백과 같이 3자리 입력 ex: 1 2 3>");
	         // 입력받아줄 수 있게 해줌
	         // nextInt : 공백이나 엔터 기준으로 넣어줌
	         int user1 = scanner.nextInt();
	         int user2 = scanner.nextInt();
	         int user3 = scanner.nextInt();
	         
	         if(user1 == com1) strike++;
	         else if(user1 == com2) ball++;
	         else if(user1 == com3) ball++;
	         
	         if(user2 == com1) ball++;
	         else if (user2 == com2) strike++;
	         else if (user2 == com3) ball++;
	         
	         if(user3 == com1) ball++;
	         else if(user3 == com2) ball++;
	         else if(user3 == com3) strike++;

	         
	         out = 3 - (strike + ball);
	         
	         
	         System.out.printf("당신의 입력값 : %s, %s, %s\n",user1,user2,user3);
	         // 확인용으로 부분임
//	         System.out.printf("컴퓨터의 입력값 : %s, %s, %s\n",com1, com2, com3);
	         System.out.printf("결과 : S:%s, B:%s, O:%s\n",strike, ball, out);
	         System.out.println("==============================");
	         if(strike == 3) {
	            System.out.printf("strike다 !!! 맞았다!!! 도전횟수는 : %s 회야!! \n", count);
	            break;
	         }
	      }
	      
	   }


}
