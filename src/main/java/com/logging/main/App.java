package com.logging.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.debug("control arrived at main method");
        try{
            int x = 10 / 5;
          //  System.out.println("result: "+x);

            LOGGER.trace("result: {}",x);
            LOGGER.debug("result: {}",x); // debugging purpose
            LOGGER.info("result: {}",x); // use this for success
            LOGGER.warn("result: {}",x); // error use case
            LOGGER.error("result: {}",x); // error use case

        }
        catch (ArithmeticException e){
           // System.out.println("error occurred");
           // e.printStackTrace();
            LOGGER.error("error while executing: {}",e.toString(), e);
        }
    }
}
