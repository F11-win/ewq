import java.util.Scanner;

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {return name;}
	public String getTel() {return tel;}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	Phone myPhone[] = new Phone[2];
		for (int i = 0; i < 2; i++) {
			System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
			String name = scan.next();
			String tel = scan.next();
				myPhone[i] = new Phone(name,tel);
		}
		for (int i = 0; i < myPhone.length; i++) {
			System.out.println(myPhone[i].name + "�� ��ȣ "+myPhone[i].tel);
		}
		scan.close();
	}

}
