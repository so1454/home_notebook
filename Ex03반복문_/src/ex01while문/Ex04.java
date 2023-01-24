package ex01while문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int a = 0;
		int b = 0;
		int A = 0;
		int B = 0;
		
		while(num> -1)
		{System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		if (num%2 == 0) {
			a = 1;
			A = A + a ;
			System.out.println("짝수개수 : " + A );
			System.out.println("홀수개수 : "+B);
		}else {
			//홀수개수..
			b = 1 ;
			B= B+b;
			System.out.println("짝수개수 : " + A );
			System.out.println("홀수개수 : "+ B);
		}
		
	
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
