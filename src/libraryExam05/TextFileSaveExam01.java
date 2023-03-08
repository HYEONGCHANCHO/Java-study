package libraryExam05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileSaveExam01 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test.txt"); // 이 파일이 없다면 만들고 있다면 있는 파일을 가져옴
//			fw.write("나의 살던 고향은 꽃 피는 산골\n"); /* \n은 줄을 바로 아래로 이동하는 기능만 있다. 맨앞으로 가는기능이 있지 않다. 맨 앞으로 간 이유는 텍스트 파일에 있는 설정이 맨 앞으로 보내기 때문이다. */
//			fw.write("내가 살아가는 동안에 할일이 또 하나 있지\n",1,3); //인덱스 몇번 부터, 몇글자를 적을것인지 정해준다. 예) 가 살
			Scanner scanner = new Scanner(System.in);
//			for(int i = 0; i<5; i=i+1) {
//				System.out.println("입력하세요");
//				String inputString = scanner.next(); //텝키, 공백, 엔터키를 누르기 이전까지 입력받음 띄어쓰기를 하면서 쓰면 5번 띄어쓰기한거까지만 들어감
//				String inputString = scanner.nextLine(); //엔터키 치기 전까지 입력을 받음
//				fw.write(inputString+"\n");
				fw.write("======문자열 배열 저장=======");
				char[] charArrData = "Chan 형찬 조형찬 찬찬".toCharArray();
				fw.write(charArrData);
//			}
			fw.close(); //외부자원을 사용했으면 반드시 닫아줘야 함.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
