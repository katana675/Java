package robot;

public class direction {
	static int NP=0;
	static int EP=0;
	static int SP=0;
	static int WP=0;
	static int WE=0;
	static int NS=0;
	//currentLocation=現在地	
	//north=北	
	public static int north(int a) {
		NP++;
		return NP;
	}
	//east=東
	public static int east(int a) {
		EP++;
		return EP;
	}
	//south=南	
	public static int south(int a){
		SP++;
		return SP;
	}
	//west=西	
	public static int west(int a) {
		WP++;
		return WP;
	}
	public static int WE() {
		WE=EP-EP;
		return WE;
	}
	public static int NS() {
		NS=NP-NP;
		return NS;
	}
}
