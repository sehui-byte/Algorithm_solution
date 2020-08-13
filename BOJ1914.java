import java.math.BigInteger;
import java.util.Scanner;

public class BOJ1914 {
	public static void Hanoi1(int n, int x, int y) {	

		if(n == 0) {
			return;
		}
		Hanoi1(n-1, x, 6-x-y); //n-1���� ������ �߰� ������� �ű��
		System.out.println(x + " " + y);
		Hanoi1(n-1, 6-x-y, y); //n-1���� ������ �߰���տ��� ��ǥ���� ������� �ű��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //���� ����
		BigInteger count = BigInteger.valueOf(2).pow(n); //2
		//BigInteger tmp = count.pow(n); //2�� n��
		BigInteger result = count.subtract(BigInteger.ONE); //����1
		
		System.out.println(result);
		
		if(n<=20) {
			Hanoi1(n,1,3);
		}
	}
}
