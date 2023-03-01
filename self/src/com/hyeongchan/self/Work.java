package com.hyeongchan.self;

import java.util.Objects;

public class Work {

	private int iage;
	private String iName;
	
	public void prn() {
		iage=27;
		iName="ChoHyeongChan";
		System.out.println("My name is"+iName+"I'm"+iage+"years old");
		return;
	}

	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Work(int iage, String iName) {
		super();
		this.iage = iage;
		this.iName = iName;
	}

	public int getIage() {
		return iage;
	}

	public void setIage(int iage) {
		this.iage = iage;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(iName, iage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Work other = (Work) obj;
		return Objects.equals(iName, other.iName) && iage == other.iage;
	}

	@Override
	public String toString() {
		return "Work [iage=" + iage + ", iName=" + iName + "]";
	}
	
}
