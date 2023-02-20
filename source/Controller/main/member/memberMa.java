package Controller.main.member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.main.product.Order2023ver2UI;
import Controller.main.product.hotelUI;
import Model.member;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class memberMa extends JFrame {

	private JPanel contentPane;
	private member m=new member();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberMa frame = new memberMa();
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
	public memberMa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 197, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		URL url=getClass().getResource("bk.png");
		ImageIcon bg=new ImageIcon(url);
		
		JLabel time = new JLabel("New label");
		time.setForeground(new Color(0, 128, 0));
		time.setFont(new Font("新細明體", Font.BOLD, 16));
		time.setBounds(10, 614, 242, 37);
		contentPane.add(time);
		
		JLabel lblNewLabel = new JLabel("~可愛兔兔買到兔~");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(116, 10, 655, 95);
		contentPane.add(lblNewLabel);
		
		JLabel on = new JLabel("");
		on.setForeground(new Color(255, 0, 128));
		on.setHorizontalAlignment(SwingConstants.LEFT);
		on.setFont(new Font("新細明體", Font.BOLD, 16));
		on.setBounds(450, 100, 424, 37);
		contentPane.add(on);
		
		JButton updatemember = new JButton("修改會員資料");
		updatemember.setFont(new Font("新細明體", Font.BOLD, 30));
		updatemember.setBounds(281, 473, 357, 86);
		contentPane.add(updatemember);
		updatemember.addMouseListener(new MouseAdapter() {
			@Override//修改會員資料
			public void mouseClicked(MouseEvent e) {
				memberupdate mu=new memberupdate();
				mu.setVisible(true);
				dispose();
			}
		});
		
		JButton gohotel = new JButton("可愛兔兔無人旅館");
		gohotel.setFont(new Font("新細明體", Font.BOLD, 30));
		gohotel.setBounds(281, 310, 357, 86);
		contentPane.add(gohotel);
		gohotel.addMouseListener(new MouseAdapter() {
			@Override//可愛兔兔無人旅館
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"本系統為當天訂,當天入住,無法提前預訂喔!"
																			+ "\nCheck-in時間:14點00分以後"
																			+"\nCheck-out時間:11點30分以前");
				hotelUI hu=new hotelUI();
				hu.setVisible(true);
				dispose();
			}
		});
		JButton goOrder2023ver2 = new JButton("2023可愛兔兔年菜館");
		goOrder2023ver2.setFont(new Font("新細明體", Font.BOLD, 30));
		goOrder2023ver2.setBounds(281, 147, 357, 78);
		contentPane.add(goOrder2023ver2);
		
		//功能區
		goOrder2023ver2.addMouseListener(new MouseAdapter() {
			@Override//2023可愛兔兔年菜館
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "現在訂購年菜,最快2035年1月初就到貨囉!");
				Order2023ver2UI o=new Order2023ver2UI();
				o.setVisible(true);
				dispose();
			}
		});
		
		JButton exit = new JButton("離開");
		exit.setFont(new Font("新細明體", Font.BOLD, 30));
		exit.setBounds(694, 590, 159, 61);
		contentPane.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override//離開
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		try {
			fis=new FileInputStream("mlcookie.txt");
			ois=new ObjectInputStream(fis);
			if(ois!=null) 
			{
				member m=(member)ois.readObject();
				on.setText("歡迎光臨尊貴的VIP客戶\t~"+m.getName()+"\t~ "+"祝您購物愉快!");
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
		
		JLabel inbackg = new JLabel("");
		inbackg.setBackground(new Color(255, 128, 192));
		inbackg.setIcon(bg);
		inbackg.setBounds(0, 0, 884, 661);
		contentPane.add(inbackg);
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
		
		
		
		
		
	}
}