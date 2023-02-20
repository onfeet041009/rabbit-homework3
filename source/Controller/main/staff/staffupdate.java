package Controller.main.staff;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Dao.staff.implstaff;
import Model.staff;
import other.implother;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class staffupdate extends JFrame {

	private JPanel contentPane;
	private staff s=new staff();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;
	private JTextField job;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staffupdate frame = new staffupdate();
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
	public staffupdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("員工資料修改");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(294, 10, 296, 73);
		contentPane.add(lblNewLabel);
		
		JLabel on = new JLabel("");
		on.setHorizontalAlignment(SwingConstants.CENTER);
		on.setFont(new Font("新細明體", Font.BOLD, 16));
		on.setBounds(613, 22, 249, 37);
		contentPane.add(on);
		try {
			fis=new FileInputStream("slcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				staff s=(staff)ois.readObject();
				on.setText("員工:"+s.getName());
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
		
		JLabel time = new JLabel("New label");
		time.setFont(new Font("新細明體", Font.BOLD, 16));
		time.setBounds(25, 22, 242, 37);
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
		
		JLabel lblNewLabel1 = new JLabel("帳號");
		lblNewLabel1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel1.setBounds(272, 83, 68, 38);
		contentPane.add(lblNewLabel1);
		
		JTextField username = new JTextField();
		username.setEditable(false);
		username.setColumns(10);
		username.setBounds(345, 85, 223, 38);
		contentPane.add(username);
		try {
			fis=new FileInputStream("slcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				staff s=(staff)ois.readObject();
				username.setText(s.getUsername());
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
		panel.setBounds(175, 131, 533, 223);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("姓名");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(71, 29, 49, 35);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("地址");
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(71, 89, 49, 35);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("電話/手機");
		lblNewLabel_2_3.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(70, 157, 90, 35);
		panel.add(lblNewLabel_2_3);
		
		JTextField name = new JTextField();
		name.setColumns(10);
		name.setBounds(170, 29, 223, 38);
		panel.add(name);
		try {
			fis=new FileInputStream("slcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				staff s=(staff)ois.readObject();
				name.setText(s.getName());
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
		
		JTextField mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(170, 157, 223, 38);
		panel.add(mobile);
		try {
			fis=new FileInputStream("slcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				staff s=(staff)ois.readObject();
				mobile.setText(s.getMobile());
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
		
		JTextField address = new JTextField();
		address.setColumns(10);
		address.setBounds(170, 89, 223, 38);
		panel.add(address);
		try {
			fis=new FileInputStream("slcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				staff s=(staff)ois.readObject();
				address.setText(s.getAddress());
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
		
		JButton OK1 = new JButton("確認修改");
		OK1.setFont(new Font("新細明體", Font.BOLD, 20));
		OK1.setBounds(403, 89, 120, 73);
		panel.add(OK1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(175, 372, 533, 196);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("工作單位");
		lblNewLabel_2_3_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(56, 77, 90, 35);
		panel_1.add(lblNewLabel_2_3_1);
		
		job = new JTextField();
		job.setColumns(10);
		job.setBounds(170, 77, 223, 38);
		panel_1.add(job);
		
		JButton OK2 = new JButton("確認修改");
		OK2.setFont(new Font("新細明體", Font.BOLD, 20));
		OK2.setBounds(403, 28, 120, 73);
		panel_1.add(OK2);
		
		JLabel lblNewLabel1_1 = new JLabel("員工ID");
		lblNewLabel1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel1_1.setBounds(56, 17, 104, 38);
		panel_1.add(lblNewLabel1_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(170, 17, 223, 38);
		panel_1.add(id);
		
		JButton ds = new JButton("刪除員工");
		ds.setFont(new Font("新細明體", Font.BOLD, 20));
		ds.setBounds(403, 148, 120, 38);
		panel_1.add(ds);
		
		JButton returnma = new JButton("回管理頁");
		returnma.setFont(new Font("新細明體", Font.BOLD, 20));
		returnma.setBounds(742, 562, 120, 73);
		contentPane.add(returnma);
		
		//功能區
		OK1.addMouseListener(new MouseAdapter() {
			@Override//基本資料修改
			public void mouseClicked(MouseEvent e) {
				try {
					fis=new FileInputStream("slcookie.txt");
					ois=new ObjectInputStream(fis);
					String Name=name.getText();
					String Address=address.getText();
					String Mobile=mobile.getText();
					staff s=(staff)ois.readObject();
					if(new implother().Namecheck(Name)) 
					{
						if(new implother().Addresscheck(Address)) 
						{
							if(new implother().Mobilecheck(Mobile)) 
							{
								staff S=new implstaff().selectId2(s.getId());
								S.setName(Name);
								S.setAddress(Address);
								S.setMobile(Mobile);
								new implstaff().update(S);
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
		OK2.addMouseListener(new MouseAdapter() {
			@Override//老闆表示要給員工調職(?)
			public void mouseClicked(MouseEvent e) {
				try {
					fis=new FileInputStream("slcookie.txt");
					ois=new ObjectInputStream(fis);
					Integer Id=Integer.parseInt(id.getText());
					String Job=job.getText();
					staff s=(staff)ois.readObject();
					if(s.getJob().equals(new staffadd().j[3])) 
					{
						staff s1=new implstaff().selectId2(Id);
						s1.setJob(Job);
						new implstaff().update(s1);;
						JOptionPane.showMessageDialog(null,"修改成功!");
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"不是老闆不能改!");
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
		ds.addMouseListener(new MouseAdapter() {
			@Override//刪除員工
			public void mouseClicked(MouseEvent e) {
				try {
					fis=new FileInputStream("slcookie.txt");
					ois=new ObjectInputStream(fis);
					Integer Id=Integer.parseInt(id.getText());
					staff s=(staff)ois.readObject();
					if(s.getJob().equals(new staffadd().j[3])) 
					{
						new implstaff().delete(Id);
						JOptionPane.showMessageDialog(null,"刪除成功!");
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"不是老闆不能刪除!");
					}
					
				} 
				  catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				  catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		returnma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				staffbkma sb=new staffbkma();
				sb.setVisible(true);
				dispose();
			}
		});
	}
}

