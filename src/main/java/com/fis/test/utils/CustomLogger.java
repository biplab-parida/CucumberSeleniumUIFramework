package com.fis.test.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author biplab
 * @desc used for logging
 *
 */
public class CustomLogger {

	    //Initialize Log4j instance
	    private static final Logger CustomLogger =  LogManager.getLogger(CustomLogger.class);

	    //Info Level Logs
	    public static void info (String message) {
	    	CustomLogger.info(message);
	    }

	    //Warn Level Logs
	    public static void warn (String message) {
	    	CustomLogger.warn(message);
	    }

	    //Error Level Logs
	    public static void error (String message) {
	    	CustomLogger.error(message);
	    }

	
	
}
