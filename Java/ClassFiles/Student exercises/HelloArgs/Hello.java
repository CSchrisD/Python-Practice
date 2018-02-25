public class Hello {
	public static void main(String[] args) {

		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}

		//for each option
		for(String a : args) {
			System.out.println(a);
		}
	}
}