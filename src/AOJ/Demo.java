package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {	
		
	}
}


class number {
	public static void tongji(String str) {
		// ͳ��Ԫ�ظ���
		// e��ʾ��Ҫƥ������ݣ�ʹ��Pattern����ƥ��ģʽ
		Pattern p = Pattern.compile("[0-9]");
		// ʹ��Matcher���и��ֲ����滻����
		Matcher m = p.matcher(str);
		int i = 0;
		while (m.find()) {
			i++;
		}
		System.out.println(i);

	}

	private static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
	
	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int c = 3; c * c <= n; c += 2) {
			if (n % c == 0)
				return false;
		}
		return true;
	}
}
