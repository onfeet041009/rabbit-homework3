package Controller.main.member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Dao.member.implmember;
import Model.member;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class memberforget extends JFrame {

	private JPanel contentPane;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberforget frame = new memberforget();
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
	public memberforget() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 700, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 197, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("~可愛兔兔買到兔~忘記密碼");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 10, 655, 95);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("請輸入帳號");
		lblNewLabel_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(114, 115, 148, 31);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setFont(new Font("新細明體", Font.BOLD, 18));
		username.setForeground(new Color(0, 0, 0));
		username.setBounds(114, 156, 233, 42);
		contentPane.add(username);
		username.setColumns(10);
		
		JButton check = new JButton("確認");
		check.setFont(new Font("新細明體", Font.BOLD, 25));
		check.setBounds(389, 154, 113, 42);
		contentPane.add(check);
		
		JButton returnml = new JButton("回登入頁");
		returnml.setFont(new Font("新細明體", Font.BOLD, 25));
		returnml.setBounds(522, 205, 143, 46);
		contentPane.add(returnml);
		
		returnml.addMouseListener(new MouseAdapter() {
			@Override//回登入頁
			public void mouseClicked(MouseEvent e) {
				memberlogin ml=new memberlogin();
				ml.setVisible(true);
				dispose();
			}
		});
		
		check.addMouseListener(new MouseAdapter() {
			@Override//檢查該帳號是否註冊(?)
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				if(new implmember().queryUser(Username)) 
				{	
					String A=new implmember().selectUf(Username).getForget();
					
					JOptionPane.showMessageDialog(null,"忘記密碼提示:"+A);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"查無此帳號!");
				}
			}
		});
	}
}
