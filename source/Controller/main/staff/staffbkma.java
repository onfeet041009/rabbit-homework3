package Controller.main.staff;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.staff;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class staffbkma extends JFrame {

	private JPanel contentPane;
	private staff s=new staff();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staffbkma frame = new staffbkma();
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
	public staffbkma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("~狡兔N窟~員工後臺管理系統");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(131, 20, 618, 85);
		contentPane.add(lblNewLabel);
		
		JLabel on = new JLabel("");
		on.setHorizontalAlignment(SwingConstants.CENTER);
		on.setFont(new Font("新細明體", Font.BOLD, 20));
		on.setBounds(408, 115, 468, 63);
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
		
		JButton MApr = new JButton("管理產品後台系統");
		MApr.setFont(new Font("新細明體", Font.BOLD, 30));
		MApr.setBounds(296, 237, 357, 90);
		contentPane.add(MApr);
		
		JButton Mastaff = new JButton("修改員工資料");
		Mastaff.setFont(new Font("新細明體", Font.BOLD, 30));
		Mastaff.setBounds(296, 420, 357, 85);
		contentPane.add(Mastaff);
		
		JButton exit = new JButton("離開");
		exit.setFont(new Font("新細明體", Font.BOLD, 30));
		exit.setBounds(694, 556, 159, 79);
		contentPane.add(exit);
		//功能區
		MApr.addMouseListener(new MouseAdapter() {
			@Override//管理訂單訂房系統
			public void mouseClicked(MouseEvent e) {
				MAproduct mo=new MAproduct();
				mo.setVisible(true);
			}
		});
		Mastaff.addMouseListener(new MouseAdapter() {
			@Override//修改員工資料
			public void mouseClicked(MouseEvent e) {
				staffupdate sd=new staffupdate();
				sd.setVisible(true);
				dispose();
			}
		});
		exit.addMouseListener(new MouseAdapter() {
			@Override//離開
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		
	}
}
