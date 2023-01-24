package ex03for문;

public class Ex00프린트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이나연
		//이름, 나이, 연락처
		
		String name = "구소현";
		int age = 24;
		String tel = "010-1234-5678";
		
		// 이름 : 소현 / 나이: (세) /전화번호 : ~
		
//		System.out.print("이름 : "+ name);
//		System.out.print("/ 나이 : "+ age + "(세)");
//		System.out.print("/ 전화번호 : "+ tel);
		
		System.out.printf(" 이름 : %s / 나이: %d(세) /전화번호 : %s", name, age, tel);
	
		//%s -> String이란 뜻 , %d : decimal 정수라는 말, 
		// %f : float 실수라는 말 , %n : new 엔터를 친다
		
		
		
		
	}

}
