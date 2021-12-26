package Team5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class BonusGame extends JFrame {

   private JPanel contentPane;
   private final ButtonGroup buttonGroup = new ButtonGroup();
   private MainHome m;
   
   public void go(){
      this.setVisible(true);
   }
   /**
    * Create the frame.
    */
   public BonusGame(MainHome m_input) {
	   
	   BonusGame bonus = this;
      m = m_input;
      double randomValue = Math.random();
      int intValue = (int)(randomValue*3)+1;
      int page = (int)(randomValue*2)+3;
      int quenum = (int)(randomValue*2)+1;
      
      String hand;
      
      if(intValue == 1){
         hand = "Rock";
      }
      else if(intValue == 2){
         hand = "Scissor";
      }
      else{
         hand = "Paper";
      }
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 626, 423);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(new CardLayout(0, 0));
      
      JPanel p1 = new JPanel();
      p1.setBackground(new Color(255, 255, 255));
      contentPane.add(p1, "name_608063342298161");
      
      JButton btnOk = new JButton("START");
      btnOk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            CardLayout c = (CardLayout)(contentPane.getLayout());
            c.show(contentPane, "t2");
         }
      });
      
      JLabel lblMiniGame = new JLabel("MINI GAME");
      lblMiniGame.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
      
      JLabel lblYouAreGoing = new JLabel("You are going to play 'ROCK, SCISSOR, PAPER' games with me.");
      
      JLabel lblIfYouWin = new JLabel("If you win, you are going to get easy questions.");
      
      JLabel lblIfYouLose = new JLabel("If you lose, you are going to get hard questions.");
      
      JLabel lblIfYouDraw = new JLabel("If you draw, you are going to get random questions.");
      
      JLabel lblWhenYouWin = new JLabel("When you win, you'll finally escape!");
      
      JLabel lblWhenYouLose = new JLabel("When you lose, you have to solve another questions.");
      
      JLabel lblSoGoodLuck = new JLabel("So, good luck!");
      GroupLayout gl_p1 = new GroupLayout(p1);
      gl_p1.setHorizontalGroup(
         gl_p1.createParallelGroup(Alignment.TRAILING)
            .addGroup(gl_p1.createSequentialGroup()
               .addContainerGap(240, Short.MAX_VALUE)
               .addComponent(lblMiniGame)
               .addGap(252))
            .addGroup(Alignment.LEADING, gl_p1.createSequentialGroup()
               .addGap(240)
               .addComponent(btnOk, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
               .addGap(252))
            .addGroup(Alignment.LEADING, gl_p1.createSequentialGroup()
               .addGap(79)
               .addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
                  .addComponent(lblSoGoodLuck)
                  .addComponent(lblWhenYouLose)
                  .addComponent(lblWhenYouWin)
                  .addComponent(lblIfYouWin)
                  .addComponent(lblYouAreGoing)
                  .addComponent(lblIfYouDraw)
                  .addComponent(lblIfYouLose))
               .addContainerGap(83, Short.MAX_VALUE))
      );
      gl_p1.setVerticalGroup(
         gl_p1.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_p1.createSequentialGroup()
               .addGap(41)
               .addComponent(lblMiniGame)
               .addGap(27)
               .addComponent(lblYouAreGoing)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblIfYouWin)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblIfYouLose)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblIfYouDraw)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblWhenYouWin)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblWhenYouLose)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblSoGoodLuck)
               .addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
               .addComponent(btnOk)
               .addGap(32))
      );
      p1.setLayout(gl_p1);
      
      JPanel p2 = new JPanel();
      p2.setForeground(new Color(255, 255, 255));
      p2.setBackground(new Color(255, 255, 255));
      contentPane.add(p2, "t2");
      
      JLabel lblRound = new JLabel("ROUND 1.");
      lblRound.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
      
      JRadioButton rdbtnRock = new JRadioButton("Rock");
      rdbtnRock.setBackground(new Color(255, 255, 255));
      buttonGroup.add(rdbtnRock);
      
      JRadioButton rdbtnScissor = new JRadioButton("Scissor");
      rdbtnScissor.setBackground(new Color(255, 255, 255));
      buttonGroup.add(rdbtnScissor);
      
      JRadioButton rdbtnPaper = new JRadioButton("Paper");
      rdbtnPaper.setBackground(new Color(255, 255, 255));
      buttonGroup.add(rdbtnPaper);
      
      JButton btnOk_1 = new JButton("\r\n\r\n\r\n\r\nConfirm\r\n");
      btnOk_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            String rand = "t" + page;
            
            if(rdbtnRock.isSelected()){
               if(intValue == 1){
                  //ÀÌ±è
                  JOptionPane.showMessageDialog(null, "Computer: Scissor \n You win! \n You will get easy questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t4");
               }
               else if(intValue == 2){
                  //¹«½ÂºÎ
                  JOptionPane.showMessageDialog(null, "Computer: Scissor \n You draw! \n You will get random questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, rand);
               }
               else{
                  //Áü
                  JOptionPane.showMessageDialog(null, "Computer: Paper \n You lose! \n You will get hard questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t3");
               }
            }
            else if(rdbtnScissor.isSelected()){
               if(intValue == 1){
                  //¹«½ÂºÎ
                  JOptionPane.showMessageDialog(null, "Computer: Scissor \n You draw! \n You will get random questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, rand);
               }
               else if(intValue == 2){
                  //Áü
                  JOptionPane.showMessageDialog(null, "Computer: Rock \n You lose! \n You will get hard questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t3");
               }
               else{
                  //ÀÌ±è
                  JOptionPane.showMessageDialog(null, "Computer: Paper \n You win! \n You will get easy questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t4");
               }
            }
            else if(rdbtnPaper.isSelected()){
               if(intValue == 1){
                  //Áü
                  JOptionPane.showMessageDialog(null, "Computer: Scissor \n You lose! \n You will get hard questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t3");
               }
               else if(intValue == 2){
                  //ÀÌ±è
                  JOptionPane.showMessageDialog(null, "Computer: Rock \n You win! \n You will get easy questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t4");
               }
               else{
                  //¹«½ÂºÎ
                  JOptionPane.showMessageDialog(null, "Computer: Scissor \n You draw! \n You will get random questions!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, rand);
               }

            }
            else{
               JOptionPane.showMessageDialog(null, "Please select!");
            }
            
         }
      });
      btnOk_1.setForeground(new Color(0, 0, 0));
      btnOk_1.setBackground(new Color(204, 204, 204));
      GroupLayout gl_p2 = new GroupLayout(p2);
      gl_p2.setHorizontalGroup(
         gl_p2.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_p2.createSequentialGroup()
               .addGap(51)
               .addComponent(rdbtnRock)
               .addGap(132)
               .addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_p2.createSequentialGroup()
                     .addComponent(rdbtnScissor)
                     .addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                     .addComponent(rdbtnPaper)
                     .addGap(83))
                  .addGroup(gl_p2.createSequentialGroup()
                     .addGroup(gl_p2.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(btnOk_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRound, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(258, Short.MAX_VALUE))))
      );
      gl_p2.setVerticalGroup(
         gl_p2.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_p2.createSequentialGroup()
               .addGap(62)
               .addComponent(lblRound)
               .addGap(144)
               .addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(rdbtnRock)
                  .addComponent(rdbtnScissor)
                  .addComponent(rdbtnPaper))
               .addGap(36)
               .addComponent(btnOk_1)
               .addContainerGap(43, Short.MAX_VALUE))
      );
      p2.setLayout(gl_p2);
      
      JPanel p3 = new JPanel();
      p3.setBackground(new Color(255, 255, 255));
      contentPane.add(p3, "t3");
      ////////////////////////////////////////////////////////////////////////////
      JCheckBox checkBox_1 = new JCheckBox("1");
      checkBox_1.setBackground(new Color(255, 255, 255));
      buttonGroup.add(checkBox_1);
      
      JCheckBox chckbxNo_2 = new JCheckBox("2");
      chckbxNo_2.setBackground(new Color(255, 255, 255));
      buttonGroup.add(chckbxNo_2);
      
      JCheckBox chckboxNo_3 = new JCheckBox("3");
      chckboxNo_3.setBackground(new Color(255, 255, 255));
      buttonGroup.add(chckboxNo_3);
      JButton btnSubmit = new JButton("Submit");
      
      JCheckBox checkBox_4 = new JCheckBox("4");
      checkBox_4.setBackground(Color.WHITE);
      
      ////////////////////////////////////////////////////////////////////////////
      JTextArea textArea = new JTextArea();
      
      if(quenum == 1){
         String a = new Professor().give("9-2.txt");
         textArea.setText(a);
         
         btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(checkBox_1.isSelected()){
                  JOptionPane.showMessageDialog(null, "Correct!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t5");
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE SUCCEED!");
               }
               else{
                  /////////////////Á³À» ¶§!! ±× 1ÃþºÎÅÍ 10Ãþ±îÁö ³ª¿Í¾ßÇÏ´Â°÷
                  JOptionPane.showMessageDialog(null, "Wrong!");
               //   m.dispose();
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE FAIL! LOGIN AGAIN");
               }
            }
         });
      }
      else{
         String b = new Professor().give("8-2.txt");
         textArea.setText(b);
         btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(checkBox_1.isSelected()){
                  JOptionPane.showMessageDialog(null, "Correct!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t5");
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE SUCCEED!");
               }
               else{
                  /////////////////Á³À» ¶§!! ±× 1ÃþºÎÅÍ 10Ãþ±îÁö ³ª¿Í¾ßÇÏ´Â°÷
                  JOptionPane.showMessageDialog(null, "Wrong!");
              //    m.dispose();
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE FAIL! LOGIN AGAIN");
               }
            }
         });
         
      }
      
      GroupLayout gl_p3 = new GroupLayout(p3);
      gl_p3.setHorizontalGroup(
      	gl_p3.createParallelGroup(Alignment.LEADING)
      		.addGroup(Alignment.TRAILING, gl_p3.createSequentialGroup()
      			.addContainerGap(181, Short.MAX_VALUE)
      			.addComponent(checkBox_1)
      			.addGap(78)
      			.addComponent(chckbxNo_2)
      			.addGap(67)
      			.addComponent(chckboxNo_3)
      			.addGap(54)
      			.addComponent(checkBox_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
      			.addGap(74))
      		.addGroup(Alignment.TRAILING, gl_p3.createSequentialGroup()
      			.addContainerGap(299, Short.MAX_VALUE)
      			.addComponent(btnSubmit)
      			.addGap(230))
      		.addGroup(gl_p3.createSequentialGroup()
      			.addGap(32)
      			.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)
      			.addContainerGap(29, Short.MAX_VALUE))
      );
      gl_p3.setVerticalGroup(
      	gl_p3.createParallelGroup(Alignment.LEADING)
      		.addGroup(Alignment.TRAILING, gl_p3.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
      			.addGap(18)
      			.addGroup(gl_p3.createParallelGroup(Alignment.BASELINE)
      				.addComponent(checkBox_4)
      				.addComponent(chckboxNo_3)
      				.addComponent(chckbxNo_2)
      				.addComponent(checkBox_1))
      			.addGap(18)
      			.addComponent(btnSubmit)
      			.addContainerGap())
      );
      p3.setLayout(gl_p3);
      /// ´Ï³Ä´Ï´¢
      JPanel p4 = new JPanel();
      p4.setBackground(new Color(255, 255, 255));
      contentPane.add(p4, "t4");
      
      JCheckBox chckbxNo_1 = new JCheckBox("1");
      chckbxNo_1.setBackground(new Color(255, 255, 255));
      buttonGroup.add(chckbxNo_1);
      
      JCheckBox chckbxNom_2 = new JCheckBox("2");
      chckbxNom_2.setBackground(new Color(255, 255, 255));
      buttonGroup.add(chckbxNom_2);
      
      JCheckBox chckbx3 = new JCheckBox("3");
      chckbx3.setBackground(new Color(255, 255, 255));
      buttonGroup.add(chckbx3);
      
      JCheckBox checkBox4 = new JCheckBox("4");
      checkBox4.setBackground(Color.WHITE);
      
      JButton btnSubmit_1 = new JButton("Submit");
      
      JTextArea textArea_1 = new JTextArea();
      
      if(quenum == 1){
         String a = new Professor().give("7-1.txt");
         textArea.setText(a);
         
         btnSubmit_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxNom_2.isSelected()){
                  JOptionPane.showMessageDialog(null, "Correct!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t5");
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE SUCCEED!");
               }
               else{
                  /////////////////Á³À» ¶§!! ±× 1ÃþºÎÅÍ 10Ãþ±îÁö ³ª¿Í¾ßÇÏ´Â°÷
                  JOptionPane.showMessageDialog(null, "Wrong!");
                 // m.dispose();
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE FAIL! LOGIN AGAIN");
               }
            }
         });
      }
      else{
         String b = new Professor().give("6-2.txt");
         textArea.setText(b);
         btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbx3.isSelected()){
                  JOptionPane.showMessageDialog(null, "Correct!");
                  CardLayout c=(CardLayout)(contentPane.getLayout());
                  c.show(contentPane, "t5");
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE SUCCEED!");
               }
               else{
                  /////////////////Á³À» ¶§!! ±× 1ÃþºÎÅÍ 10Ãþ±îÁö ³ª¿Í¾ßÇÏ´Â°÷
                  JOptionPane.showMessageDialog(null, "Wrong!");
               //   m.dispose();
                  dispose();
                  JOptionPane.showMessageDialog(null, "ESCAPE FAIL! LOGIN AGAIN");
               }
            }
         });
         
      }
      

      

      GroupLayout gl_p4 = new GroupLayout(p4);
      gl_p4.setHorizontalGroup(
      	gl_p4.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_p4.createSequentialGroup()
      			.addGap(264)
      			.addComponent(btnSubmit_1)
      			.addContainerGap(29, Short.MAX_VALUE))
      		.addGroup(Alignment.TRAILING, gl_p4.createSequentialGroup()
      			.addContainerGap(146, Short.MAX_VALUE)
      			.addComponent(chckbxNo_1)
      			.addGap(72)
      			.addComponent(chckbxNom_2)
      			.addGap(93)
      			.addComponent(chckbx3)
      			.addGap(59)
      			.addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
      			.addGap(20))
      		.addGroup(gl_p4.createSequentialGroup()
      			.addGap(32)
      			.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)
      			.addContainerGap(29, Short.MAX_VALUE))
      );
      gl_p4.setVerticalGroup(
      	gl_p4.createParallelGroup(Alignment.LEADING)
      		.addGroup(Alignment.TRAILING, gl_p4.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
      			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
      			.addGroup(gl_p4.createParallelGroup(Alignment.BASELINE)
      				.addComponent(checkBox4)
      				.addComponent(chckbx3)
      				.addComponent(chckbxNom_2)
      				.addComponent(chckbxNo_1))
      			.addGap(21)
      			.addComponent(btnSubmit_1)
      			.addGap(23))
      );
      p4.setLayout(gl_p4);
      
      JPanel p5 = new JPanel();
      contentPane.add(p5, "t5");
      
      JLabel label_1 = new JLabel("");
      label_1.setIcon(new ImageIcon(BonusGame.class.getResource("/image/Pf_Teemu.jpg")));
      
      JButton btnCongrats = new JButton("Congrats!");
      btnCongrats.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		bonus.dispose();
      	}
      });
      GroupLayout gl_p5 = new GroupLayout(p5);
      gl_p5.setHorizontalGroup(
      	gl_p5.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_p5.createSequentialGroup()
      			.addGroup(gl_p5.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_p5.createSequentialGroup()
      					.addGap(170)
      					.addComponent(label_1))
      				.addGroup(gl_p5.createSequentialGroup()
      					.addGap(246)
      					.addComponent(btnCongrats)))
      			.addContainerGap(174, Short.MAX_VALUE))
      );
      gl_p5.setVerticalGroup(
      	gl_p5.createParallelGroup(Alignment.LEADING)
      		.addGroup(Alignment.TRAILING, gl_p5.createSequentialGroup()
      			.addContainerGap(51, Short.MAX_VALUE)
      			.addComponent(btnCongrats)
      			.addGap(34)
      			.addComponent(label_1)
      			.addContainerGap())
      );
      p5.setLayout(gl_p5);
   }
}