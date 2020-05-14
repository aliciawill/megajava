package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리적인 판단을 하려고 할 때
		// 조건이 2개이상인 경우.
		// 조건이 2개 다 만족해야하는지: and조건 (&&)
		// 로그인 처리
		// 조건이 2개 중 하나만 만족해도: or조건(||)
		int id = 1111; //가입시 id
		int pw = 2222;
		
		int id2 = 1000;//입력한 id
		int pw2 = 2222;
		//비교연산자는 기본데이터만 비교가능!
		//부품(class)는 비교연산자 사용 불가!
		if ( id == id2 && pw == pw2) {
			System.out.println("로그인 성공.!!!");
		} else {
			System.out.println("로그인 실패.!!!");
		}
		
		
		
		
		
		
	}
}
