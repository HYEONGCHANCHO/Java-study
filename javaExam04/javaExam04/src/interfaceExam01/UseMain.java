package interfaceExam01;

public class UseMain {

	public static void main(String[] args) {
		//InterExam01 obj = new SubInterExam03Impl();
		//obj.calcu();
		//위는 good 방법 아래는 Best방법
//		InterExam01 bestObj = ObjectCreateFactory.createObjText();
//		bestObj.calcu();
		InterStdExam exam = ObjectCreateFactory.createStd();
		int result = exam.test(30, 20);
		System.out.println("연산 결과 :" + result);
		
	}

}
