import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

public class LggerTest {
	private static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().toString()+".class");
	
	
	public static void main(String[] args){
		System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "trace");
		System.out.println(logger.isTraceEnabled()+logger.ROOT_LOGGER_NAME);		
		
		
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
	}
}
