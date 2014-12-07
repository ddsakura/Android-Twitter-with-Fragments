
package com.cire.apps.twitterclient.fragments;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.util.Log;

import com.cire.apps.twitterclient.TwitterClientApp;
import com.cire.apps.twitterclient.models.Tweet;
import com.cire.apps.twitterclient.models.TwitterClient;
import com.loopj.android.http.JsonHttpResponseHandler;

public class MentionTimelineFragment extends TweetListFragment {
    private TwitterClient client;
    private String maxId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        client = TwitterClientApp.getRestClient();
        populateTimeline();
    }

    public void populateTimeline() {
        client.getMentionTimeline(maxId, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int arg0, JSONArray json) {
                ObjectMapper mapper = new ObjectMapper();
                ArrayList<Tweet> tweets = new ArrayList<Tweet>();
                int s = (maxId == null) ? 0 : 1;
                for (int i = s; i < json.length(); i++) {
                    try {
                        JSONObject tweetJson = json.getJSONObject(i);
                        Tweet tweet = mapper.readValue(tweetJson.toString(), Tweet.class);
                        tweets.add(tweet);
                        maxId = String.valueOf(tweet.getId());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (JsonParseException e) {
                        e.printStackTrace();
                    } catch (JsonMappingException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                addAll(tweets);

                Log.d("debug", "maxId: " + maxId + " count: " + getAdapter().getCount());
            }

            @Override
            public void onFailure(Throwable arg0, JSONArray json) {
                super.onFailure(arg0, json);
            }
        });
    }

    @Override
    public void loadmore() {
        populateTimeline();
    }
}
