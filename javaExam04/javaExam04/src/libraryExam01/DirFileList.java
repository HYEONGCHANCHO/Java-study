package libraryExam01;

import java.io.File;

public class DirFileList {
	public static String[] dirFileRead(){
		File file = new File("./imgfilelist");
		//문자열 배열로 반환해준다.
		return file.list();
	}
}
