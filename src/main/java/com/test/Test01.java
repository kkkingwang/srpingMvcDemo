package com.test;

import org.apache.log4j.Logger;

public class Test01 {
    private static Logger log=Logger.getLogger(Test01.class);
    public static void main(String[] args) {

        log.info("this is info message");
        log.debug("this is debug message");
        log.warn("this is warn message");
        log.error("this is error message");
    }
}
