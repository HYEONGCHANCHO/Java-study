package libraryExam04;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyPermission;

public class SystemExam02 {
	public static void main(String[] args) {
		long startTime =System.nanoTime();
		int sum = 0;
		for(int i=10; i<50; i=i+1) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println(System.nanoTime()-startTime);
		
		System.out.println("========================================");
//		System.exit(0); //문제가 있어서 종료할 때 일반적으로 1적고 문제없이 종료될 떄 0 적음
		Map<String, String> envInfo =System.getenv();
		Iterator<String> iter= envInfo.keySet().iterator();
		while(iter.hasNext()) {
			String envName = iter.next();
			System.out.println(envName+" : "+envInfo.get(envName));
			 
		}
		StringBuffer sb = new StringBuffer("나일등");
		sb.append("맹구");
		
		sb=null; //더이상 쓸일이 없다면 null해주는 것이 관리적 측면에서 더 좋긴하다.
		sb = new StringBuffer("땡칠이"); 
		
		System.out.println("==========시스템에 등록되어 있는 속성 정보 보기==============");
		Properties props = System.getProperties();
		Enumeration<String> proEnums = (Enumeration<String>)props.propertyNames();
		while(proEnums.hasMoreElements()) {
			String proName = proEnums.nextElement();
			System.out.println((proName) + " : "+props.get(proName));
		}
	
	
	}
	
	
}
