import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tank extends Thread{
	JButton b;
	int c=0;
	public void run()
	{
		b = new JButton();
		b.setBounds(285, 495, 15, 15);
		MyGame.frame.add(b);
		int y=495;
		try {
		while(y>=0)
		{
			Thread.sleep(100);
			y=y-10;
			if(y<45)
			{
				int ashu = Target.x;
				if(ashu>=205 && ashu<=300)
				{
					c=1;
				}
			}
			b.setBounds(285, y, 15, 15);
		}
		}catch(Exception e) {
		}
		b.setBounds(0, 0, 0, 0);
		if(c==1) {
		int a = 1 + Integer.parseInt(MyGame.score.getText());
		MyGame.score.setText(""+a);
		}
	}
}
