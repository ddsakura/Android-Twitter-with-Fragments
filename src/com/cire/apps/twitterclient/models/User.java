
package com.cire.apps.twitterclient.models;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class User {

    @JsonProperty("name")
    private String name;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("profile_background_tile")
    private Boolean profileBackgroundTile;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("location")
    private String location;
    @JsonProperty("follow_request_sent")
    private Boolean followRequestSent;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("is_translator")
    private Boolean isTranslator;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("default_profile")
    private Boolean defaultProfile;
    @JsonProperty("url")
    private String url;
    @JsonProperty("contributors_enabled")
    private Boolean contributorsEnabled;
    @JsonProperty("favourites_count")
    private Integer favouritesCount;
    @JsonProperty("profile_image_url_https")
    private String profileImageUrlHttps;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("listed_count")
    private Integer listedCount;
    @JsonProperty("profile_use_background_image")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("geo_enabled")
    private Boolean geoEnabled;
    @JsonProperty("notifications")
    private Boolean notifications;
    @JsonProperty("description")
    private String description;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profile_banner_url")
    private String profileBannerUrl;
    @JsonProperty("statuses_count")
    private Integer statusesCount;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("default_profile_image")
    private Boolean defaultProfileImage;
    @JsonProperty("friends_count")
    private Integer friendsCount;
    @JsonProperty("following")
    private Boolean following;
    @JsonProperty("show_all_inline_media")
    private Boolean showAllInlineMedia;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return
     *         The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     *         The profileSidebarFillColor
     */
    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    /**
     * @param profileSidebarFillColor
     *            The profile_sidebar_fill_color
     */
    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    /**
     * @return
     *         The profileBackgroundTile
     */
    @JsonProperty("profile_background_tile")
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    /**
     * @param profileBackgroundTile
     *            The profile_background_tile
     */
    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    /**
     * @return
     *         The profileSidebarBorderColor
     */
    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    /**
     * @param profileSidebarBorderColor
     *            The profile_sidebar_border_color
     */
    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    /**
     * @return
     *         The profileImageUrl
     */
    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * @param profileImageUrl
     *            The profile_image_url
     */
    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

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
     *         The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     *            The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     *         The followRequestSent
     */
    @JsonProperty("follow_request_sent")
    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    /**
     * @param followRequestSent
     *            The follow_request_sent
     */
    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
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
     *         The isTranslator
     */
    @JsonProperty("is_translator")
    public Boolean getIsTranslator() {
        return isTranslator;
    }

    /**
     * @param isTranslator
     *            The is_translator
     */
    @JsonProperty("is_translator")
    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    /**
     * @return
     *         The profileLinkColor
     */
    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    /**
     * @param profileLinkColor
     *            The profile_link_color
     */
    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    /**
     * @return
     *         The defaultProfile
     */
    @JsonProperty("default_profile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    /**
     * @param defaultProfile
     *            The default_profile
     */
    @JsonProperty("default_profile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    /**
     * @return
     *         The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return
     *         The contributorsEnabled
     */
    @JsonProperty("contributors_enabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    /**
     * @param contributorsEnabled
     *            The contributors_enabled
     */
    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    /**
     * @return
     *         The favouritesCount
     */
    @JsonProperty("favourites_count")
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    /**
     * @param favouritesCount
     *            The favourites_count
     */
    @JsonProperty("favourites_count")
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     * @return
     *         The profileImageUrlHttps
     */
    @JsonProperty("profile_image_url_https")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     * @param profileImageUrlHttps
     *            The profile_image_url_https
     */
    @JsonProperty("profile_image_url_https")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    /**
     * @return
     *         The listedCount
     */
    @JsonProperty("listed_count")
    public Integer getListedCount() {
        return listedCount;
    }

    /**
     * @param listedCount
     *            The listed_count
     */
    @JsonProperty("listed_count")
    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    /**
     * @return
     *         The profileUseBackgroundImage
     */
    @JsonProperty("profile_use_background_image")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    /**
     * @param profileUseBackgroundImage
     *            The profile_use_background_image
     */
    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    /**
     * @return
     *         The profileTextColor
     */
    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    /**
     * @param profileTextColor
     *            The profile_text_color
     */
    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    /**
     * @return
     *         The followersCount
     */
    @JsonProperty("followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * @param followersCount
     *            The followers_count
     */
    @JsonProperty("followers_count")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * @return
     *         The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * @param lang
     *            The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return
     *         The _protected
     */
    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * @param _protected
     *            The protected
     */
    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    /**
     * @return
     *         The geoEnabled
     */
    @JsonProperty("geo_enabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    /**
     * @param geoEnabled
     *            The geo_enabled
     */
    @JsonProperty("geo_enabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    /**
     * @return
     *         The notifications
     */
    @JsonProperty("notifications")
    public Boolean getNotifications() {
        return notifications;
    }

    /**
     * @param notifications
     *            The notifications
     */
    @JsonProperty("notifications")
    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }

    /**
     * @return
     *         The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     *         The profileBackgroundColor
     */
    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    /**
     * @param profileBackgroundColor
     *            The profile_background_color
     */
    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    /**
     * @return
     *         The verified
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * @param verified
     *            The verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * @return
     *         The profileBackgroundImageUrlHttps
     */
    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    /**
     * @param profileBackgroundImageUrlHttps
     *            The profile_background_image_url_https
     */
    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    /**
     * @return
     *         The statusesCount
     */
    @JsonProperty("statuses_count")
    public Integer getStatusesCount() {
        return statusesCount;
    }

    /**
     * @param statusesCount
     *            The statuses_count
     */
    @JsonProperty("statuses_count")
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    /**
     * @return
     *         The profileBackgroundImageUrl
     */
    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    /**
     * @param profileBackgroundImageUrl
     *            The profile_background_image_url
     */
    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    /**
     * @return
     *         The defaultProfileImage
     */
    @JsonProperty("default_profile_image")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    /**
     * @param defaultProfileImage
     *            The default_profile_image
     */
    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    /**
     * @return
     *         The friendsCount
     */
    @JsonProperty("friends_count")
    public Integer getFriendsCount() {
        return friendsCount;
    }

    /**
     * @param friendsCount
     *            The friends_count
     */
    @JsonProperty("friends_count")
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    /**
     * @return
     *         The following
     */
    @JsonProperty("following")
    public Boolean getFollowing() {
        return following;
    }

    /**
     * @param following
     *            The following
     */
    @JsonProperty("following")
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    /**
     * @return
     *         The showAllInlineMedia
     */
    @JsonProperty("show_all_inline_media")
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    /**
     * @param showAllInlineMedia
     *            The show_all_inline_media
     */
    @JsonProperty("show_all_inline_media")
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    /**
     * @return
     *         The screenName
     */
    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("profile_banner_url")
    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    @JsonProperty("profile_banner_url")
    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    /**
     * @param screenName
     *            The screen_name
     */
    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
