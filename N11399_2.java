package baekjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class N11399_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("줄을 서있는 인원 수 입력");
		int line = scanner.nextInt();
		
		ArrayList<Integer> time = new ArrayList<Integer>();
		
		for(int i = 0; i <line; i++) {
			System.out.println((i+1) + "번째 사람이 인출하는데 걸리는 시간 : ");
			time.add(scanner.nextInt());
		}
		System.out.println(time);
	}

}
