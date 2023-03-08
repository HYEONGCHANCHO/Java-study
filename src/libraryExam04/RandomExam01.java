package libraryExam04;

import java.util.Random;

public class RandomExam01 {

	public static void main(String[] args) {
		Random rnd = new Random(10);
		for(int i=0; i<10; i+=1) {
			System.out.println(rnd.nextInt(10)+0); 
		}
	}

}
