package Team5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class login implements ActionListener {

	private static final Icon INFORMATION_MESSAGE = null;
	private JFrame f;
	private JTextField t1, t2;
	private JLabel l1, l2;
	
	private JPanel p;
	private JButton b1, b2, b3;
	private MainHome mainhome;
	
	
	public String gett1Text() {
		return t1.getText();
	}

	public String gett2Text() {
		return t2.getText();
		
	}

	public void go()
	{
		

		f = new JFrame();
		t1 = new JTextField(20);
		t2 = new JTextField(20);

		l1 = new JLabel("ID");
		l2 = new JLabel("PASSWD");
		p = new JPanel();
		b1 = new JButton("LOGIN");
		b2 = new JButton("REGISTER");
		b3 = new JButton("LOGOUT");
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b3);
		p.add(b2);

		f.getContentPane().add(p);
		f.setSize(938, 100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void go2() {
		login l1 = new login();
		l1.go();
		
	}

	public static void main(String[] args) {
		login l = new login();
		l.go2();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	
		

		if (arg0.getSource().equals(b1)) 
		{
			User newuser = new User(this.t1.getText(),this.t2.getText());
			UserManagement UM = new UserManagement();
			if(UM.login_user(newuser))
			{
				User currentUser = UM.getCurrentLoginUser();
				mainhome = new MainHome(currentUser);
				mainhome.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Wrong! Again Input ID and PW");
			}


		} else if (arg0.getSource().equals(b2)) {
			if(this.t1.getText().length() != 0 && this.t2.getText().length() != 0)
			{
				
				
				User newuser = new User(this.t1.getText(),this.t2.getText());
				UserManagement manage = new UserManagement();
				manage.newuser_adding(newuser);
				this.t1.setText("");
				this.t2.setText("");
			}


		}

		else if (arg0.getSource().equals(b3)) {
			if(mainhome != null)
			{
				this.t1.setText("");
				this.t2.setText("");
				mainhome.setVisible(false);
				mainhome.dispose();
				mainhome = null;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			}
		}

	}

}
