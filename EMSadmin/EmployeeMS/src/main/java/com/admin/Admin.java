package com.admin;

public class Admin {
	
	private int adid;
	private String name;
	private String email;
	private String mobile;
	private String userName;
	private String password;
	
	public Admin(int adid, String name, String email, String mobile, String userName, String password) {
		
		this.adid = adid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.userName = userName;
		this.password = password;
	}

	public int getAdid() {
		return adid;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}




}
