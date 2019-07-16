package com.example.alcapp;
//ALC 4 Phase 1 FIVE(5) DAYS CHALLENGE - BY OSWALD AUGUSTIN
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivityA extends AppCompatActivity {

    private String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button mAboutAlc = findViewById(R.id.button1);      //references to buttons
        Button myProfile = findViewById(R.id.button2);

        mAboutAlc.setOnClickListener(clicked);          //setting OnClickListener to both references
        myProfile.setOnClickListener(clicked);

    }

    View.OnClickListener clicked = new View.OnClickListener() {     //implementing only one instance
        @Override                                                   //of OnClickListener and Onclick
        public void onClick(View v) {                               //method for both buttons
            switch (v.getId()) {                                    //using the switch statement using
                case R.id.button2:                                  //id values as case instance
                    Intent intentC = new Intent(MainActivityA.this, ActivityC.class);
                    startActivity(intentC);
                    break;
                case R.id.button1:
                    Intent intentB = new Intent(MainActivityA.this, ActivityB.class);
                    link = "https://andela.com/alc/";               //Link to be sent in an intent
                    intentB.putExtra("link", link);
                    startActivity(intentB);
                    break;
                default:
                    break;

            }
        }


        //@Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        //@Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return MainActivityA.super.onOptionsItemSelected(item);
        }
    };

}
