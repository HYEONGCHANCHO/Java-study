package libraryExam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileReadWrite01_2 {

	public static void main(String[] args) {
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr= new FileInputStream(args[0]);
			fw= new FileOutputStream(args[1]); 
			int readData=0;
			while((readData=fr.read())!= -1) {
				fw.write((readData-1)); // readData+1로 보내면 암호화되어 가고, 다시 복원할 때 readData-1로 해주면 다시 보이게 된다.
			}
			fw.close(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

