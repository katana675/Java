package robot;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		direction t1=new direction();
		int order;
		System.out.println("ロボット歩行プログラムへようこそ");
		System.out.println("以下の中からロボットに指示を出してください");
		do {
		System.out.println("0:現在位置を表示");
		System.out.println("1:北へ進む");
		System.out.println("2:東へ進む");
		System.out.println("3:南へ進む");
		System.out.println("4:西へ進む");
		System.out.println("9:プログラムを終了");
		System.out.println("コードを入力してください>");
		order=new java.util.Scanner(System.in).nextInt();
		if(order==0) {
			System.out.println("現在の場所は"+direction.NS()+","+direction.WE());
		}else if(order==1) {
			direction.north(1);
		}
		}while(order!=9);
		//9を入力するまでループ		
	}
}
