package AOJ;

import java.util.Scanner;

public class P1280 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		if (num % 2 == 0)
			System.out.println("yes");
		else
			System.out.println("no");
		cin.close();
	}
}