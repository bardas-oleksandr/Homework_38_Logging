package com.pb;

import com.pb.dao.Repository;
import com.pb.service.ServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Start");

        LOG.debug("debug message", new IllegalStateException("exception message"));

        LOG.info("info message", new IllegalStateException("exception message"));

        LOG.warn("warn message", new IllegalStateException("exception message"));

        LOG.error("error message", new IllegalStateException("exception message"));

        Repository repository = new Repository();
        repository.doNothing();

        ServiceImpl service = new ServiceImpl();
        service.doNothing();

        System.out.println("End");
    }
}
