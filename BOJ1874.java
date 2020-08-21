import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ1874 {
	static int arr[]; //���� ���� (�Է¹޴� ����)
	static Stack<Integer> s = new Stack<Integer>(); //������ �־��ٰ� ���� ����
	static Stack<String> result = new Stack<String>(); //+,-����ϴ� ��� ����
	static int max; //���ÿ� push�� ���� �� ���� ū ����

	static boolean isPossible(int n) {
		int index = 0; //�ϼ��Ϸ��� ���� index, index=0�̸� arr[0]�� ���� ������� ��
		//�ϴ� ���ÿ� 1�� �ִ´� (�ʱ�ȭ)
		s.push(1);
		result.push("+");
		max = 1;
		
		while(true) {
			if(index == n)
				break;
	
			if(max > arr[index] && s.peek() != arr[index] && !s.isEmpty()) {
				result.clear();
				System.out.println("NO");
				return false;
			}

			if(arr[index] > max) {
				for(int i = max+1; i<= arr[index]; i++) {
					s.push(i);
					result.push("+");
					max = i;
				}
			}
			if(arr[index] == s.peek() && !s.isEmpty()) {
				s.pop();
				result.push("-");
				index++; //��ǥ���� ���� arr[index]�� ����
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		arr = new int[n];

		for(int i = 0; i<n; i++) 
			arr[i] = Integer.parseInt(br.readLine());

		isPossible(n);

		//��� ���
		Iterator<String> it = result.iterator();
		if(!result.isEmpty()) {
			while(it.hasNext()) {
				bw.write(it.next() + "\n"); 
			}	
		}
		bw.close();
	}
}
