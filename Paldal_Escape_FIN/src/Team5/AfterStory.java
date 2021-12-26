package Team5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class AfterStory extends JFrame {

	private JPanel contentPane;
	private Clip clip;
	private boolean Stop = false;
	private File file = new File("beforestory.wav");
	private AudioInputStream audio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterStory frame = new AfterStory();
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
	public AfterStory() {
		
		AfterStory a = this;
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
		setBounds(100, 100, 551, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, "name_6802190312004");
		
		JLabel label = new JLabel("");
		label.setBounds(-3, 364, 190, 289);
		label.setIcon(new ImageIcon(AfterStory.class.getResource("/After/After_6.jpg")));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(299, 280, 170, 240);
		label_1.setIcon(new ImageIcon(AfterStory.class.getResource("/After/After_5.jpg")));
		panel.setLayout(null);
		panel.add(label);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AfterStory.class.getResource("/After/After_4.jpg")));
		label_2.setBounds(319, 0, 204, 240);
		panel.add(label_2);
		
		JLabel lblNewLabel = new JLabel("<html>    Student finally escape from Padal-hall.<br>\r\n\"I'm free.\"<br>\r\nStudent look around other halls, but no subject attract his interest.<br>\r\n\"Nothing is better than computer science.\"<br>\r\nHe back to the Paldal-hall 1012.<br>\r\nKNOCK KNOCK!<br>\r\n\"come in.\"<br>\r\nStudent go into the room, Teemu smiled.<br>\r\n\"WELCOME, JUNGRYUL!\" </html>");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblNewLabel.setBounds(14, 28, 327, 434);
		panel.add(lblNewLabel);
		
		JButton btnDispose = new JButton("EXIT");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					a.dispose();
					clip.stop();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnDispose.setBackground(Color.WHITE);
		btnDispose.setForeground(Color.RED);
		btnDispose.setFont(new Font("±¼¸²", Font.BOLD, 17));
		btnDispose.setBounds(362, 601, 147, 52);
		panel.add(btnDispose);
		
		JButton btnStop = new JButton("STOP");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stop = true;
		         clip.setMicrosecondPosition(0);
		         clip.stop();
			}
		});
		btnStop.setForeground(Color.RED);
		btnStop.setFont(new Font("±¼¸²", Font.BOLD, 17));
		btnStop.setBackground(Color.WHITE);
		btnStop.setBounds(201, 601, 147, 52);
		panel.add(btnStop);
		
		
	}

}
