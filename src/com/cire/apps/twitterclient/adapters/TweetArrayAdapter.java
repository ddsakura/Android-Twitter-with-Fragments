
package com.cire.apps.twitterclient.adapters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cire.apps.twitterclient.ProfileActivity;
import com.cire.apps.twitterclient.R;
import com.cire.apps.twitterclient.R.id;
import com.cire.apps.twitterclient.R.layout;
import com.cire.apps.twitterclient.models.Tweet;
import com.nostra13.universalimageloader.core.ImageLoader;

public class TweetArrayAdapter extends ArrayAdapter<Tweet> {

    public TweetArrayAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Tweet tweet = getItem(position);
        View v;
        if (convertView == null) {
            LayoutInflater inflator = LayoutInflater.from(getContext());
            v = inflator.inflate(R.layout.tweet_item, parent, false);
        } else {
            v = convertView;
        }

        ImageView ivProfileImage = (ImageView)v.findViewById(R.id.ivProfile);
        TextView tvUserName = (TextView)v.findViewById(R.id.tvUserName);
        TextView tvScreenName = (TextView)v.findViewById(R.id.tvScreenName);
        TextView tvText = (TextView)v.findViewById(R.id.tvText);
        TextView tvTime = (TextView)v.findViewById(R.id.tvTimestamp);
        ivProfileImage.setImageResource(android.R.color.transparent);
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(tweet.getUser().getProfileImageUrl(), ivProfileImage);
        ivProfileImage.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("screenname", tweet.getUser().getScreenName());
                intent.setClass(getContext(), ProfileActivity.class);
                getContext().startActivity(intent);
            }
        });

        tvUserName.setText(tweet.getUser().getName());
        tvScreenName.setText("@" + tweet.getUser().getScreenName());
        tvText.setText(tweet.getText());
        tvTime.setText(getRelativeDateTimeString(parseTwitterUTC(tweet.getCreatedAt())));

        return v;
    }

    public Date parseTwitterUTC(String dateString) {

        Date date = new Date();
        String twitterFormat = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
        SimpleDateFormat sf = new SimpleDateFormat(twitterFormat, Locale.ENGLISH);
        sf.setLenient(true);

        try {
            date = sf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public String getRelativeDateTimeString(Date date) {
        Date now = new Date();
        String str = (String)DateUtils.getRelativeTimeSpanString(date.getTime(), now.getTime(), DateUtils.SECOND_IN_MILLIS);
        return str;
    }
}
