package com.example.applications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean profile1IsShowing = true;

    public void Fade(View view)
    {
        Log.i("Info", "ImageView Clicked");

        ImageView profile1 = (ImageView) findViewById(R.id.ProfileOne);
        ImageView profile2 = (ImageView) findViewById(R.id.ProfileTwo);

        if(profile1IsShowing)
        {
            profile1IsShowing = false;
            profile1.animate().alpha(0).setDuration(2000);
            profile2.animate().alpha(1).setDuration(2000);
        }
        else
        {
            profile1IsShowing = true;
            profile1.animate().alpha(1).setDuration(2000);
            profile2.animate().alpha(0).setDuration(2000);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
