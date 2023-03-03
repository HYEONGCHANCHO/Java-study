package javaExam03.abstractexam;

public class UseabstractExam {

	public static void main(String[] args) {
		calResultPrn(new RecCalcu());
		calResultPrn(new TriCalcu());
	}
	
	public static void calResultPrn(AbstractExam01 obj) {
		System.out.println(obj.calcu(50, 20));
	}
}
