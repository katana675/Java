import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=scan.nextInt();
		if(sum==2) {
			System.out.println(sum+"月は28日です");
		}else if(sum==2 || sum==4 || sum==6 && sum==9 || sum==11) {
			System.out.println(sum+"月は30日です");
		}else if(sum==1 || sum==3 || sum==5 || sum==7 || sum==8 || sum==10 || sum==12) {
			System.out.println(sum+"月は31日です");
		}else {
			System.out.println("エラーです");
		}
		scan.close();
	}
}
	
