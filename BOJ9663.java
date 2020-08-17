import java.util.Scanner;

public class BOJ9663 {
	
	static int count;
	static int col[];
	static int n;
	
	static boolean isPossible(int level) {//���� ��ġ�ų� �밢���� ���� �����ϰų� �ϸ� false
		for(int i = 1; i<level; i++) {//���� ��ġ�� ���� ��ĥ��
			if(col[i] == col[level])
				return false;
		}
		
		for(int i =1; i<level; i++) {//���� ���� �밢���� �����Ҷ�
			if(Math.abs(col[i]-col[level]) == level-i) {
				return false;
			}
		}
		return true;
	}

	
	static boolean setQueen(int level) {
		
		if(!isPossible(level)) {//���� �������� ��ġ�� �������� ������ false
			return false;
		}
		
		else if(level == n) {//��� �࿡ ���� ��ġ�Ͽ��� ��� true
			count++;
			return true;
		}
		
		for(int i = 1; i<=n; i++) {
			col[level+1] = i; //�� �࿡ ���� ��ġ�Ѵ�
			setQueen(level+1); 
			}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //n���� �� �Է�
		col = new int[n+1];
		setQueen(0);
		System.out.println(count);
	}

}
��