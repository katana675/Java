
public class javaFor {

	public static void main(String[] args) {
		int keisan[] =new int[1000];
		String awase="exit";
		int sum=0;
		System.out.println("数字を入力してください");
		String kakunin=new java.util.Scanner(System.in).nextLine();
		if(awase.equals(kakunin)) {
			for(int i=0; i<keisan.length; i++) {
				sum+=keisan[i];
				System.out.println("合計値は"+keisan+"です");
				}
			}else {
			int keisan=Integer.parseInt(kakunin);	
		}
	}
}
