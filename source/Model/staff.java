package Model;

import java.io.Serializable;

public class staff implements Serializable{
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String job;
	private String address;
	private String birthday;
	private String mobile;
	private String tod;
	public staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public staff(String name, String username, String password, String job, String address, String birthday, String mobile, String tod) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.job=job;
		this.address = address;
		this.birthday = birthday;
		this.mobile = mobile;
		this.tod=tod;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) 
	{
		this.username=username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	

	public String getTod() 
	{
		return tod;
	}
	public void setTod(String Tod) 
	{
		this.tod=tod;
	}

}
