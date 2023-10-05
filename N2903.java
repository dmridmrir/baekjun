package baekjun;

import java.util.Scanner;

public class N2903 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int first = 2;
		
		for(int i = 0; i <N; i ++) {
			first = first +(first-1); 
		}
		System.out.println(first*first);
	}

}


