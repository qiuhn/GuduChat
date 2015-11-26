package com.gudu.user.service;

import java.io.Serializable;

import com.gudu.account.domain.LoginLog;
import com.gudu.core.exception.AccountException;
import com.gudu.user.domain.User;

public interface IUserService {
	
	Serializable addUser(User user);

	LoginLog login(String uesrname, String pwd, String mobileNo) throws AccountException;
}
