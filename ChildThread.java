class  ChildThread implements Runnable
{
	Thread t;
	ChildThread()
	{
		t=new Thread(this,"ChildThread");
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
				Thread.sleep(500);
			}
		}
		catch(InterruptedException obj)
		{
			System.out.println("thread:"+t+"interrupted");
		}
	}
}
public class JoinDemo
{
	public static void main(String args[])
	{
		ChildThread obj=new ChildThread();
		System.out.println(obj.t+"is alive?:"+obj.t.isAlive());
		try
		{
			System.out.println("main thread waiting for child thread to finish");
			obj.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread is interrupted");
		}
		System.out.println(obj.t+"is alive?:"+obj.t.isAlive());
		System.out.println("main thread is exiting");
	}
}

		
		
				
			
		
		
		
	
