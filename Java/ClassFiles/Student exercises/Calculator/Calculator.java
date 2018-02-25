public class Calculator{
	public static double add(double x, double y){
        return x + y;
	}

    public static double subtract(double x, double y){
        return x - y;
	}
	public static double multiply(double x, double y){
        return x * y;
	}
	public static double divide(double x, double y){
        return x / y;
	}

	public static void main(String[] args){
        double a = 7, b = 2, c;
        c = add(a, b);
        System.out.println(a + " + " + b + " = " + c);

        c = subtract(a, b);
        System.out.println(a + " - " + b + " = " + c);

        c = multiply(a, b);
        System.out.println(a + " * " + b + " = " + c);

        c = divide(a, b);
        System.out.println(a + " / " + b + " = " + c);
	}
}