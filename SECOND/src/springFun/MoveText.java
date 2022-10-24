package springFun;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MoveText extends JFrame implements Runnable {
	
	
	Thread t1;
	Thread t2;
	int x1;
	int x2;
	
	public MoveText()
	{
		t1=new Thread(this);
		t2=new Thread(this);
		
		x1=0;
		x2=600;
		
		t1.start();
		 
		t2.start();
		
	}

	public static void main(String[] args) {
		
		MoveText tt=new MoveText();
		
		
		tt.setVisible(true);
		
		tt.setSize(500,500);
		tt.setDefaultCloseOperation(tt.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		g.setFont(new Font("Ariel",Font.BOLD,30));
		g.drawString("Vaibhav", x1, 250);
		g.drawString("Singh", x2, 250);
	}

	@Override
	public void run() {
		
		while(x2>=362)
		{
			
			
			x1++;
			x2--;
		
		repaint();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
