package com.example.alcapp;
//ALC 4 Phase 1 FIVE(5) DAYS CHALLENGE - BY OSWALD AUGUSTIN
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);      //Activating the BACK arrow on toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView passport = findViewById(R.id.my_picture);         //Reference to image viewer
        int imageResource = getResources().getIdentifier("@drawable/p", null, this.getPackageName());
        passport.setImageResource(imageResource);       //getting reference to image and setting it to image view
    }

    @Override
    public boolean onSupportNavigateUp(){       //enable backward navigation with back arrow
        onBackPressed();
        return true;
    }

}
