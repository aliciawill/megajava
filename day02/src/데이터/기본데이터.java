package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		int x = 300; //-21억 ~ 21억
		int y = 600;
		
		double move = 22.5;
		//한글자 이상은 기본데이터가 아닙니다.!
		//기본 데이터가 아닌 것은 다 부품을 사용.
		
		//+ :결합연산자(기호)
		System.out.println("우주선의 x축 값은 " + x);
		System.out.println("우주선의 y축 값은 " + y);
		
		x = 250;
		
		int z; //선언!
		int x2, y2, z2; //쓰레기값.
		//System.out.println(x2); 
		//쓰레기값은 연산도 안되고, 처리대상이 아니다.
	}
}
