package javaExam03.staticexam;

import javaExam03.staticexam.StaticExam01.InnerC;

public class UseExam {

	public static void main(String[] args) {
		System.out.println(StaticExam01.var1);
		System.out.println(StaticExam01.method1());
//		StaticExam01.insMethod01();
		StaticExam01 obj = new StaticExam01();
		System.out.println(obj.var2);
		obj.insMethod01();
		System.out.println(InnerC.irum); 
	}

}
