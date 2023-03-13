package test01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamRead implements FileReadInter {
	@Override
	public String readfile(String fileName) {
		StringBuffer sb =new StringBuffer();
		try {
			FileReader fr = new FileReader(fileName);
			int readCt=0;
			char[] readDt=new char[10];
			while((readCt=fr.read(readDt))!=-1){
				sb.append(readDt,0,readCt);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
