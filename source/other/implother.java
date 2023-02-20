package other;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Timer;
import java.util.regex.Pattern;



public class implother implements otherDao {
	
	public static void main(String[] args) {
		
	
	}
//檢查基本資料
	@Override//檢查姓名
	public Boolean Namecheck(String name) {
		String Regname="\\D{2,50}";
		Pattern pat=Pattern.compile(Regname);
		if(pat.equals("")) 
		{
			return false;
		}		
		return pat.matcher(name).matches();
	}

	@Override//檢查帳號是否符合格式
	public Boolean Usernamecheck(String username) {
		String Regusername="\\w{4,50}";
		Pattern pat=Pattern.compile(Regusername);
		if(pat.equals("")) 
		{
			return false;
		}		
		return pat.matcher(username).matches();
	}	
	
	@Override//檢查密碼
	public Boolean Passwordcheck(String password) {
		String Regpassword="\\w{4,50}";
		Pattern pat=Pattern.compile(Regpassword);
		if(pat.equals("")) 
		{
			return false;
		}		
		return pat.matcher(password).matches();
	}

	@Override//檢查地址
	public Boolean Addresscheck(String address) {
		String Regaddress="[\\D0-9]{3,100}";
		Pattern pat=Pattern.compile(Regaddress);
		if(pat.equals("")) 
		{
			return false;
		}
		return pat.matcher(address).matches();
	}

	@Override//檢查生日
	public Boolean Birthdaycheck(String birthday) {
		String Regbirthday="\\d{4}/\\d{2}/\\d{2}";
		Pattern pat=Pattern.compile(Regbirthday);
		if(pat.equals("")) 
		{
			return false;
		}	
		return pat.matcher(birthday).matches();
	}

	@Override//檢查電話/手機
	public Boolean Mobilecheck(String mobile) {
		String Regmobile="\\d{10}";
		Pattern pat=Pattern.compile(Regmobile);
		if(pat.equals("")) 
		{
			return false;
		}	
		return pat.matcher(mobile).matches();
	}
//檢查員工其他資料欄
	@Override//檢查工作單位
	public Boolean Jobcheck(String job) {
		String Regjob="\\D{2,50}";
		Pattern pat=Pattern.compile(Regjob);
		
		if(pat.equals("")) 
		{
			return false;
		}		
		return pat.matcher(job).matches();
	}
	@Override//檢查到職日
	public Boolean Todcheck(String tod) {
		String Regtod="\\d{4}/\\d{2}/\\d{2}";
		Pattern pat=Pattern.compile(Regtod);
		if(pat.equals("")) 
		{
			return false;
		}		
		return pat.matcher(tod).matches();
	}
//檢查會員其他資料欄
	@Override//檢查忘記密碼
	public Boolean Forgetcheck(String forget) {
		String Regforget="[\\D0-9]{4,50}";
		Pattern pat=Pattern.compile(Regforget);
		if(pat.equals("")) 
		{
			return false;
		}		
		return pat.matcher(forget).matches();
	}
}
