package libraryExam06;

import java.io.File;
import java.util.Date;

public class DirList05 {

	public static void main(String[] args) {
		File files = null;
		files = new File("."); //현재 프로젝트가 있는 폴더 의미
		File[] fileList= files.listFiles();	
		int fileCount=0;
		int dirCount=0;
		long fileTotalSize=0;
		
		for(int i=0; i<fileList.length; i=i+1) {
			Date cDate =new Date(fileList[i].lastModified());
			if( fileList[i].isDirectory()) {
				System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM",cDate);
				System.out.println("    <DIR>          "+fileList[i].getName());
				dirCount=dirCount+1;
			}
			if( fileList[i].isFile()) {
				long fileSize =fileList[i].length() ;
				System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM",cDate);
				System.out.printf("      %,11d  %s\n", fileSize,fileList[i].getName());
				fileCount +=1;
				fileTotalSize+=fileSize;
			}
		}
		
		System.out.printf("        %d개의 파일 %,25d 바이트\n",fileCount,fileTotalSize);
		System.out.printf("        %d개의 디렉토리 %,18d 바이트 남음\n",dirCount,fileList[0].getUsableSpace());
	}

}
