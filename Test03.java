package �ڹ��׽�Ʈ;

import java.util.Scanner;

import Exam02.Address;

public class Test03 {

	public static void main(String[] args) {
		// getMeiddle ->�ϳ��� �ܾ �Է��� �ܾ��� ��� ���ڸ� ��ȯ�ϴ� ����
		// ��Ģ. 1.�ܾ��� ���̰� ¦���� ��� ��� �� ���� ��ȯ / Ȧ���� ��� ��� �� ���� ��ȯ
		// ex) power -> w, test-> es

		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է� >> ");
		String name = sc.next();
		System.out.println(getMiddle(name));
	}

	public static String getMiddle(String word) {
		int lengh = word.length();
		int index = lengh / 2;
		String result = (lengh % 2 == 0) ? word.substring(index - 1, index + 1) : word.substring(index, index + 1);
		// substring ���ڿ� �ڸ���
		// .substring(n)
		// .substring(������ġ) -> ������n��ġ���� ���ڰ������� �ܾ���� ���
		// .substring(n, m) -> ������n��ġ���� m��ġ���� ���Ե� ���ڸ� ���
		return result;
	}
}
