package loggen;

import other.Util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultLogging{

    private static final Logger logger = Logger.getLogger(Log4jLogging.class.getName());

    public static void main(String[] args){
    }
    private static void displayLevels(){
        System.out.println("Is ALL enabled: " + logger.isLoggable(Level.ALL));
        System.out.println("Is FINEST enabled: " + logger.isLoggable(Level.FINEST));
        System.out.println("Is FINER enabled: " + logger.isLoggable(Level.FINER));
        System.out.println("Is FINE enabled: " + logger.isLoggable(Level.FINE));
        System.out.println("Is CONFIG enabled: " + logger.isLoggable(Level.CONFIG));
        System.out.println("Is INFO enabled: " + logger.isLoggable(Level.INFO));
        System.out.println("Is WARNING enabled: " + logger.isLoggable(Level.WARNING));
        System.out.println("Is SEVERE enabled: " + logger.isLoggable(Level.SEVERE));
        System.out.println("Is OFF enabled: " + logger.isLoggable(Level.OFF));
    }
}
