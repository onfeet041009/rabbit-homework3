package Controller.main.staff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.staff.implstaff;
import Model.staff;
import other.implother;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;

public class staffadd extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField birthday;
	private JTextField mobile;
	private JTextField tod;
	//設定工作單位選項
	String[] j=new String[] {"旅館","老師","餐廳","老闆"};
	private JTextField JOB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staffadd frame = new staffadd();
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
	public staffadd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel time=new JLabel();
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
			
		JLabel lblNewLabel = new JLabel("狡兔N窟企業員工資料表");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(167, 31, 590, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("員工姓名");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(167, 114, 141, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("員工帳號");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(167, 167, 141, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("員工密碼");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(167, 223, 141, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("工作單位");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(167, 279, 141, 37);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("地址");
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(167, 334, 141, 37);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("員工生日");
		lblNewLabel_1_5.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(167, 388, 141, 37);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("員工電話/手機");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_6.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_6.setBounds(167, 443, 141, 37);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2 = new JLabel("到職日(填表日)");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(167, 498, 141, 37);
		contentPane.add(lblNewLabel_2);
		
		name = new JTextField();		
		name.setText("範例:小兔砸:3");
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
		password.setText("範例:Ni484Nb666");
		password.setFont(new Font("新細明體", Font.PLAIN, 16));
		password.setColumns(10);
		password.setBounds(305, 224, 242, 37);
		contentPane.add(password);
		
		address = new JTextField();
		address.setText("範例:北漂族沒有家QAQ~~~");
		address.setFont(new Font("新細明體", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(305, 335, 242, 37);
		contentPane.add(address);
		
		birthday = new JTextField();
		birthday.setText("範例:0000/00/00");
		birthday.setFont(new Font("新細明體", Font.PLAIN, 16));
		birthday.setColumns(10);
		birthday.setBounds(305, 389, 242, 37);
		contentPane.add(birthday);
		
		mobile = new JTextField();
		mobile.setText("範例:0800092000");
		mobile.setFont(new Font("新細明體", Font.PLAIN, 16));
		mobile.setColumns(10);
		mobile.setBounds(305, 444, 242, 37);
		contentPane.add(mobile);
		
		tod = new JTextField();
		tod.setText("範例:0000/00/00");
		tod.setFont(new Font("新細明體", Font.PLAIN, 16));
		tod.setColumns(10);
		tod.setBounds(305, 499, 242, 37);
		contentPane.add(tod);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 281, 67, 30);
		contentPane.add(scrollPane);
		
		JOB = new JTextField();
		JOB.setEditable(false);
		JOB.setHorizontalAlignment(SwingConstants.CENTER);
		JOB.setFont(new Font("新細明體", Font.BOLD, 19));
		JOB.setBounds(382, 279, 60, 37);
		contentPane.add(JOB);
		JOB.setColumns(10);
		
		JList job = new JList(j);
		job.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1) 
				{
					String Jo=(String)job.getSelectedValue();
					JOB.setText(Jo);
					
				}
			}
		});
		scrollPane.setViewportView(job);
		job.setFont(new Font("新細明體", Font.BOLD, 19));
		
		JButton returnsl = new JButton("回登入頁");
			returnsl.setFont(new Font("新細明體", Font.BOLD, 33));
		returnsl.setBounds(677, 591, 197, 60);
		contentPane.add(returnsl);
		
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
		tod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tod.setText("");
			}
		});
		//新增員工資料
		JButton sadd = new JButton("確認送出");
		sadd.addMouseListener(new MouseAdapter() {
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
				String Job=JOB.getText();
				String Address=address.getText();
				String Birthday=birthday.getText();
				String Mobile=mobile.getText();
				String Tod=tod.getText();
				if(new implstaff().queryUser(Username)==false && new implother().Usernamecheck(Username)==true) 
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
										if(new implother().Todcheck(Tod)==true) 
										{
											if(new implother().Jobcheck(Job)==true) 
											{
												staff s=new staff(Name,Username,Password,Job,Address,Birthday,Mobile,Tod);
												new implstaff().add(s);
												JOptionPane.showMessageDialog(null,"填表完成!");
												stafflogin sl=new stafflogin();
												sl.setVisible(true);
												dispose();
											}
											else
											{
												JOptionPane.showMessageDialog(null,"請選擇工作單位!");
											}
										}
										else 
										{
											JOptionPane.showMessageDialog(null,"到職日(填表日)請輸入yyyy/MM/dd 如:1970/01/01!");
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
		//回登入頁
		returnsl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 stafflogin sl=new stafflogin();
				sl.setVisible(true);
				dispose();
			}
		});
		sadd.setFont(new Font("新細明體", Font.BOLD, 33));
		sadd.setBounds(305, 593, 252, 58);
		contentPane.add(sadd);			
	}
}
