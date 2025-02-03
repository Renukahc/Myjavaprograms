package Assignment1;

public class StaticMetod_Arithmatic 
{
	static void addition()
	{
		int a=1000;
		int b=205;
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtraction()
	{
		int a=500;
		int b=200;
		int sub=a-b;
		System.out.println(sub);
	}
	static void Multiplication()
	{
		int a=200;
		int b=10;
		int mul=b*a;
		System.out.println(mul);
	}
	static void Division()
	{
		int a=10;
		int b=1000;
		int div=b/a;
		System.out.println(div);
	}
	static void modulus()
	{
		int a=9;
		int b=300;
		int m=b%a;
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		System.out.println("Arithmatic Operators Result:");
		addition();
		subtraction();
		Multiplication();
		Division();
		modulus();
	}
}
