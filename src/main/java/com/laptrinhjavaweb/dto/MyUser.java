package com.laptrinhjavaweb.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MyUser extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	public MyUser(String username, String password, boolean enabled, 
			boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities,
			String fullName) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.fullName = fullName;
		// TODO Auto-generated constructor stub
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
