//package com.laptrinhjavaweb.api.web;
//
//import com.laptrinhjavaweb.dto.AccountDTO;
//import com.laptrinhjavaweb.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController("ApiOfUser")
//public class UserAPI {
//
//    @Autowired
//    private IUserService userService;
//
//    @PostMapping("/api/account")
//    public AccountDTO createAccount(@RequestBody AccountDTO  accountDTO) {
//    	AccountDTO ac = userService.insert(accountDTO);
//    	System.out.println(ac);
//        return ac;
//    }
//}
