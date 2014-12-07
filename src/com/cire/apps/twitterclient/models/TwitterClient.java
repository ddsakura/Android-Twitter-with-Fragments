
package com.cire.apps.twitterclient.models;

import org.scribe.builder.api.Api;
import org.scribe.builder.api.TwitterApi;

import android.content.Context;

import com.codepath.oauth.OAuthBaseClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

/*
 * 
 * This is the object responsible for communicating with a REST API. 
 * Specify the constants below to change the API being communicated with.
 * See a full list of supported API classes: 
 *   https://github.com/fernandezpablo85/scribe-java/tree/master/src/main/java/org/scribe/builder/api
 * Key and Secret are provided by the developer site for the given API i.e dev.twitter.com
 * Add methods for each relevant endpoint in the API.
 * 
 * NOTE: You may want to rename this object based on the service i.e TwitterClient or FlickrClient
 * 
 */
public class TwitterClient extends OAuthBaseClient {
    public static final Class<? extends Api> REST_API_CLASS = TwitterApi.class; // Change this
    public static final String REST_URL = "https://api.twitter.com/1.1"; // Change this, base API URL
    public static final String REST_CONSUMER_KEY = "ooI7rV4iINzFiV1pVEdR22T8O"; // Change this
    public static final String REST_CONSUMER_SECRET = "lEKXk6PM1w4r8Mn7zSQaxUWDRa8jSaL3RxgLHgmzRJ8DLGgMKN"; // Change this
    public static final String REST_CALLBACK_URL = "oauth://cpbasictweets"; // Change this (here and in manifest)

    public TwitterClient(Context context) {
        super(context, REST_API_CLASS, REST_URL, REST_CONSUMER_KEY, REST_CONSUMER_SECRET, REST_CALLBACK_URL);
    }

    public void getHomeTimeline(AsyncHttpResponseHandler handler, String max_id) {
        String apiUrl = getApiUrl("statuses/home_timeline.json");
        if (max_id != null) {
            apiUrl = apiUrl + "?max_id=" + max_id;
        }
        client.get(apiUrl, null, handler);
    }

    public void getUserTimeline(AsyncHttpResponseHandler handler, String screen_name, String max_id) {
        String apiUrl = getApiUrl("statuses/user_timeline.json");
        if (screen_name != null) {
            apiUrl = apiUrl + "?screen_name=" + screen_name;
        }
        if (screen_name != null && max_id != null) {
            apiUrl = apiUrl + "&max_id=" + max_id;
        }
        if (screen_name == null && max_id != null) {
            apiUrl = apiUrl + "?max_id=" + max_id;
        }
        client.get(apiUrl, null, handler);
    }

    public void postStatus(String status, AsyncHttpResponseHandler handler) {
        String apiUrl = getApiUrl("statuses/update.json");
        apiUrl = apiUrl + "?status=" + status;
        client.post(apiUrl, null, handler);
    }

    public void getMentionTimeline(String max_id, AsyncHttpResponseHandler handler) {
        String apiUrl = getApiUrl("statuses/mentions_timeline.json");
        if (max_id != null) {
            apiUrl = apiUrl + "?max_id=" + max_id;
        }
        client.get(apiUrl, null, handler);
    }

    public void getProfile(String screenName, AsyncHttpResponseHandler handler) {
        String apiUrl = getApiUrl("users/show.json");
        if (screenName != null) {
            apiUrl = apiUrl + "?screen_name=" + screenName;
        }
        client.get(apiUrl, null, handler);
    }

    public void getMyProfile(AsyncHttpResponseHandler handler) {
        String apiUrl = getApiUrl("account/verify_credentials.json");
        client.get(apiUrl, null, handler);
    }

    /*
     * 1. Define the endpoint URL with getApiUrl and pass a relative path to the endpoint
     * i.e getApiUrl("statuses/home_timeline.json");
     * 2. Define the parameters to pass to the request (query or body)
     * i.e RequestParams params = new RequestParams("foo", "bar");
     * 3. Define the request method and make a call to the client
     * i.e client.get(apiUrl, params, handler);
     * i.e client.post(apiUrl, params, handler);
     */
}
