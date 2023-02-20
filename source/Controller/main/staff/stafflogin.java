package Controller.main.staff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.index;
import Dao.staff.implstaff;
import Model.staff;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
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

public class stafflogin extends JFrame {

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
					stafflogin frame = new stafflogin();
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
	public stafflogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("狡兔N窟企業員工登入");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(187, 10, 511, 95);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("員工帳號");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(165, 128, 139, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("員工密碼");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(165, 271, 139, 52);
		contentPane.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setFont(new Font("新細明體", Font.BOLD, 20));
		username.setBounds(275, 128, 216, 52);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(275, 271, 216, 52);
		contentPane.add(password);
		
		JButton login = new JButton("登入");
		login.setFont(new Font("新細明體", Font.BOLD, 33));
		login.setBounds(519, 194, 111, 62);
		contentPane.add(login);
		JLabel sadd = new JLabel("無法登入?新來的還沒填資料點這裡!");
		
		sadd.setForeground(new Color(0, 64, 0));
		sadd.setHorizontalAlignment(SwingConstants.CENTER);
		sadd.setFont(new Font("新細明體", Font.BOLD, 20));
		sadd.setBounds(187, 354, 345, 81);
		contentPane.add(sadd);
		JButton returnindex = new JButton("回首頁");
		
			
		returnindex.setFont(new Font("新細明體", Font.BOLD, 30));
		returnindex.setBounds(623, 543, 204, 72);
		contentPane.add(returnindex);
		
		JLabel lblNewLabel_3 = new JLabel("忘記密碼請找老闆自首");
		lblNewLabel_3.setForeground(new Color(128, 0, 0));
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(415, 445, 241, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel time = new JLabel("");
		time.setFont(new Font("新細明體", Font.BOLD, 16));
		time.setBounds(10, 614, 242, 37);
		contentPane.add(time);
		//時間設置
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
		
		//員工註冊
		sadd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				staffadd s1=new staffadd();
				s1.setVisible(true);
				dispose();
			}
		});
		//回首頁
		returnindex.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			index ix=new index();
			ix.setVisible(true);
			dispose();
		}
	});
		//員工登入
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.帳號密碼 getText()
				 * 2.queryUser(帳號,密碼):staff
				 * 3.!=unll->員工管理選單
				 * 4.null->出現登入錯誤訊息框
				 */
				String Username=username.getText();
				String Password=password.getText();
				staff s= new implstaff().queryStaff(Username,Password);
				if(s!=null) 
				{	try {
					FileOutputStream fos=new FileOutputStream("slcookie.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(s);
					staffbkma sbm=new staffbkma();
					sbm.setVisible(true);
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
	}

}
