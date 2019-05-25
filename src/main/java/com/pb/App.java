package com.pb;

import com.pb.dao.Repository;
import com.pb.service.ServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

//    Конфигурирование Log4j2
//    Конфигурационные файлы будут искаться в classpath.
//    Порядок просмотра файлов при поиске конфигурационных настроек (поиск осуществляется вероятно, до первого найденного файла):
//            log4j.configurationFile (в документации этот файл обозначен как system property)
//    log4j2-test.properties
//    log4j2-test.yaml or log4j2-test.yml
//    log4j2-test.json or log4j2-test.jsn
//    log4j2-test.xml
//    log4j2.properties
//    log4j2.yaml or log4j2.yml
//    log4j2.json or log4j2.jsn
//    log4j2.xml
//    DefaultConfiguration – используется если не будет найдено ни одного файла, при этом вывод будет осуществляться на консоль

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
