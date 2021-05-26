package opchal;

import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int n = scan.nextInt();
		Player [] p = new Player[n];
		for (int i = 0; i < n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			p[i] = new Player(scan.next());
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		String FirstWord = "아버지";
		int s=0;
		while(true) {
			System.out.print(p[s].getName()+">>");
			String word = scan.next();
			int FirstWordl = FirstWord.length()-1;
			if(FirstWord.charAt(FirstWordl)==word.charAt(0)) {
				FirstWord=word;
				}
			else {
				System.out.println(p[s].getName()+"이 졌습니다.");
				break;
			}
			s++;
			if(s%n==0) s=0;
		}
	}

}
