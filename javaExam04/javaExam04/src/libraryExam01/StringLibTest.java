package libraryExam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLibTest {

	public static void main(String[] args) {
		String StrData = "Hyeong Chan";
		String strWords[] = StrData.split(" ");
		System.out.println(Arrays.deepToString(strWords));
		//문자열 자료중에서 시작하는(또는 끝나는) 문자열에 해당하는지 그 결과를 얻을 수 있다.
		
		String[] rtnFileList = DirFileList.dirFileRead();
//		System.out.println(Arrays.deepToString(rtnString));
		
		List<String> fileFilterList =new ArrayList<String>(); //.png로 끝나는 파일 목록을 저장할 가변 배열
		int fileCount = rtnFileList.length;
		for(int i=0; i<fileCount; i=i+1) {
			if(rtnFileList[i].endsWith(".png")) {
				fileFilterList.add(rtnFileList[i]);
			}
	}
		
		System.out.println("===결과 출력 ===");
		int filterCnt = fileFilterList.size();
		for(int i=0; i<filterCnt; i=i+1) {
		System.out.println(fileFilterList.get(i));
	}}
}
