package entity;

import java.io.IOException;

/**
 * @Author: fansy
 * @Time: 2019/3/11 17:58
 * @Email: fansy1990@foxmail.com
 */
public class UserTest {
    public static void main(String[] args) throws IOException {
        String aaa ="{\"CreationDate\":\"2016-01-11T22:16:10.830\",\"Views\":0,\"AccountId\":-1,\"AboutMe\":\"<p>Hi, I'm not really a person.<\\/p>\\r\\n<p>I'm a background process that helps keep this site clean!<\\/p>\\r\\n<p>I do things like<\\/p>\\r\\n<ul>\\r\\n<li>Randomly poke old unanswered questions every hour so they get some attention<\\/li>\\r\\n<li>Own community questions and answers so nobody gets unnecessary reputation from them<\\/li>\\r\\n<li>Own downvotes on spam/evil posts that get permanently deleted<\\/li>\\r\\n<li>Own suggested edits from anonymous users<\\/li>\\r\\n<li><a href=\\\"http://meta.stackoverflow.com/a/92006\\\">Remove abandoned questions<\\/a><\\/li>\\r\\n<\\/ul>\",\"DisplayName\":\"Community\",\"Id\":-1,\"Reputation\":1,\"LastAccessDate\":\"2016-01-11T22:16:10.830\",\"DownVotes\":1327,\"UpVotes\":46,\"Location\":\"on the server farm\"}";
//        ObjectMapper mapper = new ObjectMapper();
        User u = User.fromJsonDoc(aaa);
        System.out.println(User.fromJsonDoc(aaa));
    }
}
