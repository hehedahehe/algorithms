package common;

import org.apache.log4j.Logger;
import org.junit.Test;

/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,13:39
 */
public class Log4jTest {
    private Logger  logger = Logger.getLogger(Log4jTest.class);

    @Test
    public void testLog(){
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }

}
