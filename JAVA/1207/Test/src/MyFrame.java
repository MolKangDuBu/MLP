import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener{
	
	
	JButton button = null;
	JButton btnGreen =null;
	JButton btnBlue =null;
	JButton btnMagenta =null;
	
	public MyFrame(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new FlowLayout());
		button = new JButton("누르세요");
		btnGreen = new JButton("green");
		btnBlue = new JButton("Blue");
		btnMagenta = new JButton("magen");
		
		this.add(button);
		this.add(btnBlue);
		this.add(btnGreen);
		this.add(btnMagenta);
		
		
		button.addActionListener(this);
		btnGreen.addActionListener(this);
		btnBlue.addActionListener(this);
		btnMagenta.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = "";
		if(e.getSource()==button) {
			msg = "btnRed";
		}else if(e.getSource() == btnBlue) {
			msg = "btnBlue";
		}else if(e.getSource() == btnGreen) {
			msg = "btnGreen";
		}else if(e.getSource() == btnMagenta) {
			msg = "btnMagenta";
		}
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, msg);
	}
	
}
