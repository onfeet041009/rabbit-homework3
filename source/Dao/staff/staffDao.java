package Dao.staff;

import java.util.List;

import Model.member;
import Model.staff;

public interface staffDao {
//Create
	void add(staff s);//新增員工資料
//Read
	List<staff>selectAll();//查詢所有員工資料
	List<staff> selectId(Integer id);//查詢某id的員工
	staff selectId2(Integer id);
	List<staff> selectName(String name);//查詢某姓名的員工
	staff queryStaff(String username,String password);
	Boolean queryUser(String username);//檢查員工填寫帳號是否重複
//Update
	void update(staff s);//更新員工資料
//Delete
	void delete(int id);//刪除員工資料
	

}
