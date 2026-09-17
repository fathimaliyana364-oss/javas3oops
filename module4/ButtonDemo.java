package module5;
import javax.swing.*;
import java.awt.event.*;
 public class ButtonDemo extends JFrame implements ActionListener {

		JTextField tf;
		JButton b;
		JLabel l;
ButtonDemo()
{

	tf=new JTextField();
	tf.setBounds(50,50,150,20);
	b=new JButton("click here");
	b.setBounds(50,100,95,30);
	l=new JLabel("my label");
	l.setBounds(100,100,200,200);
	b.addActionListener(this);
	add(b);
	add(tf);
	add(l);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
}
	public  void actionPerformed(ActionEvent e) {
		tf.setText("welcome to java");
		l.setText("Hello");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonDemo();

	}

}
