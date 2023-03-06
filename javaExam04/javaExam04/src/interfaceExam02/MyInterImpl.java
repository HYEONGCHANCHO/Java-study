package interfaceExam02;

public class MyInterImpl implements MyInter{

	@Override
	public int sum(int[] nums) {
		int result=0;
		for(int i=0; i<nums.length; i=i+1) {
			result +=nums[i];
		}
		return result;
	}

}
