package ptw;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("�ο���>>");
		int num = scan.nextInt();
		int cut=0;
		Phone []myPhone = new Phone[num];
		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			String name = scan.next();
			String tel = scan.next();
			myPhone[i] = new Phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
		System.out.print("�˻��� �̸�>>");
		String name2 = scan.next();
		for (int j = 0; j < myPhone.length; j++) {
			if(name2.equals(myPhone[j].name)) {
				System.out.println(name2+"�� ��ȣ�� "+myPhone[j].tel+"�Դϴ�.");
				cut=j;
			}
		}
		if(name2.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�..");
			break;
		}
		if(!name2.equals(myPhone[cut].name)) {
			System.out.println(name2+" �� �����ϴ�.");
			}	
		
		}
		
	}
}