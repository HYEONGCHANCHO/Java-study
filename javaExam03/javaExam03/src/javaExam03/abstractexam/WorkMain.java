package javaExam03.abstractexam;

public class WorkMain {
	public static void main(String[] args) {
		//Calcu 상속을 받아서
		//홍길동에게 삼각형의 면적을 구하는 프로그램을 작성 지시
		//홍길동2에게 사각형의 면적을 구하는 프로그램을 작성 지시
		//홍길동3에게 원형의 면적을 구하는 프로그램을 작성 지시
		Calcu obj = new TriCalcu();
		System.out.println("삼각형의 면적" + obj.area(30,15.8));
		Calcu obj = new RecCalcu();
		System.out.println("사각형의 면적" + obj.area(76,628));
		Calcu obj = new CirCalcu();
		System.out.println("원형의 면적" + obj.area(70,70));
	}
}
