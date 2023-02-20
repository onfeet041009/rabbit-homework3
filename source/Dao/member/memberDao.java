package Dao.member;

import java.util.List;

import Model.member;


public interface memberDao {
	//Create
		void add(member m);//新增會員資料
	//Read
		List<member>selectAll();//查詢所有會員資料
		member selectId(int id);//查詢某id的會員
		member queryMember(String username,String password);//檢查登入帳號密碼是否正確
		Boolean queryUser(String username);//檢查會員註冊帳號是否重複
		member selectUf(String username);//透過帳號撈忘記密碼提示
	//Update
		void update(member m);//更新會員資料
	//Delete
		void delete(int id);//刪除會員資料

}
