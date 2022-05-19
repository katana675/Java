package robot;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		direction t1=new direction();
		System.out.println("ロボット歩行プログラムへようこそ");
		System.out.println("以下の中からロボットに指示を出してください");
		System.out.println("0:現在位置を表示");
		System.out.println("1:北へ進む");
		System.out.println("2:東へ進む");
		System.out.println("3:南へ進む");
		System.out.println("4:西へ進む");
		System.out.println("9:プログラムを終了");
		System.out.println("コードを入力してください>");
		int order=0;
		while(order!=9) {
			order=new java.util.Scanner(System.in).nextInt();
			if(order==0) {
				System.out.println("現在の場所は"+direction.NS()+","+direction.WE());
			}else if(order==1) {
				direction.north(1);
			}else if(order==2) {
				direction.west(1);
			}else if(order==3) {
				direction.south(1);
			}else if(order==4) {
				direction.east(1);
			}else {
				System.out.println("適切な数字を入力してください");
				System.out.println("1.北 2.東 3.南 4.西　0.表示 9.終了");
			}
		} 	System.out.println("プログラムを終了します");
	}
}
