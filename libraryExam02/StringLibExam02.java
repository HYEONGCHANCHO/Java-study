package libraryExam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringLibExam02 {

	public static void main(String[] args) {
		//가장 기본이 되는 method를 이용해서 문자열의 빈도수 분석하기
		
		String datas = "누구나 한번쯤은 사랑에 속고 누구나 한번쯤은 사랑에 울고 그것이 바로 사랑 사랑이야 철부지 어렸을때 사랑을 몰라";
		
		System.out.println(datas.indexOf("사랑",10));
		
		/*원하는 단어를 indexof를 이용해서 찾는다 -1이 나올 때까지 <= 반복 while( for문도 가능)
		 맨처음에는 0부터, 그다음은 찾은위치 다음부터		 */
//		int startPos =0;
//		int resultPos=0;
//		int wordFindCount=0;
//		while((resultPos = datas.indexOf("사랑", startPos)) != -1) {
//			startPos = resultPos+1;
//			wordFindCount = wordFindCount +1;
//		}
		
		String[] words = datas.split("\\s+"); //긴 문장을 이루고 있는 단어들을 분리하여 배열에 저장
		Map<String, Integer> wordCountMap = new HashMap<>();
		for(String word : words) {
			int startPos =0;
			int resultPos=0;
			int wordFindCount=0;
			while((resultPos = datas.indexOf(word, startPos)) != -1) {
				startPos = resultPos+1;
				wordFindCount = wordFindCount +1;
			}
			wordCountMap.put(word, wordFindCount);
			System.out.println(word+" 개수 :"+wordFindCount);
		}
		System.out.println("중복을 제거한 결과 출력=>");
		System.out.println("먼저 키값 13개를 얻어낸 후에 출력해보자");
		Set<String> keyset = wordCountMap.keySet();
		Iterator<String> iter=keyset.iterator();
		while(iter.hasNext()) {
			String wordName = iter.next();
			System.out.println( wordName+ "=> 개수:"+wordCountMap.get(wordName));}
		}
	}

