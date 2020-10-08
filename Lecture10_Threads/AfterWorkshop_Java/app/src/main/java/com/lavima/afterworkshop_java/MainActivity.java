package com.lavima.afterworkshop_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    ImageView posterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.titleText);
        posterImage = findViewById(R.id.posterImage);

        GetMovieAsync getMovieAsync = new GetMovieAsync(titleText, posterImage);
        getMovieAsync.execute("https://www.omdbapi.com/?i=tt3896198&apikey=2f6990a0");
    }
}