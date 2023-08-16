//package com.laptrinhjavaweb.converter;
//
//import org.springframework.stereotype.Component;
//
//import com.laptrinhjavaweb.entity.AccountEntity;
//
//@Component
//public class UserConverter {
//    public AccountDTO toDto(AccountEntity accountEntity) {
//        AccountDTO result = new AccountDTO();
//        result.setFullName(accountEntity.getFullName());
//        result.setPassWord(accountEntity.getPassWord());
//        result.setUserName(accountEntity.getUserName());
//        result.setStatus(accountEntity.getStatus());
//        return result;
//    }
//    public AccountEntity toEntity(AccountDTO accountDTO) {
//        AccountEntity result = new AccountEntity();
//        result.setFullName(accountDTO.getFullName());
//        result.setPassWord(accountDTO.getPassWord());
//        result.setUserName(accountDTO.getUserName());
//        result.setStatus(accountDTO.getStatus());
//        return result;
//    }
//}
