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
}
