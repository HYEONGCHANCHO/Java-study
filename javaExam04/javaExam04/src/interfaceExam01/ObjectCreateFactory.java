package interfaceExam01;

import java.io.File;
import java.util.Scanner;

public class ObjectCreateFactory {

	public static InterExam01 createObjText() {
		String[] objNameList = nonDuplicate();
		try {
			Class<InterExam01> t = (Class<InterExam01>) Class.forName(objNameList[0]);
			return t.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static InterStdExam createStd() {
		String[] objNameList = nonDuplicate();
		try {
			Class<InterStdExam> t = (Class<InterStdExam>) Class.forName(objNameList[1]);
			return t.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String[] nonDuplicate() {
		Scanner scan = null;
		StringBuffer readClassNameData = new StringBuffer();
		try {
			scan = new Scanner(new File("objectCreateList.txt"));
			String rData = null;
			while (scan.hasNextLine()) {
				rData = scan.nextLine();
				readClassNameData.append("/" + rData);
			}
			String[] objNameList = (readClassNameData.substring(1).toString()).split("/");
			return objNameList;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
