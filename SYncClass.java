class Thread1
{
	synchronized void dis()
	{
		System.out.println("First Statement");
		try
		{
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
		System.out.println("Second Statement");
	}
	
}
class Thread2 extends Thread
{
	Thread1 s1;
	public Thread2(Thread1 s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		s1.dis();
	}	
}
public class SYncClass
{
	public static void main(String args[])
	{
	Thread1 t = new Thread1();
	Thread2 obj1 = new Thread2(t);
	Thread2 obj2 = new Thread2(t);
	Thread2 obj3 = new Thread2(t);
	obj1.start();
	obj2.start();
	obj3.start();
	
	}
	
}