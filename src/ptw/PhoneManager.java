package ptw;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("인원수>>");
		int num = scan.nextInt();
		int cut=0;
		Phone []myPhone = new Phone[num];
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			String name = scan.next();
			String tel = scan.next();
			myPhone[i] = new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		while(true) {
		System.out.print("검색할 이름>>");
		String name2 = scan.next();
		for (int j = 0; j < myPhone.length; j++) {
			if(name2.equals(myPhone[j].name)) {
				System.out.println(name2+"의 번호는 "+myPhone[j].tel+"입니다.");
				cut=j;
			}
		}
		if(name2.equals("exit")) {
			System.out.println("프로그램을 종료합니다..");
			break;
		}
		if(!name2.equals(myPhone[cut].name)) {
			System.out.println(name2+" 이 없습니다.");
			}	
		
		}
		
	}
}