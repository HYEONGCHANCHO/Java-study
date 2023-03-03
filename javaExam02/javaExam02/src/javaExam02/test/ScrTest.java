package javaExam02.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import javaExam02.src.Big;
import javaExam02.src.Small;

public class ScrTest {
	
		Object obj = new Small();
		
		@Test
		public void objTest() {
			
			assertNotNull(obj);
		}
		@Test
		public void rtnValueTest() {
			
			assertEquals(((Big) obj).getMoney(), 300);
		}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			Scanner scan = new Scanner(System.in); //키보드로 부터 입력받겠다.
//			String inputData = scan.next(); //문자열 입력받음 입력한 글자수는 반드시 5글자로 이루어져야 한다고 가정하고 테스트를 하고자함.
//			assertEquals(inputData.length(),5); //junit이 있을 때 테스는 하는 법
//			assertNotNull(inputData);
//			if(inputData.length() <=5) {
//				System.out.println("입력이 정상적으로 이루어져 있습니다.");
//			}
			
			
			
