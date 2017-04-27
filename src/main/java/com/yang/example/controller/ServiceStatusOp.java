package com.yang.example.controller;

/**
 * @author Yangjing
 */
public class ServiceStatusOp extends StatusOp {
    public ServiceStatusOp(String url) {
        this.url = url;
    }

    @Override
    public boolean determined(String body) {
        if (body != null) {
            return true;
        } else {
            return false;
        }
    }
}
