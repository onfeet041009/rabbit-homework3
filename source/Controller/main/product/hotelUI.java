package Controller.main.product;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.main.member.memberMa;
import Dao.hotel.implhotel;
import Model.hotel;
import Model.member;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;




public class hotelUI extends JFrame {

	private JPanel contentPane;
	private member m=new member();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;
	private JTextField h1;
	private JTextField h2;
	private JTextField h4;
	private JTextField d;
	private JTextField total;
	private JTextField mobile;
	//房型點按次數
	Integer c=0;
	Integer c2=0;
	Integer c4=0;
	//天數點按次數
	Integer p=0;
	private JTextField pay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelUI frame = new hotelUI();
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
	public hotelUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 500, 935, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 197, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("可愛兔兔無人旅館訂房系統");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 45));
		lblNewLabel.setBounds(117, 10, 655, 62);
		contentPane.add(lblNewLabel);
		
		JLabel on = new JLabel("");
		on.setForeground(new Color(255, 0, 128));
		on.setHorizontalAlignment(SwingConstants.LEFT);
		on.setFont(new Font("新細明體", Font.BOLD, 16));
		on.setBounds(481, 66, 393, 37);
		contentPane.add(on);//顯示登入的會員之姓名
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
		JLabel time = new JLabel("New label");//時間設置
		time.setForeground(new Color(0, 128, 0));
		time.setFont(new Font("新細明體", Font.BOLD, 16));
		time.setBounds(10, 636, 242, 25);
		contentPane.add(time);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(10, 82, 313, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Step1:點圖選擇房型及數量");
		lblNewLabel_1.setForeground(new Color(128, 0, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 0, 207, 33);
		panel.add(lblNewLabel_1);
		
		JLabel h1b = new JLabel("New label");
		h1b.setIcon(new ImageIcon(hotelUI.class.getResource("/Controller/main/product/h1.jpg")));
		h1b.setBounds(10, 30, 115, 100);
		panel.add(h1b);
		
		JLabel lblNewLabel_3 = new JLabel("單人房1500元/晚");
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 140, 127, 25);
		panel.add(lblNewLabel_3);
		
		JLabel h2b = new JLabel("New label");
		h2b.setIcon(new ImageIcon(hotelUI.class.getResource("/Controller/main/product/h2.jpg")));
		h2b.setBounds(10, 190, 115, 100);
		panel.add(h2b);
		
		JLabel lblNewLabel_3_1 = new JLabel("雙人房 2500元/晚");
		lblNewLabel_3_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_3_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(10, 300, 127, 25);
		panel.add(lblNewLabel_3_1);
		
		JLabel h4b = new JLabel("New label");
		h4b.setIcon(new ImageIcon(hotelUI.class.getResource("/Controller/main/product/h4.jpg")));
		h4b.setBounds(10, 350, 115, 100);
		panel.add(h4b);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("四人房 4500元/晚");
		lblNewLabel_3_1_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_3_1_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(10, 460, 127, 25);
		panel.add(lblNewLabel_3_1_1);
		
		h1 = new JTextField();
		h1.setText("0");
		h1.setEditable(false);
		h1.setFont(new Font("新細明體", Font.BOLD, 16));
		h1.setBounds(135, 98, 31, 33);
		panel.add(h1);
		h1.setColumns(10);
		
		h2 = new JTextField();
		h2.setText("0");
		h2.setEditable(false);
		h2.setFont(new Font("新細明體", Font.BOLD, 16));
		h2.setColumns(10);
		h2.setBounds(135, 257, 31, 33);
		panel.add(h2);
		
		h4 = new JTextField();
		h4.setText("0");
		h4.setEditable(false);
		h4.setFont(new Font("新細明體", Font.BOLD, 16));
		h4.setColumns(10);
		h4.setBounds(135, 417, 31, 33);
		panel.add(h4);
		
		JLabel lblNewLabel_2 = new JLabel("間");
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2.setBounds(174, 98, 24, 33);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("間");
		lblNewLabel_2_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(174, 257, 24, 33);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("間");
		lblNewLabel_2_2.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_2.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(174, 417, 24, 33);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("Step2:輸入入住天數,按結帳查看金額");
		lblNewLabel_4.setForeground(new Color(128, 0, 255));
		lblNewLabel_4.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 488, 277, 25);
		panel.add(lblNewLabel_4);
		
		d = new JTextField();
		d.setText("0");
		d.setFont(new Font("新細明體", Font.BOLD, 16));
		d.setColumns(10);
		d.setBounds(70, 512, 50, 33);
		panel.add(d);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("天");
		lblNewLabel_2_2_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_2_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(127, 512, 24, 33);
		panel.add(lblNewLabel_2_2_1);
		
		JButton ok = new JButton("結帳");
		ok.setFont(new Font("新細明體", Font.BOLD, 16));
		ok.setBounds(161, 512, 77, 33);
		panel.add(ok);
		
		JButton plus = new JButton("+");
		plus.setFont(new Font("新細明體", Font.BOLD, 16));
		plus.setBounds(10, 512, 50, 33);
		panel.add(plus);
		
		JButton clean = new JButton("清空");
		clean.setFont(new Font("新細明體", Font.BOLD, 16));
		clean.setBounds(227, 10, 76, 33);
		panel.add(clean);
		
		JLabel lblNewLabel_2_3 = new JLabel("總金額");
		lblNewLabel_2_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_3.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(333, 127, 60, 33);
		contentPane.add(lblNewLabel_2_3);
		
		total = new JTextField();
		total.setEditable(false);
		total.setFont(new Font("新細明體", Font.BOLD, 16));
		total.setColumns(10);
		total.setBounds(386, 127, 114, 33);
		contentPane.add(total);
		
		JLabel lblNewLabel_2_4 = new JLabel("元");
		lblNewLabel_2_4.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_4.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2_4.setBounds(504, 127, 24, 33);
		contentPane.add(lblNewLabel_2_4);
		
		JButton pay1 = new JButton("付款");
		pay1.setFont(new Font("新細明體", Font.BOLD, 16));
		pay1.setBounds(797, 127, 77, 33);
		contentPane.add(pay1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Step3:確認無誤付款");
		lblNewLabel_4_1.setForeground(new Color(128, 0, 255));
		lblNewLabel_4_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(333, 92, 158, 25);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("輸入手機號碼查詢訂單");
		lblNewLabel_5.setForeground(new Color(128, 0, 255));
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_5.setBounds(333, 365, 184, 33);
		contentPane.add(lblNewLabel_5);
		
		JButton queryM = new JButton("查詢");
		queryM.setFont(new Font("新細明體", Font.BOLD, 16));
		queryM.setBounds(632, 365, 77, 33);
		contentPane.add(queryM);
		
		mobile = new JTextField();
		mobile.setFont(new Font("新細明體", Font.BOLD, 16));
		mobile.setColumns(10);
		mobile.setBounds(504, 365, 114, 33);
		contentPane.add(mobile);
		
		JButton returnma = new JButton("回會員專區");
		returnma.setFont(new Font("新細明體", Font.BOLD, 16));
		returnma.setBounds(10, 24, 125, 33);
		contentPane.add(returnma);
		
		JLabel lblNewLabel_6 = new JLabel("付款金額");
		lblNewLabel_6.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_6.setForeground(new Color(0, 128, 255));
		lblNewLabel_6.setBounds(538, 127, 92, 33);
		contentPane.add(lblNewLabel_6);
		
		pay = new JTextField();
		pay.setFont(new Font("新細明體", Font.BOLD, 16));
		pay.setColumns(10);
		pay.setBounds(611, 127, 114, 33);
		contentPane.add(pay);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("元");
		lblNewLabel_2_4_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_4_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_2_4_1.setBounds(727, 127, 24, 33);
		contentPane.add(lblNewLabel_2_4_1);
		
		JTextArea buy = new JTextArea();
		buy.setEditable(false);
		buy.setLineWrap(true);
		buy.setBounds(333, 170, 587, 162);
		contentPane.add(buy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(333, 418, 578, 235);
		contentPane.add(scrollPane);
		
		JTextArea show = new JTextArea(10,15);
		show.setEditable(false);
		scrollPane.setViewportView(show);
		show.setLineWrap(true);
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
		h1b.addMouseListener(new MouseAdapter() {
			@Override//訂單人房,一下=1
			public void mouseClicked(MouseEvent e) {
				if(c>3) {
					JOptionPane.showMessageDialog(null, "單人房只有4間喔!");
				}
				else 
				{
					c++;
					h1.setText(Integer.toString(c));
				}
			}
		});
		h2b.addMouseListener(new MouseAdapter() {
			@Override//訂雙人房,一下=1
			public void mouseClicked(MouseEvent e) {
				if(c2>3) {
					JOptionPane.showMessageDialog(null, "雙人房只有4間喔!");
				}
				else 
				{
					c2++;
					h2.setText(Integer.toString(c2));
				}
				
			}
		});
		h4b.addMouseListener(new MouseAdapter() {
			@Override//訂四人房,一下=1
			public void mouseClicked(MouseEvent e) {
				if(c4>3) {
					JOptionPane.showMessageDialog(null, "四人房只有4間喔!");
				}
				else 
				{
					c4++;
					h4.setText(Integer.toString(c4));
				}
			}
		});
		plus.addMouseListener(new MouseAdapter() {
			@Override//增加天數按鈕
			public void mouseClicked(MouseEvent e) {
				p++;
				d.setText(Integer.toString(p));
			}
		});
		clean.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				h1.setText("0");
				h2.setText("0");
				h4.setText("0");
				d.setText("0");
			}
		});
		
		ok.addMouseListener(new MouseAdapter() {
			@Override//結帳
			public void mouseClicked(MouseEvent e) {
				Integer H1=Integer.parseInt(h1.getText());
				Integer H2=Integer.parseInt(h2.getText());
				Integer H4=Integer.parseInt(h4.getText());
				Integer D=Integer.parseInt(d.getText());
				Integer sum=(((H1*1500)+(H2*2500)+(H4*4500))*D);
				String Sum=sum.toString();
				total.setText(Sum);	
			}
		});
		pay1.addMouseListener(new MouseAdapter() {
			@Override//付款
			public void mouseClicked(MouseEvent e) {
				try {
					fis=new FileInputStream("mlcookie.txt");
					ois=new ObjectInputStream(fis);
					Integer H1=Integer.parseInt(h1.getText());
					Integer H2=Integer.parseInt(h2.getText());
					Integer H4=Integer.parseInt(h4.getText());
					Integer D=Integer.parseInt(d.getText());
					Integer Pay=Integer.parseInt(pay.getText());
					Integer Total=Integer.parseInt(total.getText());
					Date Hdate=new Date();
					member m=(member)ois.readObject();
					hotel h=new hotel(m.getName(),m.getMobile(),H1,H2,H4,D,new java.sql.Date(Hdate.getTime()));
					
					new implhotel().add(h);
					buy.setText("訂房人姓名:"+m.getName()+"\t訂房人電話/手機:"+m.getMobile()+"\t訂房日期:"+new java.sql.Date(Hdate.getTime())+
										"\n============================================================================="+
										"\n單人房:"+H1+"間"+
										"\n雙人房:"+H2+"間"+
										"\n四人房:"+H4+"間"+
										"\n============================================================================="+
										"\n總金額:"+total.getText()+"元"+
										"\n找零:"+(Pay-Total)+"元");					
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
		queryM.addMouseListener(new MouseAdapter() {
			@Override//以電話/手機搜尋訂房資料
			public void mouseClicked(MouseEvent e) {
				String Mobile=mobile.getText();
				List<hotel> l=new implhotel().selectMobile(Mobile);
				hotel[] h=l.toArray(new hotel[l.size()]);
				
				String str="";
				Integer sum=0;
				for(int i=0;i<h.length;i++) 
				{
					sum=sum+(((h[i].getH1()*1500)+(h[i].getH2()*2500)+(h[i].getH4()*4500))*h[i].getD());
				}
				for(hotel H:h ) 
				{
					str=str+"訂房人姓名:"+H.getName()+"\t訂房人電話/手機:"+H.getMobile()+"\t訂房日期:"+H.getHdate()+
							"\n單人房:"+H.getH1()+"間"+
							"\t雙人房:"+H.getH2()+"間"+
							"\t四人房:"+H.getH4()+"間"+
							"\n總金額:"+sum+"元"+"\n";
				}
				show.setText(str);	
			}
		});
		returnma.addMouseListener(new MouseAdapter() {
			@Override//回會員專區
			public void mouseClicked(MouseEvent e) {
				memberMa ma=new memberMa();
				ma.setVisible(true);
				dispose();
			}
		});
	//功能區
		
		
		
	}
}
