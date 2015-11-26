package com.gudu.account.api;


import com.gudu.core.response.Response;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (c) 2014 518.cn Inc. All rights
 */

@RequestMapping(value = "account")
public interface AccountApi {


    @RequestMapping(value = "/login/{username}/{pwd}/{mobieNo}")
    @ResponseBody
    public Response login(@PathVariable("username") String username, @PathVariable("pwd") String pwd, @PathVariable("mobieNo") String mobieNo);


    @RequestMapping(value = "login")
    public String login();


}




