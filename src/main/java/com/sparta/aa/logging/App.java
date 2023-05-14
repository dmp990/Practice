package com.sparta.aa.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        logger.setUseParentHandlers(false);

        logger.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        logger.log(Level.INFO, "This is an info message");
        logger.log(Level.WARNING, "This is a warning message");
        logger.log(Level.FINE, "This is a fine message");
    }
}
