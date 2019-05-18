package com.sda.java18.loger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static final Logger logger = LogManager.getLogger(Main.class.getName());


    public static void main(String[] args) {
        // Set up a simple configuration that logs on the console.


        logger.log(Level.ALL, "Log message on ALL level");
        logger.log(Level.TRACE, "Log message on TRACE level");
        logger.log(Level.DEBUG, "Log message on DEBUG level");
        logger.log(Level.INFO, "Log message on INFO level");
        logger.log(Level.WARN, "Log message on WARN level");
        logger.log(Level.ERROR, "Log message on ERROR level");
        logger.log(Level.FATAL, "Log message on FATAL level");
    }
}
