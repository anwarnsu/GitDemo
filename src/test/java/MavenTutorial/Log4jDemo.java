package MavenTutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Log4jDemo {
	private static Logger logger=LogManager.getLogger(Log4jDemo.class);
	/*
	 * Create a instance for
	 * logger class. Make sure import appache logging dependencies. In the argument
	 * we pass the class. We are saying that we want to create a logger for this
	 * particular class. Using the logger variable we can get logger commands.
	 */
	public static void main(String[] args) {
		

		
System.out.println("\n  Hello World...!   \n");
		
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an fatal message");
		
		// printing methods:
	    logger.trace("trace message");
	    logger.debug("debug message");
	    logger.info("info message");
	    logger.warn("warn message");
	    logger.error("error message");
	    logger.fatal("fatal message");
	    
	    
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.fatal("This is fatal message");
        logger.error("This is error message");
	    
	    
		
		System.out.println("\n Completed  \n");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
