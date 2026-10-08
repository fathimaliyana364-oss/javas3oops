package eventflow;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginCheck extends JFrame implements ActionListener {
	JTextField tf1;
	JButton log,re,create;
	JPasswordField pf1;
	JLabel l1,l2,l3;
	LoginCheck()
	{
		JFrame f=new JFrame("EVENT FLOW");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,2));
		JLabel l1=new JLabel("username/email");
		tf1=new JTextField();
		JLabel l2=new JLabel("password");
		pf1=new JPasswordField();
		JLabel l3=new JLabel();
		log=new JButton("Login");
		re=new JButton("clear");
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(pf1);
		p.add(log);
		p.add(re);
		p.add(l3);
		log.addActionListener(this);
		re.addActionListener(this);
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
{
	String S1=tf1.getText();
	String S2=new String(pf1.getPassword());
	if(e.getSource()==log)
	{
		if(S1.equals(Data.username)&&S2.equals(Data.password))
		{
			l3.setText("welcome"+S1);
		}
			else
			{
				l3.setText("invalid username or password");
				
		}
	}else
	{
		tf1.setText("");
		pf1.setText("");
		l3.setText("");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginCheck();

	}

}
