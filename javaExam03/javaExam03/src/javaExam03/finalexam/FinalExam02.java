package javaExam03.finalexam;

public class FinalExam02 {
	//final이 붙어있는 변수 (필드, 지역변수) : 메모리에 만들어지는 시점에서 반드시 초기 값을 가져야 한다. =>변경이 불가능하다.
	final int k; //값이 객체를 생성하는 시점에서 만들어지는 필드 변수다, <=생성되는 시점에서 초기화 되어야 한다.
	final static double pi=3.1492; //로드되는 시점에서 만들어지는 필드 변수(static영역에) 생성되기도전에 만들어지니까 <= 무조건 초기화를 해야 한다. 
	
	FinalExam02(){
		k=300;
	}
	FinalExam02(int data){
		k=data;
	}
	
	
	public final int rtnValue() { //상속하는 클래스에서 이 메서드를 오버라이딩할 수 없다.
		return k*30;
	}
	
//	public void testMe(final int kkk) {
//		int jjj;
//	}
}
