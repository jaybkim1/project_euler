package problems;

public class problem_two {

	// ���� 2 
	// �Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�. 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.
	// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	// ¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?
	
	public static void main(String[] args) {
		
		int sum = 0 ;
		int a = 0;
		int b = 1;
		int c = a + b;
		
		while (c < 4000000) { // 4�鸸 ������ ��� ���� while������ ������
			if(c%2 == 0){ // ¦�� ���ǹ� 
				sum = sum + c;
			}
			a = b; // ù��° while���� ���� if���� �Ȱɸ��� a = 1�� �ȴ�.
			b = c; // ù��° while���� ���� b[1] = c[1]
			c = a + b; // ù��° while���� ���� c = a[1] + b[1], c = 2
		}
		System.out.println(sum);

	}

}
