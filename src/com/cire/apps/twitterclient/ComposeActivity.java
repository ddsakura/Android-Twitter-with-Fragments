
package com.cire.apps.twitterclient;

import org.json.JSONObject;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.cire.apps.twitterclient.models.TwitterClient;
import com.loopj.android.http.JsonHttpResponseHandler;

public class ComposeActivity extends Activity {

    private EditText etCompose;
    private TextView tvCounter;
    private TwitterClient client;
    public static int COMPOSE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        client = TwitterClientApp.getRestClient();
        tvCounter = (TextView)findViewById(R.id.tvCounter);
        etCompose = (EditText)findViewById(R.id.etCompose);
        etCompose.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                tvCounter.setText(String.valueOf(140 - etCompose.length()));
            }

            @Override
            public void onTextChanged(CharSequence s, int st, int b, int c) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int st, int c, int a) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.compose, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_tweet) {
            String encodedString = "";
            encodedString = Uri.encode(etCompose.getText().toString(), "UTF-8");
            client.postStatus(encodedString, new JsonHttpResponseHandler() {
                @Override
                public void onSuccess(int arg0, JSONObject result) {
                    Log.d("debug", "onSuccess: " + result.toString());
                    setResult(RESULT_OK);
                    finish();
                }

                @Override
                public void onFailure(Throwable arg0, JSONObject arg1) {
                    Log.d("debug", "fail: " + arg1.toString());
                    setResult(RESULT_CANCELED);
                    finish();
                }
            });

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
