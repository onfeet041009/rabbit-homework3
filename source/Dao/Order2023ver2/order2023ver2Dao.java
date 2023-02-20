package Dao.Order2023ver2;

import java.util.List;

import Model.hotel;
import Model.order2023ver2;


public interface order2023ver2Dao {
	//Create
		void add(order2023ver2 o);//新增訂單
	//Read
		List<order2023ver2>selectAll();//查詢所有訂單資料
		List<order2023ver2> selectId(int id);//查詢某id的訂單資料
		List<order2023ver2> selectName(String name);//查詢XXX客戶的訂單資料
	//Update
		void update(order2023ver2 o);//更新訂單
	//Delete
		void delete(int id);//刪除訂單

}
