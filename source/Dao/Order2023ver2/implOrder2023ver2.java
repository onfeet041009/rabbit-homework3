package Dao.Order2023ver2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.order2023ver2;

public class implOrder2023ver2 implements order2023ver2Dao
{

	public static void main(String[] args) 
	{
		/*order2023ver2 o=new order2023ver2("boss","test3",1,2,3,4,5,6,7,8,9,10);
		new implOrder2023ver2().add(o);*///測試新增
		//System.out.println(new implOrder2023ver2().selectAll());//測試查詢全部訂單
		//System.out.println(new implOrder2023ver2().selectId(1));//測試用ID查詢訂單
		//System.out.println(new implOrder2023ver2().selectName("Boss"));//測試用name查詢訂單
		/*order2023ver2 o=new implOrder2023ver2().selectId(2);
		o.setName("Boss1");
		new implOrder2023ver2().update(o);*///測試改某ID的資料
		//new implOrder2023ver2().delete(3);//測試刪除某ID資料
		
	}

	@Override
	public void add(order2023ver2 o) {//新增訂單
		Connection conn=DbConnection.getDB();
		String SQL="insert into Order2023ver2(name,address,a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,odate) "
				+"value(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		//SQL不顯示大寫,結果這裡沒大寫就說表不存在QAQ...
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, o.getName());
			ps.setString(2, o.getAddress());
			ps.setInt(3, o.getA0());
			ps.setInt(4, o.getA1());
			ps.setInt(5, o.getA2());
			ps.setInt(6, o.getA3());
			ps.setInt(7, o.getA4());
			ps.setInt(8, o.getA5());
			ps.setInt(9, o.getA6());
			ps.setInt(10, o.getA7());
			ps.setInt(11, o.getA8());
			ps.setInt(12, o.getA9());
			ps.setDate(13,o.getOdate());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<order2023ver2> selectAll() {//查詢所有訂單資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from Order2023ver2";
		List<order2023ver2> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				order2023ver2 o1=new order2023ver2();
				o1.setId(rs.getInt("id"));
				o1.setName(rs.getString("name"));
				o1.setAddress(rs.getString("Address"));
				o1.setA0(rs.getInt("A0"));
				o1.setA1(rs.getInt("A1"));
				o1.setA2(rs.getInt("A2"));
				o1.setA3(rs.getInt("A3"));
				o1.setA4(rs.getInt("A4"));
				o1.setA5(rs.getInt("A5"));
				o1.setA6(rs.getInt("A6"));
				o1.setA7(rs.getInt("A7"));
				o1.setA8(rs.getInt("A8"));
				o1.setA9(rs.getInt("A9"));
				o1.setOdate(rs.getDate("odate"));
				
				l.add(o1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	
	@Override
	public List<order2023ver2> selectId(int id) {//查詢某id的訂單資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from Order2023ver2 where id=?";
		List<order2023ver2> l=new ArrayList();
		order2023ver2 o=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				o=new order2023ver2();
				o.setId(rs.getInt("id"));
				o.setName(rs.getString("name"));
				o.setAddress(rs.getString("address"));
				o.setA0(rs.getInt("a0"));
				o.setA1(rs.getInt("a1"));
				o.setA2(rs.getInt("a2"));
				o.setA3(rs.getInt("a3"));
				o.setA4(rs.getInt("a4"));
				o.setA5(rs.getInt("a5"));
				o.setA6(rs.getInt("a6"));
				o.setA7(rs.getInt("a7"));
				o.setA8(rs.getInt("a8"));
				o.setA9(rs.getInt("a9"));
				o.setOdate(rs.getDate("odate"));
				
				l.add(o);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<order2023ver2> selectName(String name) {//查詢XXX客戶的訂單資料
		Connection conn=DbConnection.getDB();
		String SQL="select * from Order2023ver2 where name=?";
		List<order2023ver2> l=new ArrayList();
		order2023ver2 o=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, name);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				o=new order2023ver2();
				o.setId(rs.getInt("id"));
				o.setName(rs.getString("name"));
				o.setAddress(rs.getString("address"));
				o.setA0(rs.getInt("a0"));
				o.setA1(rs.getInt("a1"));
				o.setA2(rs.getInt("a2"));
				o.setA3(rs.getInt("a3"));
				o.setA4(rs.getInt("a4"));
				o.setA5(rs.getInt("a5"));
				o.setA6(rs.getInt("a6"));
				o.setA7(rs.getInt("a7"));
				o.setA8(rs.getInt("a8"));
				o.setA9(rs.getInt("a9"));
				o.setOdate(rs.getDate("odate"));
				l.add(o);
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public void update(order2023ver2 o) {//更新訂單
		Connection conn=DbConnection.getDB();
		String SQL="update order2023ver2 set name=?,address=?,a0=?,a1=?,a2=?,a3=?,a4=?,a5=?,a6=?,a7=?,a8=?,a9=?,odate=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, o.getName());
			ps.setString(2, o.getAddress());
			ps.setInt(3, o.getA0());
			ps.setInt(4, o.getA1());
			ps.setInt(5, o.getA2());
			ps.setInt(6, o.getA3());
			ps.setInt(7, o.getA4());
			ps.setInt(8, o.getA5());
			ps.setInt(9, o.getA6());
			ps.setInt(10, o.getA7());
			ps.setInt(11, o.getA8());
			ps.setInt(12, o.getA9());
			ps.setDate(13,o.getOdate());
			ps.setInt(14, o.getId());			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {//刪除訂單
		Connection conn=DbConnection.getDB();
		String SQL="delete from Order2023ver2 where id=?";
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
