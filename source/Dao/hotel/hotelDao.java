package Dao.hotel;

import java.util.List;

import Model.hotel;


public interface hotelDao {
	//Create
		void add(hotel h);//新增訂房資料
	//Read
		List<hotel> selectAll();//查詢所有訂房資料
		List<hotel> selectId(int id);//查詢某id的訂房資料
		List<hotel> selectMobile(String mobile);//查詢某mobile的訂房資料
	//Update
		void update(hotel h);//更新訂房資料
	//Delete
		void delete(int id);//刪除訂房資料

}
