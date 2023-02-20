package other;

import java.util.regex.Pattern;

public interface otherDao {
	/*
	 * 檢查基本資料是否填寫完善
	 */
	//檢查姓名是否符合格式
	public Boolean Namecheck(String name);
	//檢查帳號是否符合格式
	public Boolean Usernamecheck(String username);
	//檢查密碼是否符合格式
	public Boolean Passwordcheck(String password); 
	//檢查地址是否符合格式
	public Boolean Addresscheck(String address); 
	//檢查生日是否為0000/00/00格式
	public Boolean Birthdaycheck(String birthday); 
	//檢查電話是否10碼+都是數字
	public Boolean Mobilecheck(String mobile);
	/*
	 * 檢查員工資料填寫是否符合格式
	 */
	//檢查職位是否符合格式
	public Boolean Jobcheck(String job);
	//檢查到職日是否為0000/00/00格式
	public Boolean Todcheck(String tod); 
	/*
	 * 檢查會員資料填寫是否符合格式
	 */
	//檢查會員忘記密碼提問是否符合格式
	public Boolean Forgetcheck(String forget);
	/*
	 * 其他功能
	 */
	
	
}
