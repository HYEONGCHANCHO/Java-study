package com.self2.DTO;

import java.util.Objects;

public class Dto {
	private  String user_name;
	private  String user_id;
	private  String user_pw;
	private  String user_phone;
	private  String user_addr;
	public Dto() {
		
	super();
		// TODO Auto-generated constructor stub
	}
	public Dto(String user_name, String user_id, String user_pw, String user_phone, String user_addr) {
		super();
		this.user_name = user_name;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_phone = user_phone;
		this.user_addr = user_addr;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
	@Override
	public int hashCode() {
		return Objects.hash(user_addr, user_id, user_name, user_phone, user_pw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dto other = (Dto) obj;
		return Objects.equals(user_addr, other.user_addr) && Objects.equals(user_id, other.user_id)
				&& Objects.equals(user_name, other.user_name) && Objects.equals(user_phone, other.user_phone)
				&& Objects.equals(user_pw, other.user_pw);
	}
	@Override
	public String toString() {
		return "Dto [user_name=" + user_name + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_phone="
				+ user_phone + ", user_addr=" + user_addr + "]";
	}
	
	
}
