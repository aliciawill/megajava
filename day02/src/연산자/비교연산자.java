package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		
		//비교 연산자의 결과는 논리형!!!!(boolean, true/false)
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		
		int money = 10000;
		if (money >= 15000) { //true
			System.out.println("감사합니다.");
		} else { //false
			System.out.println("조금만 더 주세요.");
		}
		
		
		
		
		
		
	}

}
