package AOJ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		
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
	private static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
