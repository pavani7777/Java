class NewThreadClass implements Runnable
{
	Thread t;
	NewThreadClass()
	{
		t=new Thread(this,"childThread");
		System.out.println("thread created:"+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(t+"loop:"+i);
				Thread.sleep(100);
				
			}
		}
		
		catch(InterruptedException obj)
		{
			System.out.println("thread:"+t+"interrupted");
		}
	}
}
class IaAliveDemo
{
	public static void main(String args[])
	{
		NewThreadClass obj=new NewThreadClass();
		System.out.println(obj.t+"isAlive ?:"+obj.t.isAlive());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main thread loop");
				Thread.sleep(200);;
			}
		}
			catch(InterruptedException e)
			{
				System.out.println("main thread is interrupted");
			}
			System.out.println(obj.t+"isAlive?:"+obj.t.isAlive());
			System.out.println("main thread is exiting");
		}
	}
		



	