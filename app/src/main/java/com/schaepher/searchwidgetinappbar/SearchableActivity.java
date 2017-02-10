package com.schaepher.searchwidgetinappbar;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SearchableActivity extends AppCompatActivity {

    TextView mTvWord = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchable);

        mTvWord = (TextView) findViewById(R.id.tv_word);

        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            String text = getString(R.string.notice) + query;
            mTvWord.setText(text);
        }
    }
}
