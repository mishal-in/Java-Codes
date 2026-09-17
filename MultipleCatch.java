class MultipleCatch{
	public static void main(String args[]){
		try{
			int a[]={10,20,30};
			int x=10/0;
			System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is out of range");
		}
		catch (ArithmeticException e){
			System.out.println("Array index Exception occurred");
		}
	}
}
