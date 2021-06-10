package week15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, K;
	static boolean[] arr;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N+1];
		int k=0;
		for(int i=2; i<=N; i++) {
			
			if(arr[i]) continue;
			for(int j=i; j<=N; j+=i) {
				if(arr[j]) continue;
				arr[j] = true;
				k++;
				if(k == K) {
					System.out.println(j);
					return;
				}
			}
			
		}
		
		
		

	}

}
