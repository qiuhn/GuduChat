package com.gudu.account.api.impl;

import com.gudu.account.api.AccountApi;
import com.gudu.account.pojo.UserPojo;
import com.gudu.core.exception.AccountException;
import com.gudu.core.response.Response;
import com.gudu.user.service.IUserService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class AccountApiImpl implements AccountApi {

    @Inject
    private IUserService userService;

    @Override
      public Response login(String username, String pwd, String mobieNo) {
        System.out.println("login................");
        Response response = new Response();
        try {
            UserPojo pojo = new UserPojo();
            pojo.toUserPojo(userService.login(username, pwd, mobieNo));
            response.setObj(pojo);
        } catch (AccountException e) {
            response.setCode(e.getCode());
        }
        return response;
    }

    @Override
    public String login() {
        System.out.println("login................");
        return "index";
    }
}
