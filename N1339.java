package baekjun;

import java.util.Scanner;

public class N1339 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("단어 갯수 입력");
		int N = scanner.nextInt();
//		단어 갯수 입력
		
		String str[] = new String[N]; 
		
		for (int i = 0; i < N; i ++) {
			System.out.println((i+1) + "번째 줄에 입력될 단어 입력 (단어의 길이는 8이하)");
			str[i] = scanner.next();
		}
		System.out.println("입력된 단어");
		for(int i = 0; i<str.length; i ++) {
			System.out.println(str[i]);
		}
	}

}
