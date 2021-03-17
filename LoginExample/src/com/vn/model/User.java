package com.vn.model;

import java.io.Serializable;

/**
 * 
 * @author Huy
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String uname;
	private String upass;

	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

}
