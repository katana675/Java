package bank;

public class Main {

	public static void main(String[] args) {
		int price;
		calculator t1=new calculator();
		t1.setbalance(10000);
		t1.deposit(5000);
		int num=calculator.deposit();
		if(num==0) {
			System.out.println("0です");
		}else {
			System.out.println("-1です");
		}
		System.out.println("残高は"+calculator.getBalance());
		calculator.payment(5000);
		System.out.println("残高は"+calculator.getBalance());
		calculator.payment(20000);
}
}