import java.time.ZonedDateTime;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/20 22:14
 * @Description:
 */
public class Test {

    @org.junit.Test
    public void getDate() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
