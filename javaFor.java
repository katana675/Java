import java.util.ArrayList;

public class javaFor {

	public static void main(String[] args) {
//		int keisan[] =new int[1000];
		ArrayList keisan=new ArrayList();
		String awase="exit";
		int sum=0;
		int j=0;
		while(true) {
			System.out.println("数字を入力してください");
			String kakunin=new java.util.Scanner(System.in).nextLine();
			if(awase.equals(kakunin)) {
				for(int i=0; i<keisan.size(); i++) {
					sum += Integer.parseInt(keisan.get(i).toString());
				}
				System.out.println("合計値は"+sum+"です");
				break;
			}else {
//				for(int j=0; j<keisan.length; j++) {
					keisan.add(Integer.parseInt(kakunin));
//				}
			}
		}
	}
}
