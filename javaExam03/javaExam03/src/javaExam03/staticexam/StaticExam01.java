package javaExam03.staticexam;

public class StaticExam01 {
	//필드는 메모리에 생성되는 순간 초기값을 갖는다.
	public static int var1; //정적필드, heap영역이 아니라 static영역(?)에 생성됨 (엄밀하게는 static영역은 없음)
	//static : 응용프로그램이 실행되기 이전에 먼저 메모리에 생성이 된다.
	public int var2;
	public static int method1() { //정적 메서드
		int rtnValue = 0;
		System.out.println("영구 없다.....");
		return rtnValue;
	}
	public int insMethod01() { //인스턴스 메서드 => 객체가 생성이 되어야만이 사용할 수 있는 메서드
		return 100;
	}
	public static class InnerC { //중첩(내부)클래스 static 사용가능
		public static String irum="이영구";
	}
}
