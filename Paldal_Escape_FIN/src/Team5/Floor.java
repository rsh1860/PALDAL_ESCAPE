package Team5;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

public class Floor extends JPanel implements ActionListener, ItemListener {
	private JButton b1, b2;
	private JPanel btnPanel;
	private JPanel cardPanel;
	private JPanel jp1, jp2, jp3, jp4;
	private JTextArea l1, l2, l3, l4;
	private JCheckBox[] c;
	int a1,a2,a3;
	int i = 1;

	private MainHome mother;
	
	JFrame f;

	public Floor(int ans1,int ans2,int ans3,String con, String p1, String p2, String p3,MainHome mother_input) {
		
		a1=ans1; a2=ans2; a3=ans3;
		this.mother = mother_input;
		
		c=new JCheckBox[12];
		
		
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle(i + "");

		for(int i=0;i<ans1;i++){
			c[i]=new JCheckBox((i+1)+"");
		}
		c[ans1] = new JCheckBox((ans1+1)+"");
		c[ans1].addItemListener(this);
		for(int i=ans1+1;i<4;i++){
			c[i]=new JCheckBox((i+1)+"");
		}
		
		for(int i=0+4;i<ans2+4;i++){
			c[i]=new JCheckBox((i+1-4)+"");
		}
		c[ans2+4] = new JCheckBox((ans2+1)+"");
		c[ans2+4].addItemListener(this);
		for(int i=ans2+4+1;i<8;i++){
			c[i]=new JCheckBox((i+1-4)+"");
		}
		
		for(int i=0+8;i<ans3+8;i++){
			c[i]=new JCheckBox((i+1-8)+"");
		}
		c[ans3+8] = new JCheckBox((ans3+1)+"");
		c[ans3+8].addItemListener(this);
		for(int i=ans3+8+1;i<12;i++){
			c[i]=new JCheckBox((i+1-8)+"");
		}
		
		
		for(int i=0;i<12;i++){
			c[i].addItemListener(this);
		}
		

		
		
		cardPanel = new JPanel();
		cardPanel.setLayout(new CardLayout());
////////////////////////////////////////////////////////////////////////////////////////////
		l1 = new JTextArea(new Professor().give(con));
		l1.setSize(500, 500);
	
		JScrollPane sc1=new JScrollPane();
		sc1.setViewportView(l1);
		sc1.setVerticalScrollBarPolicy( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sc1.setSize(500, 500);
		
		l2 = new JTextArea(new Professor().give(p1));
		l3 = new JTextArea(new Professor().give(p2));
		l4 = new JTextArea(new Professor().give(p3));

		
		jp1 = new JPanel();
		jp1.setLayout(new BorderLayout(0, 0));
		jp1.add(sc1,BorderLayout.CENTER);
		
		jp2 = new JPanel();
		jp2.add(l2);
		jp3 = new JPanel();
		jp3.add(l3);
		jp4 = new JPanel();
		jp4.add(l4);
		
		jp2.add(c[0]); jp2.add(c[1]); jp2.add(c[2]); jp2.add(c[3]);
	
		jp3.add(c[4]); jp3.add(c[5]); jp3.add(c[6]); jp3.add(c[7]);

		jp4.add(c[8]); jp4.add(c[9]); jp4.add(c[10]); jp4.add(c[11]);

		cardPanel.add(jp1);
		cardPanel.add(jp2);
		cardPanel.add(jp3);
		cardPanel.add(jp4);
		
		b2 = new JButton("Next");
		b2.addActionListener(this);
		btnPanel = new JPanel();
		btnPanel.add(b2);

		f.getContentPane().add(cardPanel, BorderLayout.CENTER);
		f.getContentPane().add(btnPanel, BorderLayout.SOUTH);

		f.setSize(482, 482);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		CardLayout cl = (CardLayout) (cardPanel.getLayout());

		if (e.getSource().equals(b1)) {

			cl.previous(cardPanel);
		}
		if (e.getSource().equals(b2)) {
			cl.next(cardPanel);

		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	
		if (c[0].isSelected()) {
		
		if(a1==1)	
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);
}
		else{
			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
			b2.setEnabled(false);
		f.dispose();}

		}

	if (c[1].isSelected()) {
		if(a1==2)	
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
	
			b2.setEnabled(false);
		f.dispose();}
		
		
	
	}
	if (c[2].isSelected()) {
		if(a1==3)	
		{
			JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
	
			b2.setEnabled(false);
		f.dispose();}
	}
	if (c[3].isSelected()) {
		if(a1==4)	
		{ 
			JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
	
			b2.setEnabled(false);
		f.dispose();}
	}
	if (c[4].isSelected()) {
		if(a2==1)	
		{ 
			JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
	
			b2.setEnabled(false);
		f.dispose();}
	 

	}
	if (c[5].isSelected()) {
		if(a2==2)	
			
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{				 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);

			b2.setEnabled(false);
		f.dispose();}
	}
	if (c[6].isSelected()) {
		if(a2==3)	
			
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);

			b2.setEnabled(false);
		f.dispose();}
	}
	if (c[7].isSelected()) {
		if(a2==4)	
		{JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);

			b2.setEnabled(false);
		f.dispose();}
	}
	if (c[8].isSelected()) {
		if(a3==1)	
		{JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);
		this.mother.change_button_enable(3, true);
		f.dispose();}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
	
			b2.setEnabled(false);
		f.dispose();}
		
	}
	if (c[9].isSelected()) {
		if(a3==2)	
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);
		this.mother.change_button_enable(3, true);
		f.dispose();
		}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);

			b2.setEnabled(false);
		f.dispose();}
		
	}
	if (c[10].isSelected()) {
		if(a3==3)	
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);
		this.mother.change_button_enable(3, true);
		f.dispose();
		}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);

			b2.setEnabled(false);
		f.dispose();}
		
	}
	if (c[11].isSelected()) {
		if(a3==4)	
		{ JOptionPane.showMessageDialog(null,"CORRECT","",JOptionPane.INFORMATION_MESSAGE);
		this.mother.change_button_enable(3, true);
		f.dispose();
		}
		else{			 JOptionPane.showMessageDialog(null,"WRONG","",JOptionPane.INFORMATION_MESSAGE);
	
			b2.setEnabled(false);
		f.dispose();}
		
		
		
	}

	}
	

}
