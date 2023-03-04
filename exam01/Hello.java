package com.hyeongchan.exam01;

public class Hello {
	public static void main(String[] args) { //특수한 목적의 메서드, 운영체제가 호출하는 유일한 메서드이다.
		int k='A';
		String aaa="나"; // String aaa= new String("나"); 이게 원래형이긴 하지만 String과 배열은 직접 값을 줄 수 있음 
		int[] kk= {10,20,30}; // int[] kk =new int[]{10,20,30}; 이것도 원래형은 이렇다.
 		System.out.println((char)k);
		System.out.println(kk[0]); //kk에는 6000이 들어있다고 가정(주소값)
	}
}
