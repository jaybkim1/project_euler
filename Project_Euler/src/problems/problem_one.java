package problems;

public class problem_one {

	//10���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� 3, 5, 6, 9 �̰�, �̰��� ��� ���ϸ� 23�Դϴ�.
	//1000���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?
	
	public static void main(String[] args) {
		
		// O(n)
//		int sum = 0;
//		
//		for (int i = 3; i < 1000; i++) { // �ڿ��� 100 ���� for���� ������
//			
//			if (i % 3 == 0 || i % 5 == 0) { // 3 �Ǵ� 5�� ����� ���ǹ��� �ɰ� ��� ���Ѵ�
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
