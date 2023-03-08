package libraryExam04;

public class WrapperExam01 {

	public static void main(String[] args) {
		System.out.println("정수형 타입의 최대값 :"+ Integer.MAX_VALUE);
		System.out.println("정수형 타입의 최대값 :"+ ~(Integer.MIN_VALUE)); //비트연산자~ 는 not을 의미한다.
		System.out.println("정수형 타입의 최소값 = (최대값 + 1) :"+ (Integer.MAX_VALUE+1));
		System.out.println("정수형 타입의 최소값 :"+ Integer.MIN_VALUE);
		System.out.println(~(-25)+1);
		System.out.println(~(25)+1);
		
		System.out.println(Integer.parseInt("123")+45);
	}

}
