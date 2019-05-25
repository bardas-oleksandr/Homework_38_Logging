package com.pb.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Repository {
    private static final Logger LOG = LogManager.getLogger(Repository.class);

    public void doNothing(){
        LOG.info("this will not be stored");

        LOG.error("First error message");

        LOG.error("Second error message", new NullPointerException("Exception message"));

    }
}
