package Team5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainHome extends JFrame {

	private JPanel contentPane;
	private JButton button_9;
	private JButton button_8;
	private JButton button_7;
	private JButton button_6;
	private JButton button_5;
	private JButton button_4;
	private JButton button_3;
	private JButton button_2;
	private JButton button_1;
	private JButton button;
	private JButton btnTheEnd;
	
	private JButton[] b = new JButton[11];
	
	boolean bh;
	int i1 = 0;
	int[] a = new int[1000];
	
	MainHome mainhome;
	
	User user;
	private JButton button_10;
	private JButton button_11;
	private JButton btnProlog;

	
	public MainHome(User user_input) {
		Professor p=new Professor();
		a=p.store_ans("answer.txt");
		
		this.user = user_input;
		mainhome = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		button = new JButton("FLOOR 10");
		button.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button.setBackground(SystemColor.menu);
		button.setBounds(149, 166, 194, 27);
		panel.add(button);
		
		button_1 = new JButton("FLOOR 1");
		button_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(149, 514, 194, 27);
		panel.add(button_1);
		
		button_2 = new JButton("FLOOR 2");
		button_2.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(149, 474, 194, 27);
		panel.add(button_2);
		
		button_3 = new JButton("FLOOR 3");
		button_3.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(149, 436, 194, 27);
		panel.add(button_3);
		
		button_4 = new JButton("FLOOR 4");
		button_4.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_4.setBackground(SystemColor.menu);
		button_4.setBounds(149, 397, 194, 27);
		panel.add(button_4);
		
		button_5 = new JButton("FLOOR 5");
		button_5.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_5.setBackground(SystemColor.menu);
		button_5.setBounds(149, 358, 194, 27);
		panel.add(button_5);
		
		button_6 = new JButton("FLOOR 6");
		button_6.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_6.setBackground(SystemColor.menu);
		button_6.setBounds(149, 319, 194, 27);
		panel.add(button_6);
		
		button_7 = new JButton("FLOOR 7");
		button_7.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_7.setBackground(SystemColor.menu);
		button_7.setBounds(149, 281, 194, 27);
		panel.add(button_7);
		
		button_8 = new JButton("FLOOR 8");
		button_8.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_8.setBackground(SystemColor.menu);
		button_8.setBounds(149, 243, 194, 27);
		panel.add(button_8);
		
		button_9 = new JButton("FLOOR 9");
		button_9.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
		button_9.setBackground(SystemColor.menu);
		button_9.setBounds(149, 205, 194, 27);
		panel.add(button_9);
		
		btnTheEnd = new JButton("EPILOGUE");

		btnTheEnd.setFont(new Font("±Ã¼­", Font.BOLD, 13));
		btnTheEnd.setBackground(Color.WHITE);
		btnTheEnd.setBounds(191, 657, 105, 52);
		panel.add(btnTheEnd);
		
		
		b[0]=button;
		b[1]=button_9;
		b[2]=button_8;
		b[3]=button_7;
		b[4]=button_6;
		b[5]=button_5;
		b[6]=button_4;
		b[7]=button_3;
		b[8]=button_2;
		b[9]=button_1;
		b[10]=btnTheEnd;
		
		
		for (int i = 1; i < b.length; i++) {
			b[i].setEnabled(false);
		}
		
		for (int count = 0; count <= user.getStage(); count++) {
			try {
				b[count].setEnabled(true);
			} catch (Exception ex) {

			}
		}
		
		button_10 = new JButton("");
		button_10.setIcon(new ImageIcon(MainHome.class.getResource("/image/TA_jr.png")));
		button_10.setFont(new Font("±Ã¼­", Font.BOLD, 16));
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(381, 507, 105, 115);
		panel.add(button_10);
		
		button_11 = new JButton("BONUS GAME");		
		button_11.setFont(new Font("±Ã¼­", Font.BOLD, 16));
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(381, 634, 105, 52);
		panel.add(button_11);
		
		btnProlog = new JButton("PROLOG");
		btnProlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Story s = new Story();
				s.setVisible(true);
			}
		});
		btnProlog.setFont(new Font("±Ã¼­", Font.BOLD, 16));
		btnProlog.setBackground(Color.WHITE);
		btnProlog.setBounds(381, 443, 105, 52);
		panel.add(btnProlog);
		

		JLabel label_1 = new JLabel("\uC544\uC8FC\uB300\uD559\uAD50 \uD314\uB2EC\uAD00");
		label_1.setBackground(Color.WHITE);
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("±Ã¼­", Font.BOLD, 25));
		label_1.setBounds(139, 102, 217, 68);
		panel.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(MainHome.class.getResource("/image/paldal_building.png")));
		label.setBounds(0, 0, 500, 709);
		panel.add(label);
	
		
		define_widget();
	}
	
	public void change_button_enable(int number, boolean key) {
		this.b[i1].setEnabled(key); 
		int user_index = new UserManagement().get_user_index(this.user);
		this.user.setStage(i1);
		new UserManagement().update_user(this.user, user_index);

	} 
	
	public void define_widget()
	{
		button.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 1;
				new Floor(a[0], a[1], a[2], "10.txt", "10-1.txt", "10-2.txt", "10-3.txt", mainhome);

			}
		});
		
		button_9.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 2;
				new Floor(a[3], a[4], a[5], "9.txt", "9-1.txt", "9-2.txt", "9-3.txt", mainhome);

			}
		});
		button_8.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 3;
				new Floor(a[6], a[7], a[8], "8.txt", "8-1.txt", "8-2.txt", "8-3.txt", mainhome);

			}
		});
		button_7.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 4;
				new Floor(a[9], a[10], a[11], "7.txt", "7-1.txt", "7-2.txt", "7-3.txt", mainhome);
		
			}
		});
		button_6.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 5;
				new Floor(a[12], a[13], a[14], "6.txt", "6-1.txt", "6-2.txt", "6-3.txt", mainhome);
			
			}
		});
		button_5.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 6;
				new Floor(a[15], a[16], a[17], "5.txt", "5-1.txt", "5-2.txt", "5-3.txt", mainhome);
			
			}
		});
		button_4.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 7;
				new Floor(a[18], a[19], a[20], "4.txt", "4-1.txt", "4-2.txt", "4-3.txt", mainhome);
			
			}
		});
		button_3.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 8;
				new Floor(a[21], a[22], a[23], "3.txt", "3-1.txt", "3-2.txt", "3-3.txt", mainhome);
			
			}
		});
		button_2.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1 = 9;
				new Floor(a[24], a[25], a[26], "2.txt", "2-1.txt", "2-2.txt", "2-3.txt", mainhome);
			
			}
		});
		button_1.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1=10;
				new Floor(a[27], a[28], a[29], "1.txt", "1-1.txt", "1-2.txt", "1-3.txt", mainhome);
			
			}
		});	
		
		button_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TA a = new TA();
				a.Show_Rule();
				
			}
		});
		button_11.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
//				JOptionPane.showMessageDialog(null, "aaaa");
				new BonusGame(mainhome).go();
			}
		});
		
		btnTheEnd.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i1=11;
				AfterStory a = new AfterStory();
				a.setVisible(true);
			}
		});
	}
}
