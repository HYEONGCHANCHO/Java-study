package javaExam02.src;

public class UseExam {

	public static void main(String[] args) {
		Big obj = new Big();
		printInfo(obj);
		obj = new Middle();
		obj.setMoney(3000);
		printInfo(obj);
		obj = new Small();
		obj.setMoney(12000);
		printInfo(obj);
		
	}

	
	public static void printInfo(Big obj) {
		System.out.println(obj.money);
	}
}
