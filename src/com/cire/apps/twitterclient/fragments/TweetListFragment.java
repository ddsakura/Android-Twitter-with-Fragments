
package com.cire.apps.twitterclient.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cire.apps.twitterclient.R;
import com.cire.apps.twitterclient.adapters.TweetArrayAdapter;
import com.cire.apps.twitterclient.listeners.EndlessScrollListener;
import com.cire.apps.twitterclient.models.Tweet;

public abstract class TweetListFragment extends Fragment {

    private ArrayList<Tweet> tweets;
    private TweetArrayAdapter tweetAdapter;
    private ListView lvTweets;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tweets = new ArrayList<Tweet>();

        tweetAdapter = new TweetArrayAdapter(getActivity());
    }

    public abstract void loadmore();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tweets_list, container, false);
        lvTweets = (ListView)view.findViewById(R.id.lvTweets);
        lvTweets.setAdapter(tweetAdapter);
        lvTweets.setOnScrollListener(new EndlessScrollListener() {
            @Override
            public void onLoadMore(int page, int totalItemsCount) {
                Log.d("debug", "onLoadMore: " + "total: " + totalItemsCount + " page: " + page);
                loadmore();
            }
        });

        return view;
    }

    public TweetArrayAdapter getAdapter() {
        return tweetAdapter;
    }

    public void addAll(ArrayList<Tweet> tweets) {
        tweetAdapter.addAll(tweets);
        // tweetAdapter.notifyDataSetChanged();

    }

}
