package Dao.hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.hotel;

public class implhotel implements hotelDao {

	public static void main(String[] args) {
		// 測試新增訂房資料
		/*hotel h=new hotel("大美女","27662000",0,1,0);
		new implhotel().add(h);*/
		//測試查詢全部訂單
		//System.out.println(new implhotel().selectAll());
		//測試用ID查詢訂單
		//System.out.println(new implhotel().selectId(3));
		//測試用mobile查詢訂單
		//System.out.println(new implhotel().selectMobile("0800092000"));
		//測試改某ID的資料
		/*hotel h=new implhotel().selectId(3);
		h.setName("眼殘的腦闆");
		new implhotel().update(h);*/
		//測試刪除某ID的訂房資料
		//new implhotel().delete(4);
		

	}

	@Override
	public void add(hotel h) {//新增訂房資料
		Connection conn=DbConnection.getDB();
		String SQL="insert into hotel(name,mobile,h1,h2,h4,d,hdate) "
					+"value(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, h.getName());
			ps.setString(2, h.getMobile());
			ps.setInt(3, h.getH1());
			ps.setInt(4, h.getH2());
			ps.setInt(5, h.getH4());
			ps.setInt(6, h.getD());
			ps.setDate(7, h.getHdate());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<hotel> selectAll() {//查詢所有訂單資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from hotel";
		
		List<hotel> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				hotel h=new hotel();
				h.setId(rs.getInt("id"));
				h.setName(rs.getString("name"));
				h.setMobile(rs.getString("mobile"));
				h.setH1(rs.getInt("h1"));
				h.setH2(rs.getInt("h2"));
				h.setH4(rs.getInt("h4"));
				h.setD(rs.getInt("d"));
				h.setHdate(rs.getDate("hdate"));
				
				l.add(h);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<hotel> selectId(int id) {//查詢某ID的訂房資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from hotel where id=?";
		List<hotel> l=new ArrayList();
		hotel h=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{
				h=new hotel();
				h.setId(rs.getInt("id"));
				h.setName(rs.getString("name"));
				h.setMobile(rs.getString("mobile"));
				h.setH1(rs.getInt("h1"));
				h.setH2(rs.getInt("h2"));
				h.setH4(rs.getInt("h4"));
				h.setD(rs.getInt("d"));
				h.setHdate(rs.getDate("hdate"));
				
				l.add(h);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return l;
	}
	@Override
	public List<hotel> selectMobile(String mobile) {//用電話號碼查詢訂房資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from hotel where mobile=?";
		List<hotel> l=new ArrayList();
		hotel h=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, mobile);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{
				h=new hotel();
				h.setId(rs.getInt("id"));
				h.setName(rs.getString("name"));
				h.setMobile(rs.getString("mobile"));
				h.setH1(rs.getInt("h1"));
				h.setH2(rs.getInt("h2"));
				h.setH4(rs.getInt("h4"));
				h.setD(rs.getInt("d"));
				h.setHdate(rs.getDate("hdate"));
				
				l.add(h);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	@Override
	public void update(hotel h) {//更新訂房資料
		Connection conn=DbConnection.getDB();
		String SQL="Update hotel set name=?,mobile=?,h1=?,h2=?,h4=?,d=?,hdate=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, h.getName());
			ps.setString(2, h.getMobile());
			ps.setInt(3, h.getH1());
			ps.setInt(4, h.getH2());
			ps.setInt(5, h.getH4());
			ps.setInt(6, h.getD());
			ps.setDate(7, h.getHdate());
			ps.setInt(8, h.getId());
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {//刪除某ID的訂房資料
		Connection conn=DbConnection.getDB();
		String SQL="delete from hotel where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
