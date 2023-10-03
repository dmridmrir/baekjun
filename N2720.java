package baekjun;

import java.util.Scanner;

public class N2720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("시행 횟수 입력");
		int T = scanner.nextInt();
		
		double Q = 25;
		double D = 10;
		double N = 5;
		double P = 1;
		int[] coin = new int[4];
		int count = 0;
		
		for (int i=0; i < T; i++) {
			System.out.println("잔돈 입력 : ");
			int C = scanner.nextInt();
			System.out.println(C);
			
			while(C > Q) {
				C -= Q;
				count ++;
			}
			coin[0] = count;
			count = 0;
			
			while(C > D) {
				C -= D;
				count ++;
			}
			coin[1] = count;
			count = 0;
			
			while(C > N) {
				C -= N;
				count ++;
			}
			coin[2] = count;
			count = 0;
			
			while(C >= P) {
				C -= P;
				count ++;
			}
			coin[3] = count;
			
			for(int j = 0; j < coin.length; j ++) {
				System.out.print(coin[j] + " ");
			}
			System.out.println();
		}
	}

}
