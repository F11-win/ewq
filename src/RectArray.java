import java.util.Scanner;

public class RectArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Rect R[] = new Rect[4];
		for (int i = 0; i < R.length; i++) {
			System.out.print((i+1) + "너비의 높이 >>");
			int width = scan.nextInt();
			int height = scan.nextInt();
			R[i] = new Rect(width,height);
		}
		System.out.println("저장하였습니다...");
		System.out.print("사각형의 전체 합은 ");
		int sum=0;
		for (int i = 0; i < R.length; i++) {
			sum+=R[i].getArea();
		}
		System.out.println(sum);
		scan.close();
	}


}
