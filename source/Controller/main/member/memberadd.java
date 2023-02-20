package Controller.main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.index;
import Dao.member.implmember;
import Model.member;
import other.implother;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class memberadd extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField birthday;
	private JTextField mobile;
	private JTextField forget;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberadd frame = new memberadd();
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
	public memberadd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 197, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("~可愛兔兔買到兔~會員註冊");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(167, 31, 590, 73);
		contentPane.add(lblNewLabel);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("會員姓名");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setBounds(167, 114, 141, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("會員帳號");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_1.setBounds(167, 167, 141, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("會員密碼");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_2.setBounds(167, 223,141, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("地址");
		lblNewLabel_1_3.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(167, 279, 141, 37);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("會員生日");
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_4.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_4.setBounds(167, 334, 141, 37);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("會員電話/手機");
		lblNewLabel_1_5.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_5.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(167, 388, 141, 37);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("忘記密碼提示");
		lblNewLabel_1_6.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_6.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_6.setBounds(167, 443, 141, 37);
		contentPane.add(lblNewLabel_1_6);
		
		name = new JTextField();
		name.setText("範例:韭菜:3(假的)");
		name.setFont(new Font("新細明體", Font.PLAIN, 16));
		name.setBounds(305, 114, 242, 37);
		contentPane.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setText("範例:7pupu");
		username.setFont(new Font("新細明體", Font.PLAIN, 16));
		username.setColumns(10);
		username.setBounds(305, 169, 242, 37);
		contentPane.add(username);
		
		password = new JTextField();
		password.setText("範例:Ni4849chia");
		password.setFont(new Font("新細明體", Font.PLAIN, 16));
		password.setColumns(10);
		password.setBounds(305, 224, 242, 37);
		contentPane.add(password);
		
		address = new JTextField();
		address.setText("範例:韭菜長土裡呀-假的才住屋裡");
		address.setFont(new Font("新細明體", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(305, 279, 242, 37);
		contentPane.add(address);
		
		birthday = new JTextField();
		birthday.setText("範例:0000/00/00");
		birthday.setFont(new Font("新細明體", Font.PLAIN, 16));
		birthday.setColumns(10);
		birthday.setBounds(305, 335, 242, 37);
		contentPane.add(birthday);
		
		mobile = new JTextField();
		mobile.setText("範例:0800092000");
		mobile.setFont(new Font("新細明體", Font.PLAIN, 16));
		mobile.setColumns(10);
		mobile.setBounds(305, 389, 242, 37);
		contentPane.add(mobile);
		
		forget = new JTextField();
		forget.setText("範例:你是不是韭菜");
		forget.setFont(new Font("新細明體", Font.PLAIN, 16));
		forget.setColumns(10);
		forget.setBounds(305, 444,242, 37);
		contentPane.add(forget);
		
		JButton madd = new JButton("確認送出");
		madd.setFont(new Font("新細明體", Font.BOLD, 33));
		madd.setBounds(305, 593, 252, 58);
		contentPane.add(madd);
		
		JButton returnin = new JButton("回首頁");
		returnin.setFont(new Font("新細明體", Font.BOLD, 33));
		returnin.setBounds(719, 591, 155, 60);
		contentPane.add(returnin);
		//功能區
		//清空各欄範例
		name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
			}
		});
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				username.setText("");
			}
		});
		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				password.setText("");
			}
		});
		address.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				address.setText("");
			}
		});
		birthday.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				birthday.setText("");
			}
		});
		mobile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mobile.setText("");
			}
		});
		forget.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				forget.setText("");
			}
		});
		
		//回首頁
		returnin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				index ind=new index();
				ind.setVisible(true);
				dispose();
			}
		});
		//新增會員
		madd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/* 
				* 1.username->getText()
				 * 2.帳號判斷->qeuryusername():boolean
				 * 3.true->重複->跳出重複訊息
				 * 4.false->檢查其他資料欄是否填寫正確
				 * 5.false->跳出錯誤訊息
				 * 6.true->跳出成功訊息並回首頁
				 */
				String Username=username.getText();
				String Name=name.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Birthday=birthday.getText();
				String Mobile=mobile.getText();
				String Forget=forget.getText();
				if(new implmember().queryUser(Username)==false&&new implother().Usernamecheck(Username)==true) 
				{
					if(new implother().Namecheck(Name)==true) 
					{
						if(new implother().Passwordcheck(Password)==true) 
						{
							if(new implother().Addresscheck(Address)==true) 
							{
								if(new implother().Birthdaycheck(Birthday)==true) 
								{
									if(new implother().Mobilecheck(Mobile)==true) 
									{
										if(new implother().Forgetcheck(Forget)==true) 
										{
											member m=new member(Name,Username,Password,Address,Birthday,Mobile,Forget);
											new implmember().add(m);
											JOptionPane.showMessageDialog(null,"註冊成功!");
											memberlogin ml=new memberlogin();
											ml.setVisible(true);
											dispose();
										}
										else 
										{
											JOptionPane.showMessageDialog(null,"忘記密碼提示請輸入至少4個任意字");
										}
									}
									else 
									{
										JOptionPane.showMessageDialog(null,"電話/手機請輸入10個數字!");
									}
								}
								else 
								{
									JOptionPane.showMessageDialog(null,"生日請輸入yyyy/MM/dd 如:1970/01/01!");
								}
							}
							else 
							{
								JOptionPane.showMessageDialog(null,"地址請輸入3個字以上!");
							}
						} 
						else
						{
							JOptionPane.showMessageDialog(null,"密碼請輸入4個字以上英文或數字!");
						}
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"名字請輸入2個字以上,不含數字!");
					}
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"帳號重複!請重新輸入欲註冊的帳號!"+
																					"\n或"+
																					"\n帳號請輸入至少4個英文或數字!");
				}
				
			}
		});
		
		
	}

}
