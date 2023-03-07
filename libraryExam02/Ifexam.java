package libraryExam02;

public class Ifexam {
	public static void main(String[] args) {
		//점수를 입력받아서 60점 이상이면 pass, 60점 미만이면 fail을 출력하는 프로그램을 작성하시오 
		int jumsu = 84;
		if(jumsu>=60) System.out.println("pass");
		if(jumsu<60) System.out.println("fail");
		//점수를 입력받아서 수,우,미,양,가를 출력하는 프로그램을 작성하시오.
		//점수를 입력받아서 A+ A0 B+ B0 ... F학점으로 출력하는 프로그램을 작성하시오
		if(jumsu>=90 && jumsu<=100) System.out.println("수");
		if(jumsu>=80 && jumsu<90) System.out.println("우");
		if(jumsu>=70 && jumsu<80) System.out.println("미");
		if(jumsu>=60 && jumsu<70) System.out.println("양");
		if(jumsu<60) System.out.println("가");
		
		String pg = "가 가 가 가 가 가 양 미 우 수";
		System.out.println(pg.split("\\s+")[jumsu/10]);

		String pge = "F F F F F F F F F F F F D0 D+ C0 C+ B0 B+ A0 A+";
		System.out.println(pge.split("\\s+")[jumsu/5]);
		
		
		
		
		
		
	}
}
