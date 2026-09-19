package module5;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculatorDemo extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton ad,su;
	JLabel l1,l2,l3;
	CalculatorDemo()
	{
		JFrame f=new JFrame("my calculator");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,2));
		JLabel l1=new JLabel("num1");
		tf1=new JTextField();
		JLabel l2=new JLabel("num2");
		tf2=new JTextField();
	     JLabel l3= new JLabel("result");
	     tf3=new JTextField("");
	     ad=new JButton("add");
	     su=new JButton("sub");
	     p.add(l1);
	     p.add(tf1);
	     p.add(l2);
	     p.add(tf2);
	     p.add(l3);
	     p.add(tf3);
	     p.add(ad);
	     p.add(su);
	     ad.addActionListener(this);
	     su.addActionListener(this);
	     f.add(p);
	     f.setSize(400,400);
	     f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int c=0;
		String s1=tf1.getText();
		String s2=tf2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		if(e.getSource()==ad)
		{
			c=a+b;
			String rs=String.valueOf(c);
			tf3.setText(rs);
		}
		if(e.getSource()==su) {
			c=a-b;
			String rs=String.valueOf(c);
			tf3.setText(rs);
		}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CalculatorDemo();
	}

}
