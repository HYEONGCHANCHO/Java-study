package interfaceExam02;

public class UseMyInter {

	public static void main(String[] args) {
		MyInter obj=null;
		obj= new MyInterImpl(); //구현체 클래스를 만들고 그 구현체 클래스를 생성
		System.out.println("숫자들의 합"+obj.sum(new int[] {1,23,36,45,87}));
		
		//따로 클래스를 만들지 않고 사용하는 방법(권장하지는 않음) , 단,라이브러리 함수형 인터페이스는 이방법 권장
		//익명의 클래스를 직접 만들어서 사용한다.
		MyInter obj2 = new MyInter() {
			
			@Override
			public int sum(int[] nums) {
				int result=0;
				for(int i=0; i<nums.length; i=i+1) {
					result +=nums[i];
				}
				return result;
			}
		};

		System.out.println("숫자들의 합"+obj2.sum(new int[] {1,2,3,4,5})); 
		
		//익명의 클래스를 직접 만들어서 사용한다.=> 람다식을 이용하는 방법(단, 인터페이스는 반드시 함수형이어야 한다.(메소드가 하나))
		MyInter obj3 = (nums) -> {
			int result=0;
			for(int i=0; i<nums.length; i=i+1) {
				result +=nums[i];
			}
			return result;
		};
		
		System.out.println("숫자들의 합"+obj3.sum(new int[] {10,20,30,40,50})); 
		
		
}
	
}