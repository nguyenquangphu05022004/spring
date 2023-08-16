//package com.laptrinhjavaweb.service.impl;
//
//import com.laptrinhjavaweb.constant.SystemConstant;
//import com.laptrinhjavaweb.converter.UserConverter;
//import com.laptrinhjavaweb.entity.AccountEntity;
//import com.laptrinhjavaweb.repository.RoleRepository;
//import com.laptrinhjavaweb.repository.UserRepository;
//import com.laptrinhjavaweb.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserService implements IUserService {
//
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private UserConverter userConverter;
//    @Autowired
//    private RoleRepository roleRepository;
//    @Override
//    public AccountDTO insert(AccountDTO newAccount) {
//    	String password = new BCryptPasswordEncoder().encode(newAccount.getPassWord());
//        AccountEntity oldAccount = userRepository.findOneByUserNameAndStatus(
//                newAccount.getUserName(), SystemConstant.ACTIVE_STATUS);
//        AccountDTO accountDTO = null;
//        if(oldAccount == null) {
//            newAccount.setStatus(SystemConstant.ACTIVE_STATUS);
//            accountDTO = newAccount;
//            AccountEntity entity = userConverter.toEntity(accountDTO);
//            entity.setStatus(SystemConstant.ACTIVE_STATUS);
//            entity.setPassWord(password);
//            entity.getRoles().add(roleRepository.findOneByCode("USER"));
//            return userConverter.toDto(userRepository.save(entity));
//        }
//        return null;
//
//    }
//
//
//}
