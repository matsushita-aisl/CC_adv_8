import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

public class LoggerTest {
	private static Logger logger;
	
	public static void main(String[] args){
		System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, args[0]);	//コマンドライン引数に応じてログレベル変更
		logger = LoggerFactory.getLogger(MethodHandles.lookup().toString()+".class");	//ログレベル変更後にオブジェクトを生成しないと変更が適用されない
		
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
	}
}
