import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("１回目の数字を入力してください");
		int sum1=scan.nextInt();
		System.out.println("２回目の数字を入力してください");
		int sum2=scan.nextInt();
		System.out.println("３回目の数字を入力してください");
		int sum3=scan.nextInt();
		System.out.println("４回目の数字を入力してください");
		int sum4=scan.nextInt();
		System.out.println("５回目の数字を入力してください");
		int sum5=scan.nextInt();
		scan.close();
		System.out.println("５つの数字を合わせた結果を表示します");
		System.out.println("１回目+"+"２回目+"+"３回目+"+"４回目+"+"５回目="+(sum1+sum2+sum3+sum4+sum5));
	}
}
	
