package beakjun;

import java.util.Scanner;

public class N28295 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = 0;
		int inst;
		
		for(int i =0; i < 10; i ++) {
			inst = scanner.nextInt();
			if(inst == 1) {
				start++;
			}else if (inst == 2) {
				start += 2;
			}else {
				start--;
			}
			if(start > 3) {
				start -= 4;
			}
			if(start < 0 ) {
				start += 4;
			}
		}
		
		switch (start) {
		case 0:
			System.out.println("N");
			break;
		case 1:
			System.out.println("E");
			break;
		case 2:
			System.out.println("S");
			break;
		case 3:
			System.out.println("W");
			break;
		default:
			break;
		}
		
	}

}
