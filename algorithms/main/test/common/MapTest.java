package common;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * @desc
 * @author lirb
 * @datetime 2017/11/16,10:01
 */
public class MapTest {
    private static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm";
    /**
     * 若键不存在的话会返回null
     */
    @Test
    public void testMap(){
        Map<String, Object> map = new HashMap<>();
        System.out.println(map.get("hehe"));
    }

    /**
     * new Date().toString() - Thu Nov 16 14:58:04 CST 2017
     */
    @Test
    public void testDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATETIME_PATTERN);
        String result = simpleDateFormat.format(new Date());
        System.out.println(result);
    }
}
