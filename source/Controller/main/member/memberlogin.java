package Controller.main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.index;
import Dao.member.implmember;
import Model.member;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class memberlogin extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberlogin frame = new memberlogin();
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
	public memberlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 197, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("~可愛兔兔買到兔~會員登入");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(117, 10, 655, 95);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("會員帳號");
		lblNewLabel_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(164, 166, 118, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("會員密碼");
		lblNewLabel_1_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(164, 283, 118, 50);
		contentPane.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setBounds(269, 166, 256, 40);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(269, 283, 256, 40);
		contentPane.add(password);
		
		JLabel forget = new JLabel("忘記密碼?");
		forget.setForeground(new Color(0, 128, 192));
		forget.setFont(new Font("新細明體", Font.BOLD, 18));
		forget.setBounds(164, 367, 96, 40);
		contentPane.add(forget);
	
		JLabel madd = new JLabel("會員享優惠!還沒註冊?快來加入會員吧!");
		madd.setForeground(new Color(255, 128, 64));
		madd.setFont(new Font("新細明體", Font.BOLD, 18));
		madd.setBounds(269, 362, 327, 50);
		contentPane.add(madd);
		
		JButton mlogin = new JButton("登入");	
		mlogin.setFont(new Font("新細明體", Font.BOLD, 33));
		mlogin.setBounds(544, 202, 111, 62);
		contentPane.add(mlogin);
		
		JButton returnin = new JButton("回首頁");
		returnin.setFont(new Font("新細明體", Font.BOLD, 33));
		returnin.setBounds(673, 559, 142, 62);
		contentPane.add(returnin);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(0, 128, 0));
		time.setFont(new Font("新細明體", Font.BOLD, 16));
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(10, 610, 283, 41);
		contentPane.add(time);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				Calendar calendar = Calendar.getInstance();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int day = calendar.get(Calendar.DATE);
				int hour = calendar.get(Calendar.HOUR_OF_DAY);
				int minute = calendar.get(Calendar.MINUTE);
				int second = calendar.get(Calendar.SECOND);
				time.setText("西元"+year + "年" + String.format("%02d", month) + "月" + String.format("%02d", day) + "日 "
						+ String.format("%02d", hour) + ":" + minute + ":" + second);				
			}
		}, 0, 1000);
		
		forget.addMouseListener(new MouseAdapter() {//忘記密碼
			@Override
			public void mouseClicked(MouseEvent e) {
				memberforget mf=new memberforget();
				mf.setVisible(true);
				dispose();
			}
		});		
		madd.addMouseListener(new MouseAdapter() {//新增會員
			@Override
			public void mouseClicked(MouseEvent e) {
				memberadd ma=new memberadd();
				ma.setVisible(true);
				dispose();
			}
		});		
		mlogin.addMouseListener(new MouseAdapter() {//會員登入
		@Override
		public void mouseClicked(MouseEvent e) {
			String Username=username.getText();
			String Password=password.getText();
			member m=new implmember().queryMember(Username, Password);
			if(m!=null) 
			{
				try {
					FileOutputStream fos = new FileOutputStream("mlcookie.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(m);
					memberMa ma=new memberMa();
					ma.setVisible(true);
					dispose();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"帳號或密碼錯誤,請重新輸入!");
			}
		}
	});
		returnin.addMouseListener(new MouseAdapter() {//回首頁
			@Override
			public void mouseClicked(MouseEvent e) {
				index in=new index();
				in.setVisible(true);
				dispose();
			}
		});
	}
}
