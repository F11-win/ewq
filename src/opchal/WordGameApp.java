package opchal;

import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int n = scan.nextInt();
		Player [] p = new Player[n];
		for (int i = 0; i < n; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			p[i] = new Player(scan.next());
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		String FirstWord = "�ƹ���";
		int s=0;
		while(true) {
			System.out.print(p[s].getName()+">>");
			String word = scan.next();
			int FirstWordl = FirstWord.length()-1;
			if(FirstWord.charAt(FirstWordl)==word.charAt(0)) {
				FirstWord=word;
				}
			else {
				System.out.println(p[s].getName()+"�� �����ϴ�.");
				break;
			}
			s++;
			if(s%n==0) s=0;
		}
	}

}
