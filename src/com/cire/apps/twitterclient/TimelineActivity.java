
package com.cire.apps.twitterclient;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.cire.apps.twitterclient.fragments.HomeTimelineFragment;
import com.cire.apps.twitterclient.fragments.MentionTimelineFragment;
import com.cire.apps.twitterclient.fragments.TweetListFragment;
import com.cire.apps.twitterclient.listeners.FragmentTabListener;

public class TimelineActivity extends FragmentActivity {

    private TweetListFragment fragmentTweetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        setupTabs();
    }

    private void setupTabs() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(true);

        Tab tab1 = actionBar.newTab().setText("Home").setIcon(R.drawable.ic_home).setTabListener(new FragmentTabListener<HomeTimelineFragment>(R.id.flContainer, this, "home", HomeTimelineFragment.class));

        actionBar.addTab(tab1);
        actionBar.selectTab(tab1);

        Tab tab2 = actionBar.newTab().setText("Mentions").setIcon(R.drawable.ic_mentions).setTabListener(new FragmentTabListener<MentionTimelineFragment>(R.id.flContainer, this, "mentions", MentionTimelineFragment.class));

        actionBar.addTab(tab2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("home");
        fragment.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.timeline, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent = new Intent();
        switch (id) {
        case R.id.action_compose:
            intent.setClass(this, ComposeActivity.class);
            startActivityForResult(intent, ComposeActivity.COMPOSE);
            return true;
        case R.id.action_profile:
            intent.setClass(this, ProfileActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
