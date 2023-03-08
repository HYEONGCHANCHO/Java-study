package libraryExam04;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class DateExam02 {

	public static void main(String[] args) {
		Date now =new Date();
		System.out.println("현재 시스템에 설정된 날짜와 시간" + now);
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth()+1+"월");
		System.out.println(now.getDate()+"일");
		System.out.println(now.getDay()+"일");
		System.out.println(now.getTime()/86400000);
		
//		Date dateUser = new Date(20,10,30);
//		System.out.println("사용자가 설정한 날짜와 시간" + dateUser);
//		Date dateUser = new Date(2023-1900,2,8);
//		System.out.println("사용자가 설정한 날짜와 시간" + dateUser);
		
		Calendar cal = Calendar.getInstance(); //Calendar는 protected형이라서 new Calendar()로 불러오진 못한다. 대신 static형인 getInstance()를 통해 바로 불러온다.
		System.out.println("calendar=>" + cal);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.YEAR)+"년도");
		System.out.println((cal.get(Calendar.YEAR) +"년도" +(cal.get(Calendar.MONTH)+1) +"월"+cal.get(Calendar.DATE) +"일"));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));

		System.out.println("============형식 지정 출력==============");
		System.out.println();
		System.out.print(120+"\n");
		System.out.println();
		System.out.printf("%1$ta %1$tb %1$td %1$tT %1$tZ %1$tY",now);
		
		System.out.println("============중복이 허락되지 않는 ID발급==============");
		System.out.println(UUID.randomUUID());
		
		
		
		
	}
}
