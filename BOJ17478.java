import java.util.Scanner;

public class BOJ17478 {
	static void recur(int n, String s) {
		
		System.out.println(s + "\"����Լ��� ������?\"");
		if(n == 0) {
			System.out.println(s + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			return;
		}
		
		System.out.println(s + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(s + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(s + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		s += "____";			
		recur(n-1, s);	
		System.out.println(s + "��� �亯�Ͽ���.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recur(n, s);
		System.out.println("��� �亯�Ͽ���.");
		
		

	}

}
