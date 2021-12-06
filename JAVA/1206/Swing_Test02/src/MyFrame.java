import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener{
	
	
	JButton button = null;
	
	public MyFrame(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new FlowLayout());
		button = new JButton("누르세요");
		this.add(button);
		button.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JButton temp = (JButton)button;
			temp.setText("asdasd");
		}
	}
	
}
