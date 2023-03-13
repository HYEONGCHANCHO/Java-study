package test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanRead implements FileReadInter {

	@Override
	public String readfile(String fileName) {
		StringBuffer sb = new StringBuffer();
		try {
			Scanner scan =new Scanner(new File(fileName));
			while(scan.hasNext()) {
				sb.append(scan.nextLine()+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
