package Controller;

import java.awt.EventQueue;
import java.net.URL;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.main.member.memberadd;
import Controller.main.member.memberlogin;
import Controller.main.staff.stafflogin;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class index extends JFrame {

	private JPanel backg;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		backg = new JPanel();
		backg.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backg);
		backg.setLayout(null);
		
		JLabel slgoin = new JLabel("~可愛兔兔買到兔~");
		slgoin.setForeground(new Color(128, 128, 192));
		slgoin.setHorizontalAlignment(SwingConstants.CENTER);
		slgoin.setFont(new Font("新細明體", Font.BOLD, 30));
		slgoin.setBackground(new Color(0, 0, 0));
		slgoin.setBounds(234, 38, 354, 67);
		backg.add(slgoin);		
		JButton mlogin = new JButton("會員登入");
		
		mlogin.setFont(new Font("新細明體", Font.BOLD, 20));
		mlogin.setBackground(new Color(255, 128, 128));
		mlogin.setBounds(288, 158, 274, 50);
		backg.add(mlogin);
		
		JLabel madd = new JLabel("會員享優惠!還沒註冊?快來加入會員吧!");
		madd.setForeground(new Color(255, 0, 0));
		madd.setFont(new Font("新細明體", Font.BOLD, 16));
		madd.setHorizontalAlignment(SwingConstants.CENTER);
		madd.setBounds(275, 265, 299, 41);
		backg.add(madd);
		
		URL url=getClass().getResource("ra1.jpg");
		ImageIcon bg=new ImageIcon(url);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(128, 0, 64));
		time.setFont(new Font("新細明體", Font.BOLD, 18));
		time.setBounds(299, 567, 299, 57);
		backg.add(time);
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
		
		
		JLabel inbackg = new JLabel("");
		inbackg.setBackground(new Color(255, 128, 192));
		inbackg.setIcon(bg);
		inbackg.setBounds(0, 0, 884, 661);
		backg.add(inbackg);
		
		//員工登入
		slgoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stafflogin s=new stafflogin();
				s.setVisible(true);
				dispose();
				
			}
		});
		//會員登入
		mlogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberlogin m=new memberlogin();
				m.setVisible(true);
				dispose();
			}
		});
		//會員註冊
		madd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberadd m1=new memberadd();
				m1.setVisible(true);
				dispose();
			}
		});
	}
}
