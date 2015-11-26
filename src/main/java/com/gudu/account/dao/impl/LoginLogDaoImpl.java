package com.gudu.account.dao.impl;

import com.gudu.account.dao.ILoginLogDao;
import com.gudu.account.domain.LoginLog;
import com.gudu.base.BaseDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by qiuhn on 2015/9/21.
 */
@Repository("loginLogDao")
public class LoginLogDaoImpl extends BaseDaoImpl<LoginLog> implements ILoginLogDao {



}
