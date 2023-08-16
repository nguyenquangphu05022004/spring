package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.dto.MyUser;
import com.laptrinhjavaweb.entity.AccountEntity;
import com.laptrinhjavaweb.entity.RoleEntity;
import com.laptrinhjavaweb.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		AccountEntity accountEntity = userRepository.
					findOneByUserNameAndStatus(username, SystemConstant.ACTIVE_STATUS);
		if(accountEntity == null) {
			throw new UsernameNotFoundException("User not found");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (RoleEntity role : accountEntity.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		//put thong tin khi nguoi dung dang nhap vao he thong
		MyUser myUser = new MyUser(accountEntity.getUserName(), 
								accountEntity.getPassWord(), true, 
								true, true, true, authorities, 
								accountEntity.getFullName());
		return myUser;
	}

}
