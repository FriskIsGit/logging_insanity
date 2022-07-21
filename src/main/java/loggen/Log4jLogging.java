package loggen;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF

public class Log4jLogging{
    private static final Logger logger = LogManager.getLogger(Log4jLogging.class);

    public static void main(String[] args){
        //testLog();
        loggingAttempt();
        printEnabledOptions(logger);
    }
    public static void loggingAttempt(){
        logger.trace("Le trace");
        logger.debug("Le debug");
        logger.info("Log info");
        logger.warn("Le warn");
        logger.error("Log error");
        logger.fatal("FATALITY");
    }

    private static void printEnabledOptions(Logger logger){
        System.out.println("-------------------------------------------");
        System.out.println("Is ALL enabled: "   + logger.isEnabled(Level.ALL));
        System.out.println("Is TRACE enabled: " + logger.isEnabled(Level.TRACE) + " equivalent is " + logger.isTraceEnabled());
        System.out.println("Is DEBUG enabled: " + logger.isEnabled(Level.DEBUG) + " equivalent is " + logger.isDebugEnabled());
        System.out.println("Is INFO enabled: "  + logger.isEnabled(Level.INFO)  + " equivalent is " + logger.isInfoEnabled());
        System.out.println("Is WARN enabled: "  + logger.isEnabled(Level.WARN));
        System.out.println("Is ERROR enabled: " + logger.isEnabled(Level.ERROR));
        System.out.println("Is FATAL enabled: " + logger.isEnabled(Level.FATAL));
        System.out.println("Is OFF enabled: "   + logger.isEnabled(Level.OFF));
    }
}