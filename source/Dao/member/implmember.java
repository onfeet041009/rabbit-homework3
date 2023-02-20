package Dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.member;

public class implmember implements memberDao {

	public static void main(String[] args) {
		//測試新增
		/*member m=new member("BOSSVIP","money","666","我家雞排沙漠","身上最年幼細胞誕生那天","0800092000","覺得牛逼的時候會喊的?");
		new implmember().add(m);*/
		//測試查詢全部會員資料
		//System.out.println(new implmember().selectAll());
		//測試查詢某ID的會員資料
		//System.out.println(new implmember().selectId(1));
		//測試登入的帳號密碼檢驗
		//System.out.println(new implmember().queryMember("7pupu", "77"));
		//測試查詢某username的會員
		//System.out.println(new implmember().queryUser("喵喵喵"));
		//測試用帳號查詢忘記密碼
		//System.out.println(new implmember().selectUf("7pupu").toString());
		//更新某ID的會員資料
		/*member m=new implmember().selectId(2);
		m.setForget("溜溜5+1");
		new implmember().update(m);*/
		//測試刪除某ID的員工資料
		//new implmember().delete(2);
		

	}

	@Override
	public void add(member m) {//新增會員資料
		Connection conn=DbConnection.getDB();
		String SQL="insert into member(name,username,password,address,birthday,mobile,forget) "
							+"value(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getBirthday());
			ps.setString(6, m.getMobile());
			ps.setString(7, m.getForget());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<member> selectAll() {//查詢所有會員資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from member";
		List<member> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				member m=new member();
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setBirthday(rs.getString("birthday"));
				m.setMobile(rs.getString("mobile"));
				m.setForget(rs.getString("forget"));
				
				l.add(m);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public member selectId(int id) {//查詢某ID會員資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where id=?";
		member m=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) 
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setBirthday(rs.getString("birthday"));
				m.setMobile(rs.getString("mobile"));
				m.setForget(rs.getString("forget"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	@Override//檢查登入帳號跟密碼是否正確
	public member queryMember(String username, String password) {
		Connection conn=DbConnection.getDB();
		String SQL="select *from member where username=? and password=?";
		member m=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) 
			{
				m=new member();//不用宣告,所以m的前面沒+member
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setBirthday(rs.getString("birthday"));
				m.setMobile(rs.getString("mobile"));
				m.setForget(rs.getString("forget"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}	
	@Override
	public Boolean queryUser(String username) {//核對會員帳號是否重複
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where username=?";
		Boolean m=false;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				m=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	@Override//透過帳號撈忘記密碼提示
	public member selectUf(String username) {
		Connection conn=DbConnection.getDB();
		String SQL="select forget from member where username=? ";
		member m=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				m=new member();
				m.setForget(rs.getString("forget"));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public void update(member m) {//更新會員資料
		Connection conn=DbConnection.getDB();
		String SQL="Update member set name=?,password=?,address=?,mobile=?,forget=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getAddress());
			ps.setString(4, m.getMobile());
			ps.setString(5, m.getForget());
			ps.setInt(6, m.getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {//刪除會員資料
		Connection conn=DbConnection.getDB();
		String SQL="delete from member where id=?";
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
