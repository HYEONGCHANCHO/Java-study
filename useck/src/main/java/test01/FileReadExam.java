package test01;

public class FileReadExam {
	public static void main(String[] args) {
		FileReadInter fileread = new FileScanRead();
		System.out.println("Q1. Scanner를 사용");
		String readText = fileread.readfile("testExam.txt");
		System.out.println(readText);
		
		FileReadInter fileread2 = new FileInputStreamRead();
		System.out.println("Q2. FileReader를 사용");
		String readText2 = fileread.readfile("testExam.txt");
		System.out.println(readText2);
	}
}
