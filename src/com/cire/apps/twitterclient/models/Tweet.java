
package com.cire.apps.twitterclient.models;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tweet {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("text")
    private String text;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("source")
    private String source;
    @JsonProperty("user")
    private User user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return
     *         The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     *            The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     *         The favorited
     */
    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * @param favorited
     *            The favorited
     */
    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * @return
     *         The idStr
     */
    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    /**
     * @param idStr
     *            The id_str
     */
    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     * @return
     *         The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @param text
     *            The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return
     *         The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     *         The retweetCount
     */
    @JsonProperty("retweet_count")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    /**
     * @param retweetCount
     *            The retweet_count
     */
    @JsonProperty("retweet_count")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     * @return
     *         The retweeted
     */
    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     * @param retweeted
     *            The retweeted
     */
    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * @return
     *         The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @param source
     *            The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return
     *         The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * @param user
     *            The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @Override
    public String toString() {
        return getText() + " - " + getUser().getScreenName();
    }

}
