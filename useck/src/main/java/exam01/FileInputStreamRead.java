package exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamRead implements FileReadInter {

	@Override
	public String readText(String fileName) {
		StringBuffer sb = new StringBuffer();
		try {
			FileReader fr = new FileReader(fileName);
			int readCount=0;
			char[] readData = new char[5];
			while((readCount=fr.read(readData))!=-1) {
					sb.append(readData,0,readCount);
			}
				
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
