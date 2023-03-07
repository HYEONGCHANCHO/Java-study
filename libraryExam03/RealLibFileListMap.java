package libraryExam03;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RealLibFileListMap {
	public void mapFileList(String rootDirName) {
		Map<String, List<String>> mapInfo = new HashMap<>();
		File file = new File(rootDirName);
		File[] subFiles = file.listFiles();
		for(int i=0; i<subFiles.length; i+=1) {
			if (subFiles[i].isDirectory()) {
				//Map에 key값으로 사용될 목록이다. => subFiles[i].toString().substring(2)
//				System.out.println("key값으로 저장될 문자열"+subFiles[i].toString().substring(2));
				File subDir = new File(subFiles[i].toString()); //subFiles[i]는 파일 타입이라 문자열 형태로 바꿔줌
				String[] subDirList = subDir.list();
//				System.out.println(Arrays.toString(subDirList));
				List<String> list = new ArrayList<>();
				for(int j=0; j<subDirList.length; j=j+1) {
					list.add(subDirList[j]);
				}
				mapInfo.put(subFiles[i].toString(), list);
			}
		}
		
		mapInfoPrint(mapInfo);
		//실제로 출력하는 것이 아니라 클라이언트에게 mapInfo를 네트워크로 넘겨준다.(자바스크립트에서 받을 수 있도록), 여기서는 확인차 출력을 해본것일 뿐. 
	}
	private void mapInfoPrint(Map<String, List<String>> mapInfo) {
		Iterator<String> iter =mapInfo.keySet().iterator();
		while(iter.hasNext()) {
			String keyString = iter.next();
			System.out.println(keyString+"에 저장된 파일목록 : ");
			List<String> list = mapInfo.get(keyString);
			for(int i=0; i<list.size(); i=i+1) {
				System.out.println(list.get(i));
			}
			System.out.println("================================");
		}
	}
}
