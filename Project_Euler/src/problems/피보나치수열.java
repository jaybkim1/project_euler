import java.util.Scanner;

public class 피보나치수열 {
	
	// Fibonacci Sequence
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피보나치 수를 몇개나 출력하시겠습니까? ");
		int input = sc.nextInt(); 
		
		for(int i=1; i<=input; i++){
			System.out.print(fibo(i)+" ");
		}
	}
	
	// 피보나치수열 구하는 메소드
	public static int fibo(int n){
		if (n<=1) {
			return n;
		}else{
			return fibo(n-2) + fibo(n-1);
		}
		
	}
	
}
