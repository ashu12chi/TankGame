import javax.swing.*;

public class Timer extends Thread{
	public void run()
	{
		try {
			while(true) {
		      Thread.sleep(1000);
		      int x = Integer.parseInt(MyGame.timer.getText());
		      x--;
		      if(x<0)
			  {
				  MyGame.frame.setVisible(false);
				  JOptionPane.showMessageDialog(null,MyGame.score.getText());
				  break;
			  }
		      MyGame.timer.setText(""+x);
			}
		}catch(Exception e)
		{
		}
	}
}
