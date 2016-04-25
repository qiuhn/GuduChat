package com.gudu.user.service.impl;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Inject;

import com.gudu.account.dao.ILoginLogDao;
import com.gudu.account.domain.LoginLog;
import com.gudu.util.UUIDUtil;
import com.gudu.core.exception.AccountException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gudu.user.dao.IUserDao;
import com.gudu.user.domain.User;
import com.gudu.user.service.IUserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService{

	@Inject
	private IUserDao userDao;

	@Inject
	ILoginLogDao loginLogDao;
	

	public Serializable addUser(User user) {
		return userDao.save(user);
	}

	@Override
	public LoginLog login(String uesrname, String pwd, String mobileNo) throws AccountException {

		Object obj = userDao.uniqueResult(" from User u where u.username=? ", uesrname);
		if(obj == null){
			throw new AccountException(AccountException.CODE_USER_NOT_EXIST,AccountException.MESSAGE_USER_NOT_EXIST);
		}
		User user = (User) obj;
		if(!user.getPwd().equals(pwd)){
			throw new AccountException(AccountException.CODE_PWD_ERROR,AccountException.MESSAGE_PWD_ERROR);
		}
		String token = UUIDUtil.createUUID();
		LoginLog loginLog =new LoginLog(user,mobileNo,new Date(),token);
		loginLogDao.save(loginLog);
		return loginLog;
	}


}
