
package com.cire.apps.twitterclient.fragments;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import com.cire.apps.twitterclient.R;
import com.cire.apps.twitterclient.TwitterClientApp;
import com.cire.apps.twitterclient.models.TwitterClient;
import com.cire.apps.twitterclient.models.User;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.nostra13.universalimageloader.core.ImageLoader;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileFragement extends Fragment {

    private TwitterClient client;
    private TextView tvProfileName;
    private TextView tvProfileScreenname;
    private TextView tvTweetCount;
    private TextView tvFollowingCount;
    private TextView tvFollowerCount;
    private ImageView ivProfileImage;
    private ImageView ivProfileBackground;
    private String screenname;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        client = TwitterClientApp.getRestClient();
        screenname = getActivity().getIntent().getStringExtra("screenname");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        tvProfileName = (TextView)view.findViewById(R.id.tvProfileName);
        tvProfileScreenname = (TextView)view.findViewById(R.id.tvProfileScreenname);
        tvTweetCount = (TextView)view.findViewById(R.id.tvTweetCount);
        tvFollowingCount = (TextView)view.findViewById(R.id.tvFollowingCount);
        tvFollowerCount = (TextView)view.findViewById(R.id.tvFollowerCount);
        ivProfileImage = (ImageView)view.findViewById(R.id.ivProfiles);
        ivProfileBackground = (ImageView)view.findViewById(R.id.ivProfileBackground);

        if (screenname == null) {
            getProfileInfo();
        } else {
            getProfileInfo(screenname);
        }

        return view;
    }

    private void setProfileView(User user) {
        tvProfileName.setText(user.getName());
        tvProfileScreenname.setText("@" + user.getScreenName());
        tvTweetCount.setText(user.getStatusesCount() + " Tweets");
        tvFollowingCount.setText(user.getFriendsCount() + " Following");
        tvFollowerCount.setText(user.getFollowersCount() + " Followers");
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(user.getProfileImageUrl(), ivProfileImage);
        imageLoader.displayImage(user.getProfileBannerUrl() + "/mobile_retina", ivProfileBackground);

    }

    public void getProfileInfo() {
        client.getMyProfile(new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int arg0, JSONObject json) {
                Log.d("debug", json.toString());
                ObjectMapper mapper = new ObjectMapper();
                User user = null;
                try {
                    user = mapper.readValue(json.toString(), User.class);
                } catch (JsonParseException e) {
                    e.printStackTrace();
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                setProfileView(user);
            }

            @Override
            public void onFailure(Throwable arg0, JSONArray json) {
                super.onFailure(arg0, json);
            }
        });
    }

    public void getProfileInfo(String screenname) {
        client.getProfile(screenname, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int arg0, JSONObject json) {
                Log.d("debug", json.toString());
                ObjectMapper mapper = new ObjectMapper();
                User user = null;
                try {
                    user = mapper.readValue(json.toString(), User.class);
                } catch (JsonParseException e) {
                    e.printStackTrace();
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                setProfileView(user);
            }

            @Override
            public void onFailure(Throwable arg0, JSONArray json) {
                super.onFailure(arg0, json);
            }
        });
    }
}
