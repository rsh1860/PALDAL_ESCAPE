package Team5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Story extends JFrame {

	private JPanel contentPane;
	private Clip clip;
	private boolean Stop = false;
	private File file = new File("afterstory.wav");
	private AudioInputStream audio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story frame = new Story();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Story() {
		
		Story a = this;
		
		 try {
		       
	         audio = AudioSystem.getAudioInputStream(file);
	         clip = AudioSystem.getClip();
	         clip.open(audio);
	         clip.start();
	         Stop = false;
	         clip.start();
	         
	      } catch (Exception e) {
	      }
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 555);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.dispose();
				clip.stop();
		}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Dialog", Font.BOLD, 18));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(580, 0, 105, 37);
		contentPane.add(btnExit);
		
		JButton btnStop = new JButton("STOP");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Stop = true;
		         clip.setMicrosecondPosition(0);
		         clip.stop();
				
			}
		});
		btnStop.setBackground(Color.WHITE);
		btnStop.setForeground(Color.RED);
		btnStop.setFont(new Font("Dialog", Font.BOLD, 18));
		btnStop.setBounds(476, 0, 105, 37);
		contentPane.add(btnStop);
		
		JLabel lblLabelnLabel = new JLabel("<html>             Yetnal yetnal 9 years ago, one student entered ajou university. <br>\r\nWhen the student was going to class, he passed out.<br><br>\r\nSeveral hours later,<br>\r\n  \"What happened!\"<br>\r\nHe knew that he was in a empty class.<br>\r\n  \"Why am I here?\"<br>\r\nHe couldn't go out of the class. So he looked out the window.<br>\r\nIt was 10th floor!!<br>\r\n  \"Open the door, please!\"<br><br>\r\nThen, Teemu come into the class. Student said let him go.<br><br>\r\n  \"HAHAHA, How poor you are! Here is Pal1025!<br>\r\nIf you want to go out, you must master the JAVA!!\"<br><br>\r\nStudent ran to the elevator. Teemu laughed at him.<br><br>\r\n  \"Run away if you can. You cannot free from JAVA!\"<br>\r\n<br>\r\n<br>\r\nMADE BY TEAM5\r\n</html>");
		lblLabelnLabel.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblLabelnLabel.setBounds(67, 23, 559, 459);
		contentPane.add(lblLabelnLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Story.class.getResource("/image/Student.jpg")));
		label.setBounds(440, 287, 306, 242);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Story.class.getResource("/image/Pf_Teemu.jpg")));
		lblNewLabel.setBounds(-21, -11, 283, 242);
		contentPane.add(lblNewLabel);
	}
}
