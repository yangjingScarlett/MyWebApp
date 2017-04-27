package com.yang.example.controller;

import com.yang.example.model.Account;
import com.yang.example.model.ServerInfo;
import com.yang.example.model.User;
import com.yang.example.service.ServerCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * @author Yangjing
 */
@RestController
public class AnythingController {
    @Autowired
    ServerCheckService serverCheckService;

    @RequestMapping(value="/test/user")
    @ResponseBody
    public User getUser(){
        Date birthDate=new Date(1976,07,21);
        User user=new User(1,"沙瑞金","男",birthDate);
        return user;
    }

    @RequestMapping(value="/test/server")
    @ResponseBody
    public ServerInfo[] getServerInfo() throws MalformedURLException, UnknownHostException {
        return serverCheckService.check();
    }

    @RequestMapping(value="/test/account")
    @ResponseBody
    public Account getAccount(){
        return new Account(1,"yangyang","12345678");
    }
}
