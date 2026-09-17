import java.util.Scanner;

class MethodOverloading
{
	int add(int a,int b)
	{
		return a+b;
	}
	
		int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
		double add(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new
		Scanner(System.in);
		
		MethodOverloading obj=new MethodOverloading();
	
		System.out.print("Enter 1st Number :");
		int n1=sc.nextInt();
	
		System.out.print("Enter 2nd Number :");
		int n2=sc.nextInt();
	
		System.out.println("Sum of 2 Numbers ="+obj.add(n1,n2));
	
		System.out.print("Enter 3nd Number :");
		int n3=sc.nextInt();
	
		System.out.println("Sum of 3 Numbers ="+obj.add(n1,n2,n3));
	
		System.out.print("Enter 1st Decimal Number :");
		double d1=sc.nextDouble();
	
		System.out.print("Enter 2nd Decimal Number :");
		double d2=sc.nextDouble();
	
		System.out.println("Sum of 2 Decimal Numbers ="+obj.add(d1,d2));
	
		sc.close();
	}
}

