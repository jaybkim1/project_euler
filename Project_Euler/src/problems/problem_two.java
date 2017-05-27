package problems;

public class problem_two {

	// 문제 2 
	// 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
	// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	// 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

	public static void main(String[] args) {
		
		int sum = 0 ;
		int a = 0;
		int b = 1;
		int c = a + b;
		
		while (c < 4000000) { // 4백만 이하인 모든 항을 while문으로 돌린다
			if(c%2 == 0){ // 짝수 조건문 
				sum = sum + c;
			}
			a = b; // 첫번째 while문이 돌때 if문에 안걸리고 a = 1이 된다.
			b = c; // 첫번째 while문을 돌때 b[1] = c[1]
			c = a + b; // 첫번째 while문을 돌때 c = a[1] + b[1], c = 2
		}
		System.out.println(sum);

	}

}
