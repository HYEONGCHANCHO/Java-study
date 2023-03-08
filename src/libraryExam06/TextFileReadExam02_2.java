package libraryExam06;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TextFileReadExam02_2 {

	public static void main(String[] args) {

			FileReader fr = null;
			try {
				fr = new FileReader("test.txt");

				int readCheck = -255;
				char[] readData = new char[1024];
				while((readCheck=fr.read(readData))!=-1) {
					for (int i=0; i<readCheck; i=i+1) {
						System.out.print(readData[i]);
					}
				}
				fr.close();
			
			} catch (IOException e) { //exception이 여러개인데 상속관계에 있을 때 상위클래스 하나로 몰아서 한다.
				e.printStackTrace();
			}
		}

	}

