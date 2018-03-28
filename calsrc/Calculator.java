package cal;

public class Calculator {

	public int addition(int a,int b)
	{
		int result = a+b;
		return result;
	}
	public int sub(int a, int b)
	{
		int result = a-b;
		return result;
	}
	public static void main(String[] args) {
		Calculator o = new Calculator();
		System.out.println(o.addition(3, 3));
	}

}
