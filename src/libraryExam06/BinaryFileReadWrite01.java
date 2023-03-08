package libraryExam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileReadWrite01 {

	public static void main(String[] args) {
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr= new FileInputStream(args[0]);
			fw= new FileOutputStream(args[1]); // true => 기존거 다음에 추가로적겠다. 아무것도 없으면 기존거 다 지우고 새로 적겠다는 뜻.
			int readLen=0;
			byte[] readData = new byte[20];
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
