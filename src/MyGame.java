import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyGame {
static JFrame frame;
static JButton tank;
static JButton target;
static JLabel timer,score;
static MyGame mygame;
MyGame()
{
	frame = new JFrame();
	tank = new JButton();
	target = new JButton();
	timer = new JLabel();
	score = new JLabel();
	timer.setText("60");
	score.setText("0");
	timer.setFont(new Font("Aerial",1,32));
	score.setFont(new Font("Aerial",1,32));
	frame.setLayout(null);
	tank.setBounds(270, 510, 60, 40);
	target.setBounds(10, 10, 80, 20);
	timer.setBounds(10, 510, 50, 50);
	score.setBounds(540, 510, 50, 50);
	frame.add(target);
	frame.add(tank);
	frame.add(timer);
	frame.add(score);
	frame.setSize(600,600);
	frame.setVisible(true);
	Target t1 = new Target();
	t1.start();
	Timer t2 = new Timer();
	t2.start();
	tank.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Tank t3 = new Tank();
			t3.start();
		}
		
	});
}
public static void main(String args[])
{
	mygame = new MyGame();
}
}
