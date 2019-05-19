package com.sda.java18.test;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static final Logger logger = LogManager.getLogger(com.sda.java18.loger.Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int someValue = scanner.nextInt();

        try {
            if (someValue > 10) {
                throw new InputMismatchException("Wartość większa niż 10");
            }
        } catch (InputMismatchException e){
            logger.log(Level.ERROR, "cos poszlo nie tak przy pobieraniu danych", e);
        }

    }
}
