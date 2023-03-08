package libraryExam06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadExam02 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
//			int readChar = fr.read(); //더이상 읽을 자리가 없을 때 음수를 반환하기 때문에 타입이 int타입이다.
			
			int readChar = 0;
			while((readChar=fr.read()) !=-1) { //이건 속도가 느림
				System.out.print((char)readChar);
			}
			fr.close();
		} catch (IOException e) { //exception이 여러개인데 상속관계에 있을 때 상위클래스 하나로 몰아서 한다.
			e.printStackTrace();
		}
	}

}
