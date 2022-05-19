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
		NS=NS+a;
		return NS;
	}
	//east=東
	public static int east(int a) {
		WE=WE-a;
		return WE;
	}
	//south=南	
	public static int south(int a){
		NS=NS-a;
		return NS;
	}
	//west=西	
	public static int west(int a) {
		WE=WE+a;
		return WE;
	}
	public static int WE() {
		return WE;
	}
	public static int NS() {
		return NS;
	}
}
