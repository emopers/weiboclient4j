package weiboclient4j;

import org.junit.Test;
import static weiboclient4j.utils.JsonUtils.parseJsonObject;

/**
 * @author Hover Ruan
 */
public class ParseUserTest extends AbstractParseJsonTest {

    @Test
    public void testParseUser() throws Exception {
        String content = readResource("/weiboclient4j/users.json");
        parseJsonObject(content, User.class);
    }

    @Test
    public void testParseUserList() throws Exception {
        String content = readResource("/weiboclient4j/user_list.json");
        parseJsonObject(content, WeiboClient.TYPE_USER_LIST);
    }
}
