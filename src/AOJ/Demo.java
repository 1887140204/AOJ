package AOJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println('a'-'b');
	}
}

class number {
	public static void tongji(String str) {
		// ͳ��Ԫ�ظ���
		// e��ʾ��Ҫƥ������ݣ�ʹ��Pattern����ƥ��ģʽ
		Pattern p = Pattern.compile("e");
		// ʹ��Matcher���и��ֲ����滻����
		Matcher m = p.matcher(str);
		int i = 0;
		while (m.find()) {
			i++;
		}
		System.out.println(i);
		System.out.println(str);

	}
}
