import java.util.Scanner;

public class RectArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Rect R[] = new Rect[4];
		for (int i = 0; i < R.length; i++) {
			System.out.print((i+1) + "�ʺ��� ���� >>");
			int width = scan.nextInt();
			int height = scan.nextInt();
			R[i] = new Rect(width,height);
		}
		System.out.println("�����Ͽ����ϴ�...");
		System.out.print("�簢���� ��ü ���� ");
		int sum=0;
		for (int i = 0; i < R.length; i++) {
			sum+=R[i].getArea();
		}
		System.out.println(sum);
		scan.close();
	}


}
