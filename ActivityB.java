package com.example.alcapp;
//ALC 4 Phase 1 FIVE(5) DAYS CHALLENGE - BY OSWALD AUGUSTIN
import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

 public class ActivityB extends AppCompatActivity {

   private WebView browse;
     private String alcLink;

     @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_b);
       Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

       getSupportActionBar().setDisplayHomeAsUpEnabled(true);      //Activating BACK arrow on toolbar
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       browse = findViewById(R.id.web_page);                       //Getting reference to WebView widget
       browse.setWebViewClient(new WebViewClient(){
           @Override                                                //Overrinding Parent method to proceed without certification clearance from link
           public void onReceivedSslError(WebView v, SslErrorHandler skipError, SslError error){
               skipError.proceed();
           }
       });
       browse.getSettings().setJavaScriptEnabled(true);              //Enable java script
       Intent intentB = getIntent();                                //getting URL link passed through intent
         alcLink = intentB.getStringExtra("link");
       browse.loadUrl(alcLink);                                     //Loading URL in WebView

   }

     @Override                                                      //enable backward navigation
     public boolean onSupportNavigateUp(){
         onBackPressed();
         return true;
     }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       // Inflate the menu; this adds items to the action bar if it is present.
       getMenuInflater().inflate(R.menu.menu_main, menu);
       return true;
   }

}
