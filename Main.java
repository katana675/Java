
public class Main {

	public static void main(String[] args) {
		System.out.println("数字を２回入力してください");
		int a=new java.util.Scanner(System.in).nextInt();
		int b=new java.util.Scanner(System.in).nextInt();
		System.out.println("１回目の数字は"+a+"です");
		System.out.println("２回目の数字は"+b+"です");
		calulater.addMethod(a,b);
		System.out.println("合計は"+calulater.addMethod(c)+"です");
	}
}
