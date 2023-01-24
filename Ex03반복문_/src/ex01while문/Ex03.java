package ex01while문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드로부터 입력 받은 수를 누적하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int A =0;
		
//		while (num != -1) { //num이 -1이 아니라면
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		A = num + A;//누적 식
//		System.out.println("누적결과 : "+ A);
//		
//		}
		
		//내가 입력한 숫자들의 합(누적)
		//sum = sum + num ;
		//sum + = num l; <-- 위와 같은데 간단하게 
		
//		System.out.println("종료되었습니다.");
		
		//조건식 : true ---> 무한 반복문
		
		while(true)
		{System.out.println("정수입력 : ");
		num = sc. nextInt();
		
		A = num + A;
		System.out.println("누적결과 : "+A );
		
		if(num == -1) {
			break;
		}
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
