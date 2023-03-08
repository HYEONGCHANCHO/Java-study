package libraryExam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BinaryFileReadWrite01_last {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String source = null; 
		String target = null;
		
		if(args.length !=2) {
			System.out.println("소스(복사할)파일을 입력해주세요");
			source=scan.next();
			System.out.println("타겟(복사될)파일명을 입력해주세요");
			target=scan.next();
		}
		if(args.length !=2) {
			source=args[0];
			target=args[1];
		}
		
		System.out.println("원하는 작업을 선택하세요[1:변환(암호화),2:복구(복호화)");
		int select = scan.nextInt();
		if(select==1) {
			fileEncode(source,target);
		}
		else {
			fileDecode( source, target);
		}

		
	}
	
	public static void fileEncode(String source,String target)  {
		
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr= new FileInputStream(source);
			fw= new FileOutputStream(target); 
			int readData=0;
			byte[] writeDataArr = new byte [10]; 
			Random rnd = new Random();
			for(int i =0; i<writeDataArr.length; i+=1) {
				writeDataArr[i] =(byte)rnd.nextInt(116); //일단 쓰레기 값으로 채워야 함
			}
			
			while((readData=fr.read())!= -1) {
				int rdp = rnd.nextInt(9); //3이 난수로 만들어졌다면
				writeDataArr[rdp] =(byte)readData; //실제 자료는 배열의 3번째 인덱스에 저장되어 있다.(그전에는 쓰레기 값이었음)
				writeDataArr[writeDataArr.length-1] = (byte)(116 + rdp); //123은 기준값이다. (속이기 위함 왜냐면 맨 마지막만 한자리로 나오거나하면 티나니까)
				fw.write(writeDataArr); // readData+1로 보내면 암호화되어 가고, 다시 복원할 때 readData-1로 해주면 다시 보이게 된다.
			}
			fw.close(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}		
	
	public static void fileDecode(String source,String target)  { //복원 메서드
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr= new FileInputStream(source);
			fw= new FileOutputStream(target); 
			int readLen=0;
			byte[] readDataArr = new byte [10]; 
			while((readLen=fr.read(readDataArr))!= -1) {
				int arrRealData = readDataArr[readDataArr[9]-116];
				fw.write(arrRealData); 
			}
			fw.close(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

