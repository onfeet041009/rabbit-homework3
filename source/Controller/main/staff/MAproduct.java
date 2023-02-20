package Controller.main.staff;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Dao.Order2023ver2.implOrder2023ver2;
import Dao.hotel.implhotel;
import Model.hotel;
import Model.order2023ver2;
import Model.staff;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class MAproduct extends JFrame {

	private JPanel contentPane;
	private staff s=new staff();
	private FileInputStream fis=null;
	private ObjectInputStream ois=null;
	private JTextField ID;
	private JTextField ID2;
	private JTextField ID3;
	private JTextField ID4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAproduct frame = new MAproduct();
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
	public MAproduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("~狡兔三窟~產品後台系統");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 40));
		lblNewLabel.setBounds(176, 10, 486, 85);
		contentPane.add(lblNewLabel);
		
		JLabel on = new JLabel("");
		on.setHorizontalAlignment(SwingConstants.CENTER);
		on.setFont(new Font("新細明體", Font.BOLD, 16));
		on.setBounds(393, 626, 468, 37);
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
		time.setBounds(0, 626, 242, 37);
		contentPane.add(time);
		
		JButton reMA = new JButton("回管理頁");
		reMA.setFont(new Font("新細明體", Font.BOLD, 20));
		reMA.setBounds(10, 10, 126, 62);
		contentPane.add(reMA);
		
		JButton QorA = new JButton("查詢全部年菜訂單");
		QorA.setFont(new Font("新細明體", Font.BOLD, 18));
		QorA.setBounds(22, 143, 197, 56);
		contentPane.add(QorA);
		
		JButton QhA = new JButton("查詢全部訂房資料");
		QhA.setFont(new Font("新細明體", Font.BOLD, 18));
		QhA.setBounds(22, 209, 197, 56);
		contentPane.add(QhA);
		
		JButton oneOR = new JButton("查詢單筆訂單");
		oneOR.setFont(new Font("新細明體", Font.BOLD, 18));
		oneOR.setBounds(256, 143, 197, 56);
		contentPane.add(oneOR);
		
		JButton oneHO = new JButton("查詢單筆訂房資料");
		oneHO.setFont(new Font("新細明體", Font.BOLD, 18));
		oneHO.setBounds(256, 209, 197, 56);
		contentPane.add(oneHO);
		
		ID = new JTextField();
		ID.setBounds(493, 149, 67, 48);
		contentPane.add(ID);
		ID.setColumns(10);
		
		ID2 = new JTextField();
		ID2.setColumns(10);
		ID2.setBounds(493, 215, 67, 48);
		contentPane.add(ID2);
		
		JButton dor = new JButton("刪除單筆年菜訂單");
		dor.setFont(new Font("新細明體", Font.BOLD, 18));
		dor.setBounds(570, 143, 197, 56);
		contentPane.add(dor);
		
		JButton dho = new JButton("刪除單筆訂房資料");
		dho.setFont(new Font("新細明體", Font.BOLD, 18));
		dho.setBounds(570, 209, 197, 56);
		contentPane.add(dho);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(459, 146, 30, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(459, 212, 28, 50);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(777, 149, 30, 50);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ID");
		lblNewLabel_1_2_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(777, 212, 30, 50);
		contentPane.add(lblNewLabel_1_2_1);
		
		ID3 = new JTextField();
		ID3.setColumns(10);
		ID3.setBounds(809, 149, 67, 48);
		contentPane.add(ID3);
		
		ID4 = new JTextField();
		ID4.setColumns(10);
		ID4.setBounds(809, 215, 67, 48);
		contentPane.add(ID4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 275, 866, 352);
		contentPane.add(scrollPane);
		
		JTextArea show = new JTextArea();
		scrollPane.setViewportView(show);
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
		//功能區
		reMA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				staffbkma sb=new staffbkma();
				sb.setVisible(true);
				dispose();
			}
		});
		QorA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<order2023ver2> l=new implOrder2023ver2().selectAll();
				order2023ver2[] o=l.toArray(new order2023ver2[l.size()]);
				
				String str="";
				Integer sum=0;
				for(int i=0;i<o.length;i++) 
				{
					sum=sum+(o[i].getA0()*500+o[i].getA1()*500+o[i].getA2()*700+o[i].getA3()*400+o[i].getA4()*1000+o[i].getA5()*1000+o[i].getA6()*1000+o[i].getA7()*600+o[i].getA8()*400+o[i].getA9()*5200);
				}
				for(order2023ver2 O:o) 
				{
					str=str+"ID:"+O.getId()+"\t姓名:"+O.getName()+"\t配送地址:"+O.getAddress()+"\t訂購日期:"+O.getOdate()+
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
							"\n合計:"+sum+"元"+
							"\n----------------------------------------------------------------------------"+"\n";
				}
				show.setText(str);	
			
			}
		});
		QhA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<hotel> l=new implhotel().selectAll();
				hotel[] h=l.toArray(new hotel[l.size()]);
				
				String str="";
				Integer sum=0;
				for(int i=0;i<h.length;i++) 
				{
					sum=sum+(((h[i].getH1()*1500)+(h[i].getH2()*2500)+(h[i].getH4()*4500))*h[i].getD());
				}
				for(hotel H:h ) 
				{
					str=str+"ID:"+H.getId()+"\t訂房人姓名:"+H.getName()+"\t訂房人電話/手機:"+H.getMobile()+"\t訂房日期:"+H.getHdate()+
							"\n單人房:"+H.getH1()+"間"+
							"\t雙人房:"+H.getH2()+"間"+
							"\t四人房:"+H.getH4()+"間"+
							"\n總金額:"+sum+"元"+
							"\n---------------------------------------------------------------------"+"\n";
				}
				show.setText(str);	
			}
		});
		oneOR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer Id=Integer.parseInt(ID.getText());
				List<order2023ver2> l=new implOrder2023ver2().selectId(Id);
				order2023ver2[] o=l.toArray(new order2023ver2[l.size()]);
				
				String str="";
				Integer sum=0;
				for(int i=0;i<o.length;i++) 
				{
					sum=sum+(o[i].getA0()*500+o[i].getA1()*500+o[i].getA2()*700+o[i].getA3()*400+o[i].getA4()*1000+o[i].getA5()*1000+o[i].getA6()*1000+o[i].getA7()*600+o[i].getA8()*400+o[i].getA9()*5200);
				}
				for(order2023ver2 O:o) 
				{
					str=str+"ID:"+O.getId()+"\t姓名:"+O.getName()+"\t配送地址:"+O.getAddress()+"\t訂購日期:"+O.getOdate()+
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
							"\n合計:"+sum+"元"+
							"\n----------------------------------------------------------------------------"+"\n";
				}
				show.setText(str);	
			}
		});
		oneHO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer Id2=Integer.parseInt(ID2.getText());
				List<hotel> l=new implhotel().selectId(Id2);
				hotel[] h=l.toArray(new hotel[l.size()]);
				
				String str="";
				Integer sum=0;
				for(int i=0;i<h.length;i++) 
				{
					sum=sum+(((h[i].getH1()*1500)+(h[i].getH2()*2500)+(h[i].getH4()*4500))*h[i].getD());
				}
				for(hotel H:h ) 
				{
					str=str+"ID:"+H.getId()+"\t訂房人姓名:"+H.getName()+"\t訂房人電話/手機:"+H.getMobile()+"\t訂房日期:"+H.getHdate()+
							"\n單人房:"+H.getH1()+"間"+
							"\t雙人房:"+H.getH2()+"間"+
							"\t四人房:"+H.getH4()+"間"+
							"\n總金額:"+sum+"元"+
							"\n---------------------------------------------------------------------"+"\n";
				}
				show.setText(str);
			}
		});
		dor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer Id3=Integer.parseInt(ID3.getText());
				new implOrder2023ver2().delete(Id3);
				
			}
		});
		dho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer Id4=Integer.parseInt(ID4.getText());
				new implhotel().delete(Id4);
			}
		});
		
	}
}
