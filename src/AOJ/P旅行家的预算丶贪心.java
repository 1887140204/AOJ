package AOJ;

import java.util.Scanner;

public class P���мҵ�Ԥ��ؼ̰�� {
	/*
	 * ����ڼ����͵�����£����Ե���ĳ������ͼ۸��͵ģ�����ȥ����͹���ֱ��ȥ���������ӵ����á�
	 * ���Ե���ĳ���û���ͼ۸��͵ģ����ڵ�ǰ���м����ͣ�ȥ��Զ�ĳ��С�
	 */

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			double d1 = cin.nextDouble();
			double c = cin.nextDouble();
			double d2 = cin.nextDouble();
			double p = cin.nextDouble();
			int n = cin.nextInt();
			int x = 0;
			double ans = 0, y = 0;
			double[] D = new double[150];
			double[] P = new double[150];
			P[0] = p;
			for (int i = 1; i <= n; i++) {
				D[i] = cin.nextDouble();
				P[i] = cin.nextDouble();
			}
			D[++n] = d1;
			while (true) {
				if (d1 == 0) {
					ans = 0;
					break;
				}
				int k = -1, yuan = 0;
				for (int i = x + 1; i <= n; i++) {
					if (D[i] - D[x] <= c * d2) {
						if (P[i] < P[x]) {
							k = i;
							break;
						}
					} else {
						yuan = i - 1;
						break;
					}
				}
				if (k < 0) {
					if (yuan == x) {
						System.out.println("No Solution");
						break;
					}
					ans += P[x] * (c - y);
					y = c - (D[yuan] - D[x]) / d2;
					x = yuan;
				} else {
					if (y * d2 >= D[k] - D[x])
						y -= (D[k] - D[x]) / d2;
					else {
						ans += P[x] * ((D[k] - D[x]) / d2 - y);
						y = 0;
					}
					x = k;
				}
				if (x == n)
					break;
			}
			System.out.printf("%.2f", ans);
		}
	}
}