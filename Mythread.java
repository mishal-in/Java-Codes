class Mythread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++){
			System.out.println("Child Thread: "+i);
		}
	}
}

class MultithreadsDemo{
	public static void main(String args[])
	{
		Mythread t=new Mythread();
		t.start();
		for(int i=1;i<=5;i++){
			System.out.println("Main Thread: "+i);
		}
	}
}