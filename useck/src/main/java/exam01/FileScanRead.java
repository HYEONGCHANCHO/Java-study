package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanRead implements FileReadInter {

	@Override
	public String readText(String fileName) {
		//String readData = ""; String으로 해주면 return은 readData;만 해줘도 됨 
		StringBuffer sb = new StringBuffer();
		try {
			Scanner scan = new Scanner(new File(fileName));
//			while(true) {
//				if (scan.hasNext() == false) break;
//				sb.append(scan.nextLine());
//			}
			while(scan.hasNext()) {
				sb.append(scan.nextLine()+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
