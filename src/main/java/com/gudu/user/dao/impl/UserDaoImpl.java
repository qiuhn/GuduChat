package com.gudu.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.gudu.base.BaseDaoImpl;
import com.gudu.user.dao.IUserDao;
import com.gudu.user.domain.User;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{



}
