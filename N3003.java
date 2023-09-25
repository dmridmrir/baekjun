package baekjun;

import java.util.Scanner;

public class N3003 {

	public static void main(String[] args) {
//		동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//		체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//		체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//		동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.		
		System.out.println("킹, 퀸, 룩, 비숍, 나이트, 폰 순서로 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[6];
		int[] chess = {1,1,2,2,2,8};
		
		for(int i = 0; i < 6; i++) {
			A[i] = scanner.nextInt();
		}
		
		int[] ans = {chess[0] - A[0],chess[1] - A[1],chess[2] - A[2],chess[3] - A[3],chess[4] - A[4],chess[5] - A[5]};
		System.out.print("조정해야 할 갯수는 : ");
		for(int i = 0; i <6; i ++) {
			System.out.print(ans[i] + " ");
		}
	}

}