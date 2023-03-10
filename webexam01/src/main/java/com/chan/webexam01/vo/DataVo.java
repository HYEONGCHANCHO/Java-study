package com.chan.webexam01.vo;

public class DataVo {
	private int age;
	private String Iname;
	private String address;
	private String gender;
	
	public DataVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataVo(int age, String iname, String address, String gender) {
		super();
		this.age = age;
		this.Iname = iname;
		this.address = address;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		this.Iname = iname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "DataVo [age=" + age + ", iname=" + Iname + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
}
