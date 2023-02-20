package Controller.main.product;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.main.member.memberMa;
import Dao.Order2023ver2.implOrder2023ver2;
import Model.member;
import Model.order2023ver2;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;



public class Order2023ver2UI extends JFrame {

	private JPanel contentPane;
	private order2023ver2 o=new order2023ver2();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;
	private JTextField name;
	private JTextField address;
	private JTextField output;
	private JTextField input;
	private JTextField name1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order2023ver2UI frame = new Order2023ver2UI();
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
	public Order2023ver2UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(232, 151, 214));
		panel.setBounds(205, 25, 420, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("可愛兔兔年菜館-2023年菜訂購系統");
		lblNewLabel.setBounds(0, 0, 420, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\onfeet041009\\OneDrive\\桌面\\ra1.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 24));
		
		JTextArea timeArea = new JTextArea();
		timeArea.setEditable(false);
		timeArea.setForeground(new Color(64, 0, 64));
		timeArea.setBackground(new Color(255, 128, 128));
		timeArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		timeArea.setBounds(635, 35, 214, 40);
		contentPane.add(timeArea);
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
				timeArea.setText(year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day) + " "
						+ String.format("%02d", hour) + ":" + minute + ":" + second);
			}
		}, 0, 1000);
		
		JLabel lblNewLabel_1 = new JLabel("訂購人姓名");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 81, 117, 40);
		contentPane.add(lblNewLabel_1);
		name = new JTextField();
		name.setFont(new Font("新細明體", Font.BOLD, 14));
		name.setBounds(128, 83, 110, 30);
		contentPane.add(name);
		name.setColumns(10);
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
		
		JLabel lblNewLabel_2 = new JLabel("訂購人地址");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_2.setBounds(248, 81, 117, 40);
		contentPane.add(lblNewLabel_2);
		
		address = new JTextField();
		address.setFont(new Font("新細明體", Font.BOLD, 14));
		address.setBounds(375, 85, 250, 30);
		contentPane.add(address);
		address.setColumns(10);
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(244, 210, 217));
		panel_3.setBounds(10, 131, 317, 522);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("麻辣兔頭 500元/份");
		lblNewLabel_4.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(10, 10, 215, 30);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("冷吃兔 500元/份");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_5.setBounds(10, 41, 215, 30);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("紹興醉雞 700元/份");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_6.setBounds(10, 70, 215, 30);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("荷葉蓮子團圓飯 400元/份 ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 100, 215, 30);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("蒲燒鰻米糕 1000元/份");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_8.setBounds(10, 130, 215, 30);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("煎白鯧魚 1000元/份");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_9.setBounds(10, 160, 215, 30);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("干貝極品佛跳牆 1000元/份");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_10.setBounds(10, 190, 224, 30);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("紹興醉蝦 600元/份");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_11.setBounds(10, 220, 215, 30);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("奶黃流沙包 400元/份");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_12.setBounds(10, 250, 215, 30);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("大人就是全都要 5200元/份");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_13.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_13.setBounds(10, 280, 224, 30);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("合計");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_14.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_14.setBounds(11, 393, 50, 30);
		panel_3.add(lblNewLabel_14);
		
		JSpinner a0 = new JSpinner();
		a0.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a0.setFont(new Font("新細明體", Font.BOLD, 14));
		a0.setBounds(250, 16, 40, 22);
		panel_3.add(a0);
		
		JSpinner a1 = new JSpinner();
		a1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a1.setFont(new Font("新細明體", Font.BOLD, 14));
		a1.setBounds(250, 46, 40, 22);
		panel_3.add(a1);
		
		JSpinner a2 = new JSpinner();
		a2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a2.setFont(new Font("新細明體", Font.BOLD, 14));
		a2.setBounds(250, 76, 40, 22);
		panel_3.add(a2);
		
		JSpinner a3 = new JSpinner();
		a3.setFont(new Font("新細明體", Font.BOLD, 14));
		a3.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a3.setBounds(250, 106, 40, 22);
		panel_3.add(a3);
		
		JSpinner a4 = new JSpinner();
		a4.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a4.setFont(new Font("新細明體", Font.BOLD, 14));
		a4.setBounds(250, 136, 40, 22);
		panel_3.add(a4);
		
		JSpinner a5 = new JSpinner();
		a5.setFont(new Font("新細明體", Font.BOLD, 14));
		a5.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a5.setBounds(250, 166, 40, 22);
		panel_3.add(a5);
		
		JSpinner a6 = new JSpinner();
		a6.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a6.setFont(new Font("新細明體", Font.BOLD, 14));
		a6.setBounds(250, 196, 40, 22);
		panel_3.add(a6);
		
		JSpinner a7 = new JSpinner();
		a7.setFont(new Font("新細明體", Font.BOLD, 14));
		a7.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a7.setBounds(250, 226, 40, 22);
		panel_3.add(a7);
		
		JSpinner a8 = new JSpinner();
		a8.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a8.setFont(new Font("新細明體", Font.BOLD, 14));
		a8.setBounds(250, 256, 40, 22);
		panel_3.add(a8);
		
		JSpinner a9 = new JSpinner();
		a9.setFont(new Font("新細明體", Font.BOLD, 14));
		a9.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		a9.setBounds(250, 286, 40, 22);
		panel_3.add(a9);
		
		output = new JTextField();
		output.setEditable(false);
		output.setBounds(59, 393, 110, 30);
		panel_3.add(output);
		output.setColumns(10);
		
		JTextArea buy = new JTextArea();
		buy.setBounds(329, 131, 547, 265);
		contentPane.add(buy);
		buy.setEditable(false);
		
		JLabel lblNewLabel_3 = new JLabel("輸入姓名查詢訂單");
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_3.setBounds(329, 412, 145, 40);
		contentPane.add(lblNewLabel_3);
		
		name1 = new JTextField();
		name1.setFont(new Font("新細明體", Font.BOLD, 14));
		name1.setColumns(10);
		name1.setBounds(470, 417, 110, 30);
		contentPane.add(name1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(329, 460, 547, 193);
		contentPane.add(scrollPane);
		
		JTextArea show = new JTextArea();
		scrollPane.setViewportView(show);
		show.setEditable(false);
		
		JButton cls = new JButton("清空");
		cls.setForeground(new Color(0, 0, 0));
		cls.setBackground(new Color(255, 255, 255));
		cls.setFont(new Font("新細明體", Font.BOLD, 24));
		cls.setBounds(93, 320, 85, 49);
		panel_3.add(cls);
		
		JButton ok = new JButton("結帳");
		ok.setFont(new Font("新細明體", Font.BOLD, 24));
		ok.setBounds(179, 382, 85, 50);
		panel_3.add(ok);
		
		JLabel lblNewLabel_15 = new JLabel("付款金額");
		lblNewLabel_15.setBounds(10, 470, 93, 30);
		panel_3.add(lblNewLabel_15);
		lblNewLabel_15.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.LEFT);
		
		input = new JTextField();
		input.setBounds(104, 472, 110, 30);
		panel_3.add(input);
		input.setColumns(10);
		
		JButton pay = new JButton("付款");
		pay.setBounds(225, 459, 85, 50);
		panel_3.add(pay);
		pay.setFont(new Font("新細明體", Font.BOLD, 24));
		
		JButton print = new JButton("列印");
		print.setFont(new Font("新細明體", Font.BOLD, 24));
		print.setBounds(791, 400, 85, 50);
		contentPane.add(print);
		
		JButton rd = new JButton("查詢");
		rd.setFont(new Font("新細明體", Font.BOLD, 24));
		rd.setBounds(590, 400, 85, 50);
		contentPane.add(rd);
		
		JButton returnma = new JButton("回會員專區");
		returnma.setFont(new Font("新細明體", Font.BOLD, 24));
		returnma.setBounds(10, 25, 185, 50);
		contentPane.add(returnma);
			
		//功能區
		cls.addMouseListener(new MouseAdapter() {
			@Override//清空
			public void mouseClicked(MouseEvent e) {
					a0.setValue(0);
					a1.setValue(0);
					a2.setValue(0);
					a3.setValue(0);
					a4.setValue(0);
					a5.setValue(0);
					a6.setValue(0);
					a7.setValue(0);
					a8.setValue(0);
					a9.setValue(0);
					output.setText("");			
			}
		});
		ok.addMouseListener(new MouseAdapter() {
			@Override//結帳
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Address=address.getText();
				Integer A0=(Integer)a0.getValue();
				Integer A1=(Integer)a1.getValue();
				Integer A2=(Integer)a2.getValue();
				Integer A3=(Integer)a3.getValue();
				Integer A4=(Integer)a4.getValue();
				Integer A5=(Integer)a5.getValue();
				Integer A6=(Integer)a6.getValue();
				Integer A7=(Integer)a7.getValue();
				Integer A8=(Integer)a8.getValue();
				Integer A9=(Integer)a9.getValue();
				Integer sum=(A0*500+A1*500+A2*700+A3*400+A4*1000+A5*1000+A6*1000+A7*600+A8*400+A9*5200);
				String Sum=sum.toString();
				output.setText(Sum);	
			}
		});
		pay.addMouseListener(new MouseAdapter() {
			@Override//付款
			public void mouseClicked(MouseEvent e) {
				try {
					fis=new FileInputStream("mlcookie.txt");
					ois=new ObjectInputStream(fis);
					String Name=name.getText();
					String Address=address.getText();
					member m=(member)ois.readObject();
					Integer A0=(Integer)a0.getValue();
					Integer A1=(Integer)a1.getValue();
					Integer A2=(Integer)a2.getValue();
					Integer A3=(Integer)a3.getValue();
					Integer A4=(Integer)a4.getValue();
					Integer A5=(Integer)a5.getValue();
					Integer A6=(Integer)a6.getValue();
					Integer A7=(Integer)a7.getValue();
					Integer A8=(Integer)a8.getValue();
					Integer A9=(Integer)a9.getValue();
					Integer Output=Integer.parseInt(output.getText());
					Integer Input=Integer.parseInt(input.getText());
					Date Odate=new Date();
					order2023ver2 o=new order2023ver2(Name,Address,A0,A1,A2,A3,A4,A5,A6,A7,A8,A9,new java.sql.Date(Odate.getTime()));
					
					new implOrder2023ver2().add(o);
					buy.setText("姓名:"+Name+"\t配送地址:"+Address+"\t訂購日期:"+new java.sql.Date(Odate.getTime())+
							"\n===================================================="+
							"\n麻辣兔頭500元/份:"+A0+"份"+
							"\n冷吃兔500元/份:"+A1+"份"+
							"\n紹興醉雞700元/份:"+A2+"份"+
							"\n蓮葉蓮子團圓飯400元/份:"+A3+"份"+
							"\n蒲燒鰻米糕1000元/份:"+A4+"份"+
							"\n煎白鯧魚1000元/份:"+A5+"份"+
							"\n干貝極品佛跳牆1000元/份:"+A6+"份"+
							"\n紹興醉蝦600元/份:"+A7+"份"+
							"\n奶黃流沙包400元/份:"+A8+"份"+
							"\n大人就是全都要5200元/份:"+A9+"份"+
							"\n===================================================="+
							"\n合計:"+output.getText()+"元"+
							"\t找零:"+(Input-Output)+"元");
					
					
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
		rd.addMouseListener(new MouseAdapter() {
			@Override//以姓名查詢
			public void mouseClicked(MouseEvent e){
			String Name1=name1.getText();
			List<order2023ver2> l=new implOrder2023ver2().selectName(Name1);
			order2023ver2[] o=l.toArray(new order2023ver2[l.size()]);
			
			String str="";
			Integer sum=0;
			for(int i=0;i<o.length;i++) 
			{
				sum=sum+(o[i].getA0()*500+o[i].getA1()*500+o[i].getA2()*700+o[i].getA3()*400+o[i].getA4()*1000+o[i].getA5()*1000+o[i].getA6()*1000+o[i].getA7()*600+o[i].getA8()*400+o[i].getA9()*5200);
			}
			for(order2023ver2 O:o) 
			{
				str=str+"姓名:"+O.getName()+"\t配送地址:"+O.getAddress()+"\t訂購日期:"+O.getOdate()+
						"\n===================================================="+
						"\n麻辣兔頭500元/份:"+O.getA0()+"份"+
						"\n冷吃兔500元/份:"+O.getA1()+"份"+
						"\n紹興醉雞700元/份:"+O.getA2()+"份"+
						"\n蓮葉蓮子團圓飯400元/份:"+O.getA3()+"份"+
						"\n蒲燒鰻米糕1000元/份:"+O.getA4()+"份"+
						"\n煎白鯧魚1000元/份:"+O.getA5()+"份"+
						"\n干貝極品佛跳牆1000元/份:"+O.getA6()+"份"+
						"\n紹興醉蝦600元/份:"+O.getA7()+"份"+
						"\n奶黃流沙包400元/份:"+O.getA8()+"份"+
						"\n大人就是全都要5200元/份:"+O.getA9()+"份"+
						"\n===================================================="+
						"\n合計:"+sum+"元"+"\n";
			}
			show.setText(str);				
			}
		});
		print.addMouseListener(new MouseAdapter() {
			@Override//列印
			public void mouseClicked(MouseEvent e) {
				try 
				{
					buy.print();
				}
				catch(PrinterException ex)
				{
					ex.printStackTrace();
				}
			}
		});
		returnma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberMa ma=new memberMa();
				ma.setVisible(true);
				dispose();
			}
		});
		
		
		
		
		
	}
}