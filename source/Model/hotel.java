package Model;

import java.sql.Date;

public class hotel {
	private Integer id;
	private String name;
	private String mobile;
	private Integer h1;
	private Integer h2;
	private Integer h4;
	private Integer d;
	private Date hdate;
	public hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hotel(String name, String mobile, Integer h1, Integer h2, Integer h4, Integer d,Date hdate) {
		super();
		if(h1>=0&&h2>=0&&h4>=0) 
		{
			this.name = name;
			this.mobile = mobile;
			this.h1 = h1;
			this.h2 = h2;
			this.h4 = h4;
			this.d=d;
			this.hdate=hdate;
		}
		
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getH1() {
		return h1;
	}
	public void setH1(Integer h1) {
		this.h1 = h1;
	}
	public Integer getH2() {
		return h2;
	}
	public void setH2(Integer h2) {
		this.h2 = h2;
	}
	public Integer getH4() {
		return h4;
	}
	public void setH4(Integer h4) {
		this.h4 = h4;
	}
	public Integer getD() {
		return d;
	}
	public void setD(Integer d) {
		this.d = d;
	}
	public Date getHdate() {
		return hdate;
	}
	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}
	
	

}
