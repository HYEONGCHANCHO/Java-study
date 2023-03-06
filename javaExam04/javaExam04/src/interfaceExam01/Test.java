package interfaceExam01;

public class Test {

	public static void main(String[] args) {
		String textData = "나의 살던 고향은 꽃피는 산골 봉숭화꽃 살구꽃";
		textData = textData+" 영구없다";
		//1. 위의 문자열은 몇개의 단어로 구성되어 있는지를 출력하는 프로그램을 작성하시오
		String[] words=textData.split(" ");
		System.out.println(words.length);
		
		//2. 각각의 단어를 출력하는 프로그램을 작성하시오
		for(String word : words) {
			System.out.println(word);
		}
		
		//3. 문자열에서 임의의 문자열(예. 고향)이 들어있는지 판단하는 프로그램을 작성하시오
		int pos = textData.indexOf("고향");
		if (pos > -1) {
			System.out.println("찾고자 하는 단어가 들어있어요"+(pos+1)+"번 째에 있네요");
		}else {
			System.out.println("찾고자 하는 단어가 들어있지 않아요");	
		}
		
	}
}
