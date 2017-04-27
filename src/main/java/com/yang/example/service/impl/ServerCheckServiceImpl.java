package com.yang.example.service.impl;

import com.yang.example.controller.StatusOp;
import com.yang.example.controller.StatusOpFactory;
import com.yang.example.model.ServerInfo;
import com.yang.example.service.PropertyUtil;
import com.yang.example.service.ServerCheckService;
import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 */
@Service
public class ServerCheckServiceImpl implements ServerCheckService {

    public ServerInfo[] check() {
        String str= PropertyUtil.getProperty("urls");
        String arrayList[] = str.split(";");
        ServerInfo[] serverInfos = new ServerInfo[arrayList.length];
        for (int i = 0; i < serverInfos.length; i++) {
            String arrayUrl[] = arrayList[i].split("\\|");
            StatusOp opCreate= StatusOpFactory.createStatusOp(arrayUrl[0],arrayUrl[1]);
            serverInfos[i] = new ServerInfo(arrayUrl[0], arrayUrl[1]);
            serverInfos[i].setActive(opCreate.getStatus());
            }
             return serverInfos;
        }
    }