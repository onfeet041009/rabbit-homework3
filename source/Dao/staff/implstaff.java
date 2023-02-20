package Dao.staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.staff;

public class implstaff implements staffDao {

	public static void main(String[] args) {
		//測試新增
		/*staff s=new staff("Boss2","money","666","boss","員工心中","20230230","0800092000","forever");
		new implstaff().add(s);*/
		//測試查詢全部員工資料
		//System.out.println(new implstaff().selectAll());
		//測試查詢某id的員工資料
		//System.out.println(new implstaff().selectId(1));
		//測試登入帳號密碼檢測
		//System.out.println(new implstaff().queryStaff("7pupu", "7777"));
		//測試查詢某username的會員
		//System.out.println(new implstaff().queryUser("喵喵喵"));
		//更新某ID的員工資料
		/*staff s=new implstaff().selectId(1);
		s.setAddress("我不改了QAQ");
		new implstaff().update(s);*/
		//測試刪除某ID的員工資料
		//new implstaff().delete(2);

	}

	@Override
	public void add(staff s) {//新增員工資料
		Connection conn=DbConnection.getDB();
		String SQL="insert into staff(name,username,password,job,address,birthday,mobile,tod) "
		+"value(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, s.getName());
			ps.setString(2, s.getUsername());
			ps.setString(3, s.getPassword());
			ps.setString(4, s.getJob());
			ps.setString(5, s.getAddress());
			ps.setString(6, s.getBirthday());
			ps.setString(7, s.getMobile());
			ps.setString(8, s.getTod());
			
			ps.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}

	@Override
	public List<staff> selectAll() {//查詢所有員工資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from staff";
		List<staff> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				staff s=new staff();
				s.setName(rs.getString("name"));
				s.setUsername(rs.getString("username"));
				s.setPassword(rs.getString("password"));
				s.setJob(rs.getString("job"));
				s.setAddress(rs.getString("address"));
				s.setBirthday(rs.getString("birthday"));
				s.setMobile(rs.getString("mobile"));
				s.setTod(rs.getString("tod"));
				
				l.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public List<staff> selectId(Integer id) {//查詢某id的員工資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from staff where id=?";
		List<staff> l=new ArrayList();
		staff s=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				s=new staff();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setUsername(rs.getString("username"));
				s.setPassword(rs.getString("password"));
				s.setJob(rs.getString("job"));
				s.setAddress(rs.getString("address"));
				s.setBirthday(rs.getString("birthday"));
				s.setMobile(rs.getString("mobile"));
				s.setTod(rs.getString("tod"));
				
				l.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	@Override
	public staff selectId2(Integer id) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from staff where id=?";
		staff s=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				s=new staff();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setUsername(rs.getString("username"));
				s.setPassword(rs.getString("password"));
				s.setJob(rs.getString("job"));
				s.setAddress(rs.getString("address"));
				s.setBirthday(rs.getString("birthday"));
				s.setMobile(rs.getString("mobile"));
				s.setTod(rs.getString("tod"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	@Override//以姓名查詢員工資料
	public List<staff> selectName(String name) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from staff where name=?";
		List<staff> l=new ArrayList();
		staff s=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, name);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				s=new staff();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setUsername(rs.getString("username"));
				s.setPassword(rs.getString("password"));
				s.setJob(rs.getString("job"));
				s.setAddress(rs.getString("address"));
				s.setBirthday(rs.getString("birthday"));
				s.setMobile(rs.getString("mobile"));
				s.setTod(rs.getString("tod"));
				
				l.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	@Override//檢測登入的帳號密碼是否正確
	public staff queryStaff(String username, String password) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from staff where username=? and password=?";
		staff s=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) 
			{
				s=new staff();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setUsername(rs.getString("username"));
				s.setPassword(rs.getString("password"));
				s.setJob(rs.getString("job"));
				s.setAddress(rs.getString("address"));
				s.setBirthday(rs.getString("birthday"));
				s.setMobile(rs.getString("mobile"));
				s.setTod(rs.getString("tod"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}		
	@Override
	public Boolean queryUser(String username) {//查詢某帳號的員工資料,用來核對是否重複註冊
		Connection conn=DbConnection.getDB();
		String SQL="select * from staff where username=?";
		Boolean s=false;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				s=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public void update(staff s) {//更新員工資料
		Connection conn=DbConnection.getDB();
		String SQL="Update staff set name=?,password=?,job=?,address=?,mobile=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getJob());
			ps.setString(4, s.getAddress());
			ps.setString(5, s.getMobile());
			ps.setInt(6, s.getId());
			
			ps.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {//刪除某ID的員工資料
		Connection conn=DbConnection.getDB();
		String SQL="delete from staff where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
