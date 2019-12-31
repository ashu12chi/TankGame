
public class Target extends Thread{
	static int x;
	public void run()
	{
		try {
		while(true)
		{
			Thread.sleep(10);
			 x=MyGame.target.getX();
			if(x<=509)
				x=x+1;
			else
				x=10;
			MyGame.target.setBounds(x, 10, 80, 20);
		}
	}catch(Exception e)
		{
		}
	}
}
