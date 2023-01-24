package ex01while문;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 1;//임의로 지정
		
//		while (num <=5 ) //괄호안은 조건식, 5이하일때만 출력시킬꺼다.
//		{System.out.println("안녕하세요."); //내가 반복시킬 부분을 찾고 후에 거기에 중괄호 먼저 쳐주기
//		num++ ;}	///조건문에다가 num이 1씩 증가된다는 조건을 붙여서 숫자가 증가되어 멈출 수 있도록함	
		
		//주석처리 한번에 하는 단축키 ctrl+/
		
//		while (true){
//			System.out.println("안녕하쇼.");
//			num++; //1인 num이 여기서 +1되어 2인상태로 if로 넘어감
//			if(num==5) { //여기서 5가 아니면 해당이 안되니까 계속 넘어가고 5되었을때 break되는거임
//			break;} 
//		}
		//무한반복문 
		//while문이 무한으로 돌아갈때 멈추는 키워드 : break
		
		while (true){
			System.out.println("안녕하쇼.");
			 //여기서 1인상태로 if내려가기 가능
			if(num==5) { //여기서 5가 아니면 해당이 안되니까 계속 넘어가고 5되었을때 break되는거임
			break;} 
			num++;//이걸 if 뒤로 옮기면 여기서 1이 증가됨
		}
		
		
		
		
		
		
		
		
	}

}
