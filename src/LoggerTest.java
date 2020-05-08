import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

public class LoggerTest {
	private static Logger logger;
	
	public static void main(String[] args){
		System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "debug");
		logger = LoggerFactory.getLogger(MethodHandles.lookup().toString()+".class");
		
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
	}
}
