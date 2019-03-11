package entity;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * @Author: fansy
 * @Time: 2019/3/11 17:17
 * @Email: fansy1990@foxmail.com
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private static final ObjectMapper mapper = new ObjectMapper();
    @JsonProperty("CreationDate")
    private String CreationDate;
    @JsonProperty("Views")
    private Integer Views;
    @JsonProperty("AccountId")
    private Integer AccountId;
    @JsonProperty("AboutMe")
    private String AboutMe;

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public Integer getViews() {
        return Views;
    }

    public void setViews(Integer views) {
        Views = views;
    }

    public Integer getAccountId() {
        return AccountId;
    }

    public void setAccountId(Integer accountId) {
        AccountId = accountId;
    }

    public String getAboutMe() {
        return AboutMe;
    }

    public void setAboutMe(String aboutMe) {
        AboutMe = aboutMe;
    }

    public String getWebsiteUrl() {
        return WebsiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        WebsiteUrl = websiteUrl;
    }

    public String getLastAccessDate() {
        return LastAccessDate;
    }

    public void setLastAccessDate(String lastAccessDate) {
        LastAccessDate = lastAccessDate;
    }

    public Integer getUpVotes() {
        return UpVotes;
    }

    public void setUpVotes(Integer upVotes) {
        UpVotes = upVotes;
    }

    public String getProfileImageUrl() {
        return ProfileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        ProfileImageUrl = profileImageUrl;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getReputation() {
        return Reputation;
    }

    public void setReputation(Integer reputation) {
        Reputation = reputation;
    }

    public Integer getDownVotes() {
        return DownVotes;
    }

    public void setDownVotes(Integer downVotes) {
        DownVotes = downVotes;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
    @JsonProperty("WebsiteUrl")
    private String WebsiteUrl;
    @JsonProperty("LastAccessDate")
    private String LastAccessDate;
    @JsonProperty("UpVotes")
    private Integer UpVotes;
    @JsonProperty("ProfileImageUrl")
    private String ProfileImageUrl;
    @JsonProperty("Id")
    private Integer Id;
    @JsonProperty("Reputation")
    private Integer Reputation;
    @JsonProperty("DownVotes")
    private  Integer DownVotes;
    @JsonProperty("Location")
    private String Location;

    @JsonProperty("DisplayName")
    private String DisplayName;

    public static final User fromJsonDoc(String jsonDoc) throws IOException {
//        mapper.configure(SerializationConfig.Feature.USE_ANNOTATIONS,true);
        return mapper.readValue(jsonDoc,User.class);
//        return mapper.treeToValue(rootNode, User.class);
    }

    @Override
    public String toString() {
        return "User{" +
                "CreationDate='" + CreationDate + '\'' +
                ", Views=" + Views +
                ", AccountId=" + AccountId +
                ", AboutMe='" + AboutMe + '\'' +
                ", WebsiteUrl='" + WebsiteUrl + '\'' +
                ", LastAccessDate='" + LastAccessDate + '\'' +
                ", UpVotes=" + UpVotes +
                ", ProfileImageUrl='" + ProfileImageUrl + '\'' +
                ", Id=" + Id +
                ", Reputation=" + Reputation +
                ", DownVotes=" + DownVotes +
                ", Location='" + Location + '\'' +
                '}';
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }
}
