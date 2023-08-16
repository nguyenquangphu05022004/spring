package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.RoleDTO;

public interface IRoleService {
	RoleDTO findOneByCode(String code);
}
