import java.util.Scanner;


public class �Ǻ���ġ���� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǻ���ġ������ ��� ����Ͻðڽ��ϱ�? ");
		int input = sc.nextInt(); 
		
		for(int i=1; i<=input; i++){
			System.out.print(fibo(i)+" ");
		}
	}
	
	// �Ǻ���ġ���� ���ϴ� �޼ҵ�
	public static int fibo(int n){
		if (n<=1) {
			return n;
		}else{
			return fibo(n-2) + fibo(n-1);
		}
		
	}
	
}
