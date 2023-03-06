package interfaceExam01;

public class InterStdImpl02 implements InterStdExam{
	@Override
	public int test(int data1, int data2) {
		System.out.println("두 수를 제곱해서 더한 값을 반환==========");
		return (data1*data1)+(data2*data2);
	}
}
