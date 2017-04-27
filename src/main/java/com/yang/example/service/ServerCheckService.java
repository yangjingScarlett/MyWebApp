package com.yang.example.service;


import com.yang.example.model.ServerInfo;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

/**
 * @author Yangjing
 */
public interface ServerCheckService {
    ServerInfo[] check() throws MalformedURLException, UnknownHostException;
}
