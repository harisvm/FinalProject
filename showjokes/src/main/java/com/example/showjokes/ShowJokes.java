package com.example.showjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokes extends AppCompatActivity {
    TextView jokesTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_jokes);
        jokesTv = findViewById(R.id.jokes_tv);
        String joke = getIntent().getStringExtra("joke");
        jokesTv.setText(joke);


    }
}
