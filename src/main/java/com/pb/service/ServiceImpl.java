package com.pb.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceImpl {

    private static final Logger LOG = LogManager.getLogger(ServiceImpl.class);

    public void doNothing(){
        LOG.error("error message", new IllegalStateException("exception message"));
    }
}
