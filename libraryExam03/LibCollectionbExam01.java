package libraryExam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import libraryExam02.DataObj;

public class LibCollectionbExam01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //키 값은 숫자로 고정, 데이터만 문자열 
		list.add("data1");
		list.add("data2");
		System.out.println(list.get(0)+ "리스트 자료의 개수 :"+list.size() );
		String[] listArr= {"data1","data2"};
		//String[] listArr = new String[2]; listArr[0]="data1";;istArr[2] = "data3";
		Map<Integer, String> map =new HashMap<>();
		map.put(0, "data1"); map.put(1, "data2"); 
		System.out.println(map.get(0) + "map 자료의 개수" + map.size());
		map.put(2, "data1");
		System.out.println(map.get(0) + "map 자료의 개수" + map.size());

		Map<String, String> phoneInfo = new HashMap<>();
		phoneInfo.put("찬", "010-2222-2233");
		phoneInfo.put("찬찬", "010-2332-4433");
		System.out.println(phoneInfo.get("찬"));
		//Map의 형태로 구성된 자료의 활용 => key도 광범위하게 자료로 활용할 수 있다.
		System.out.println(phoneInfo.get("찬"+"찬"));
	
		Map<String, Integer> dataObj = new HashMap<>();
		dataObj.put("aaa",123);
		dataObj.put("bbb",1200);
		dataObj.put("ccc",300);
		System.out.println(dataObj.get("aaa"));
		
		DataObj dataObj2 = new DataObj();
		dataObj2.aaa = 1233;
		System.out.println(dataObj2.aaa);
		
		Map<String,Object> dataObjTwoMap = new HashMap<>();
		dataObjTwoMap.put("intData", 12000);
		dataObjTwoMap.put("dbData", 3.14);
		dataObjTwoMap.put("strData", "hyeongchan");
		
		System.out.println(dataObjTwoMap.get("intData"));
		System.out.println(dataObjTwoMap.get("dbData"));
		System.out.println(dataObjTwoMap.get("strData")+ ",부분문자 =>" +((String)dataObjTwoMap.get("strData")).substring(6));
		
		
		
		
		
		
		
		
		
	}		
}
