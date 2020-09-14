import java.util.*;

public class BOJ2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;

		for(int i = 2; i<=n; i++) 
			arr[i-2] = i;

		for(int j = 0; j<k; j++) {
			int p = 0;
			for(int i = 0; i<n; i++) {
				if(arr[i] != 0) {
					p = arr[i];
					count++;
					if(count == k)
						System.out.println(arr[i]);
					arr[i] = 0; //p를 지운다
					break;
				}
			}

			for(int i = 0; i<n; i++) {
				if(arr[i] == 0)
					continue;
				if(arr[i]%p == 0) {
					count++;
					if(count == k)
						System.out.println(arr[i]);
					arr[i] = 0; //p의 배수들을 지운다
					
				}
			}	
		}
	}
}
