package entity;

import java.io.IOException;

/**
 * @Author: fansy
 * @Time: 2019/3/11 17:58
 * @Email: fansy1990@foxmail.com
 */
public class UserTest {
    public static void main(String[] args) throws IOException {
        String aaa ="{\"CreationDate\":\"2016-01-12T18:02:28.700\",\"Views\":243,\"AccountId\":34933,\"AboutMe\":\"<p><a href=\\\"http://blog.stackoverflow.com/2010/04/welcome-stack-overflow-valued-associate-00005/\\\">Stack Exchange Valued Associate #00005<\\/a><\\/p>\\n\\n<p>I am the Director of Community Development for the Stack Exchange Network.<\\/p>\\n\\n<p>I can be reached at<br>\\n<b>&#114;&#99;&#97;&#114;&#116;&#97;&#105;&#110;&#111;&#64;&#115;&#116;&#97;&#99;&#107;&#101;&#120;&#99;&#104;&#97;&#110;&#103;&#101;&#46;&#99;&#111;&#109;<\\/b><\\/p>\\n\",\"DisplayName\":\"Robert Cartaino\",\"Id\":1,\"Reputation\":101,\"LastAccessDate\":\"2018-07-27T20:45:16.343\",\"DownVotes\":14,\"UpVotes\":0,\"ProfileImageUrl\":\"https://www.gravatar.com/avatar/2cf2eee5993f6cf3b0b149c2f8c5a323?s=128&d=identicon&r=PG\",\"Location\":\"Palm Bay, FL\"} ";
//        ObjectMapper mapper = new ObjectMapper();
        User u = User.fromJsonDoc(aaa);
        System.out.println(User.fromJsonDoc(aaa));
        System.out.println();
        System.out.println(u.toCustomString());

    }
}
