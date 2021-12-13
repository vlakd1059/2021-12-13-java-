package 자바테스트;

import java.util.Scanner;

import Exam02.Address;

public class Test03 {

	public static void main(String[] args) {
		// getMeiddle ->하나의 단어를 입력해 단어의 가운데 글자를 반환하는 문제
		// 규칙. 1.단어의 길이가 짝수일 경우 가운데 두 글자 반환 / 홀수인 경우 가운데 한 글자 반환
		// ex) power -> w, test-> es

		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력 >> ");
		String name = sc.next();
		System.out.println(getMiddle(name));
	}

	public static String getMiddle(String word) {
		int lengh = word.length();
		int index = lengh / 2;
		String result = (lengh % 2 == 0) ? word.substring(index - 1, index + 1) : word.substring(index, index + 1);
		// substring 문자열 자르기
		// .substring(n)
		// .substring(시작위치) -> 지정한n위치부터 문자가끝나는 단어까지 출력
		// .substring(n, m) -> 지정한n위치부터 m위치까지 포함된 글자를 출력
		return result;
	}
}
