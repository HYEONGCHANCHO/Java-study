package exam01;

public class MainReadExam {
	public static void main(String[] args) {
//		FileReadInter fileRead =new FileScanRead();
//		System.out.println("=Scanner를 이용한 파일 읽기");
//		String readText =fileRead.readText("testExam.txt");
//		System.out.println(readText);
		
		consolePrint(new FileInputStreamRead(),"testExam.txt","FileReader");
		consolePrint(new FileScanRead(),"testExam.txt","Scanner");
	}
		
//		FileReadInter fileRead1 =new FileInputStreamRead();
//		System.out.println("=FileReader를 이용한 파일 읽기");
//		String readText1 =fileRead1.readText("testExam.txt");
//		System.out.println(readText1);
		
		private static void consolePrint(FileReadInter fileRead,String fileName, String prnInfo) {
			System.out.printf("=%s 을(를) 이용한 파일 읽기\n", prnInfo);
			String readText =fileRead.readText(fileName);
			System.out.println(readText);
			
			
		}
		
}

