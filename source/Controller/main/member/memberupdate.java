package Controller.main.member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Dao.member.implmember;
import Model.member;
import other.implother;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class memberupdate extends JFrame {

	private JPanel contentPane;
	private member m=new member();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;
	private JTextField passwordOld;
	private JTextField password;
	private JTextField forget;
	private JTextField name;
	private JTextField mobile;
	private JTextField address;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberupdate frame = new memberupdate();
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
	public memberupdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 197, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員資料修改");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(294, 10, 296, 73);
		contentPane.add(lblNewLabel);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(0, 128, 0));
		time.setFont(new Font("新細明體", Font.BOLD, 16));
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(10, 610, 283, 41);
		contentPane.add(time);
		
		JLabel lblNewLabel_1_2 = new JLabel("帳號");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(177, 110, 68, 38);
		contentPane.add(lblNewLabel_1_2);
		
		username = new JTextField();
		username.setEditable(false);
		username.setColumns(10);
		username.setBounds(255, 110, 223, 38);
		contentPane.add(username);
		try {
			fis=new FileInputStream("mlcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				member m=(member)ois.readObject();
				username.setText(m.getUsername());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(167, 158, 533, 189);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("原密碼");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 10, 68, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("新密碼");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 70, 68, 38);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("忘記密碼提示");
		lblNewLabel_1_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(10, 140, 125, 38);
		panel.add(lblNewLabel_1_1_1);
		
		passwordOld = new JTextField();
		passwordOld.setBounds(85, 12, 223, 38);
		panel.add(passwordOld);
		passwordOld.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(85, 72, 223, 38);
		panel.add(password);
		
		forget = new JTextField();
		forget.setColumns(10);
		forget.setBounds(141, 142, 213, 38);
		panel.add(forget);
		
		JButton OK1 = new JButton("確認修改");
		OK1.setFont(new Font("新細明體", Font.BOLD, 24));
		OK1.setBounds(352, 65, 160, 47);
		panel.add(OK1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(167, 357, 533, 219);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("姓名");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(21, 29, 49, 35);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("地址");
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(21, 89, 49, 35);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("電話/手機");
		lblNewLabel_2_3.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(10, 157, 90, 35);
		panel_1.add(lblNewLabel_2_3);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(103, 29, 223, 38);
		panel_1.add(name);
		try {
			fis=new FileInputStream("mlcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				member m=(member)ois.readObject();
				name.setText(m.getName());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(103, 157, 223, 38);
		panel_1.add(mobile);
		try {
			fis=new FileInputStream("mlcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				member m=(member)ois.readObject();
				mobile.setText(m.getMobile());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(103, 89, 223, 38);
		panel_1.add(address);
		try {
			fis=new FileInputStream("mlcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				member m=(member)ois.readObject();
				address.setText(m.getAddress());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton OK2 = new JButton("確認修改");
		OK2.setFont(new Font("新細明體", Font.BOLD, 24));
		OK2.setBounds(351, 96, 160, 47);
		panel_1.add(OK2);
		
		JButton returnma = new JButton("回會員專區");
		returnma.setFont(new Font("新細明體", Font.BOLD, 24));
		returnma.setBounds(642, 604, 234, 47);
		contentPane.add(returnma);
		
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
		
		//功能區
		//第二區填寫點按清空
		name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
			}
		});
		address.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				address.setText("");
			}
		});
		mobile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mobile.setText("");
			}
		});
		
		
		OK1.addMouseListener(new MouseAdapter() {
			@Override//密碼跟忘記密碼提示修改
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.判斷舊密碼是否正確
				 * 2.正確-->判斷新密碼是否符合格式
				 * 3.不正確-->跳訊息框"密碼錯誤"
				 * 4.修改忘記密碼
				 */
				String Username=username.getText();
				String PasswordOld=passwordOld.getText();
				String Password=password.getText();
				String Forget=forget.getText();
				member m=new implmember().queryMember(Username, PasswordOld);
				if(m!=null) 
				{
					try {
						FileOutputStream fos = new FileOutputStream("mlcookie.txt");
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(m);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(new implother().Passwordcheck(Password)) 
					{
						if(new implother().Forgetcheck(Forget)) 
						{
							member M=new implmember().selectId(m.getId());
							M.setPassword(Password);
							M.setForget(Forget);
							new implmember().update(M);
							JOptionPane.showMessageDialog(null,"修改成功!");
							memberlogin mm=new memberlogin();
							mm.setVisible(true);
							dispose();
						}
						else 
						{
							JOptionPane.showMessageDialog(null,"忘記密碼提示請輸入至少4個任意字");
						}
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"密碼請輸入4個字以上英文或數字!");
					}
					
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"密碼錯誤,請重新輸入!");
				}	
			}
		});
		OK2.addMouseListener(new MouseAdapter() {
			@Override//基本資料修改
			public void mouseClicked(MouseEvent e) {
				try {
					fis=new FileInputStream("mlcookie.txt");
					ois=new ObjectInputStream(fis);
					String Name=name.getText();
					String Address=address.getText();
					String Mobile=mobile.getText();
					member m=(member)ois.readObject();
					if(new implother().Namecheck(Name)) 
					{
						if(new implother().Addresscheck(Address)) 
						{
							if(new implother().Mobilecheck(Mobile)) 
							{
								member M=new implmember().selectId(m.getId());
								M.setName(Name);
								M.setAddress(Address);
								M.setMobile(Mobile);
								new implmember().update(M);
								JOptionPane.showMessageDialog(null,"修改成功!");
							}
							else 
							{
								JOptionPane.showMessageDialog(null,"電話/手機請輸入10個數字!");
							}
						}
						else 
						{
							JOptionPane.showMessageDialog(null,"地址請輸入3個字以上!");
						}
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"名字請輸入2個字以上,不含數字!");
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		returnma.addMouseListener(new MouseAdapter() {
			@Override//回會員專區
			public void mouseClicked(MouseEvent e) {
				memberMa mm=new memberMa();
				mm.setVisible(true);
				dispose();
			}
		});
		
		
	}
}
