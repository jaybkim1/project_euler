package problems;

public class problem_one {

	//10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
	//1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
	
	public static void main(String[] args) {
		
		// O(n)
//		int sum = 0;
//		
//		for (int i = 3; i < 1000; i++) { // 자연수 100 까지 for문을 돌린다
//			
//			if (i % 3 == 0 || i % 5 == 0) { // 3 또는 5의 배수인 조건문을 걸고 계속 더한다
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
		// O(n) = O(n/3) + O(n/5) + O(n/15)
		int sum = 0 ;
	    for ( int i = 3 ; i < 1000 ; i+=3 ){
	        sum+=i;
	    }
	    for ( int i = 5 ; i < 1000 ; i+=5 ){
	        sum+=i;
	    }       
	    for ( int i = 15 ; i < 1000 ; i+=15 ){
	        sum-=i;
	    }
	    System.out.println(sum);
		
	}

}
