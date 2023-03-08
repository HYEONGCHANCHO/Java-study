package libraryExam06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr= new FileReader(args[0]);
			fw= new FileWriter(args[1]); // true => 기존거 다음에 추가로적겠다. 아무것도 없으면 기존거 다 지우고 새로 적겠다는 뜻.
			int readLen=0;
			char[] readData = new char[20];
			while((readLen=	fr.read(readData))!= -1) {
				fw.write(readData,0,readLen);
			}
			fw.close(); fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
