package com.sda.java18.observer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverDemo {

    static final Logger logger = LogManager.getLogger(ObserverDemo.class.getName());

    public static void main(String[] args) {
        System.out.println("Enter Text: ");

        EventSource eventSource = new EventSource();

        eventSource.addObserver(event -> {
            logger.log(Level.INFO, "Received response: " + event);
        });

        eventSource.addObserver(new Observer() {
            @Override
            public void update(String event) {
                logger.log(Level.INFO, "Wykonuje jakies operacje" + event);
            }
        });

        eventSource.scanSystemIn();
    }

}
