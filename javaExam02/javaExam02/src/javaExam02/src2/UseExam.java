package javaExam02.src2;

public class UseExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exsuper obj = new Exsub(); //조상타입으로 쓰는게 좋다
		//ExSub obj2 = new Exsub(); // 안좋은 방법
		printInfo(new Exsub());
		printInfo(new Exsuper());
	
		loopPrint(150, 301, 2);
	}
	public static void printInfo(Exsuper obj) { //매개변수도 상위타입을 적어줄것
		obj.prn();
	}
	
	public static void loopPrint(int i, int e, int a) {
		int result =0;
		for(int j=i; j<e; j=j+a) {
			result = result +j;
		}
		System.out.println("합 => "+result);
	}
}
