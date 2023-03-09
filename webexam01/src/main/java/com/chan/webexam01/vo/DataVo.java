package com.chan.webexam01.vo;

public class DataVo {
	private int age;
	private String iname;
	private String address;
	private String gender;
	
	public DataVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataVo(int age, String iname, String address, String gender) {
		super();
		this.age = age;
		this.iname = iname;
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
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
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
	
	
}
