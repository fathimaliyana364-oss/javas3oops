package module5;
import javax.swing.*;
import java.awt.event.*;

public class MouseEx extends JFrame implements MouseListener{
	
		JLabel label;
	public MouseEx()
	{
		label = new JLabel("move or click the mouse");
		add(label);
		addMouseListener(this);
		setSize(300,300);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		label.setText("MOUSE clicked:X="+e.getX()+",Y="+e.getY());
	}
	public void mouseEntered(MouseEvent e) {
		label.setText("MOUSE enterd:X="+e.getX()+",Y="+e.getY());
		
	}
	public void mouseExited(MouseEvent e) {
		label.setText("MOUSE exited:X="+e.getX()+",Y="+e.getY());
		
	}
	public void mousePressed(MouseEvent e) {
	label.setText("MOUSE pressed:X="+e.getX()+",Y="+e.getY());
	
	}
	public void mouseReleased(MouseEvent e) {
		label.setText("MOUSe released:X="+e.getX()+",Y="+e.getY());
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new MouseEx();
	}

}
