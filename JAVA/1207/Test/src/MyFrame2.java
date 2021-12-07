import java.awt.FlowLayout;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;

public class MyFrame2 extends JFrame{
	
	
	JButton button = null;
	JButton btnGreen =null;
	JButton btnBlue =null;
	JButton btnMagenta =null;
	JButton btnAnonymous = null;
	
	public MyFrame2(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new FlowLayout());
		button = new JButton("누르세요");
		btnGreen = new JButton("green");
		btnBlue = new JButton("Blue");
		btnMagenta = new JButton("magen");
		btnAnonymous = new JButton("Anonymous");
		
		this.add(button);
		this.add(btnBlue);
		this.add(btnGreen);
		this.add(btnMagenta);
		this.add(btnAnonymous);
		
		
		MyEventhandler handler = new MyEventhandler();
		button.addActionListener(handler);
		btnGreen.addActionListener(handler);
		btnBlue.addActionListener(handler);
		btnMagenta.addActionListener(handler);
		
		btnAnonymous.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "익명의 클래스");
			}
			
		});
		this.setVisible(true);
	}

	
	class MyEventhandler implements ActionListener{
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
	
	
	
}
