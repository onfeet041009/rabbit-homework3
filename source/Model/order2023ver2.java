package Model;

import java.sql.Date;

public class order2023ver2{
	//field
			private Integer id;
			private String name;
			private String address;
			private Integer a0;
			private Integer a1;
			private Integer a2;
			private Integer a3;
			private Integer a4;
			private Integer a5;
			private Integer a6;
			private Integer a7;
			private Integer a8;
			private Integer a9;
			private Date odate;
		//constructors
			public order2023ver2() {
				super();
				// TODO Auto-generated constructor stub
			}
		public order2023ver2(String name, String address, Integer a0, Integer a1, Integer a2, Integer a3, Integer a4,
				Integer a5, Integer a6, Integer a7, Integer a8, Integer a9,Date odate) 
		{
			super();
			if(a0>=0&&a1>=0&&a2>=0&&a3>=0&&a4>=0&&a5>=0&&a6>=0&&a7>=0&&a8>=0&&a9>=0) 
			{
				this.name = name;
				this.address = address;
				this.a0 = a0;
				this.a1 = a1;
				this.a2 = a2;
				this.a3 = a3;
				this.a4 = a4;
				this.a5 = a5;
				this.a6 = a6;
				this.a7 = a7;
				this.a8 = a8;
				this.a9 = a9;
				this.odate=odate;
			}
		}
		//methods
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Integer getA0() {
			return a0;
		}
		public void setA0(Integer a0) {
			this.a0 = a0;
		}
		public Integer getA1() {
			return a1;
		}
		public void setA1(Integer a1) {
			this.a1 = a1;
		}
		public Integer getA2() {
			return a2;
		}
		public void setA2(Integer a2) {
			this.a2 = a2;
		}
		public Integer getA3() {
			return a3;
		}
		public void setA3(Integer a3) {
			this.a3 = a3;
		}
		public Integer getA4() {
			return a4;
		}
		public void setA4(Integer a4) {
			this.a4 = a4;
		}
		public Integer getA5() {
			return a5;
		}
		public void setA5(Integer a5) {
			this.a5 = a5;
		}
		public Integer getA6() {
			return a6;
		}
		public void setA6(Integer a6) {
			this.a6 = a6;
		}
		public Integer getA7() {
			return a7;
		}
		public void setA7(Integer a7) {
			this.a7 = a7;
		}
		public Integer getA8() {
			return a8;
		}
		public void setA8(Integer a8) {
			this.a8 = a8;
		}
		public Integer getA9() {
			return a9;
		}
		public void setA9(Integer a9) {
			this.a9 = a9;
		}
		public Date getOdate() {
			return odate;
		}
		public void setOdate(Date odate) {
			this.odate = odate;
		}

}
