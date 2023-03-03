package javaExam03.finalexam;

public class UseFinalTest {

	public static void main(String[] args) {
		FinalExam02 obj1=new FinalExam02();
		System.out.println(obj1.k);
		FinalExam02 obj2=new FinalExam02(5000);
		System.out.println(obj2.k);
		System.out.println(ConstDefine.PI);
		System.out.println("=======================");
		UseSampleData data = new UseSampleData();
		System.out.println(data.obj.fd1);
		data.obj.fd1=3;
		System.out.println(data.obj.fd1);
		
		
	}

}
