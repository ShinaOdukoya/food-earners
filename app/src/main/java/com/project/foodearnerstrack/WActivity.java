package com.project.foodearnerstrack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WActivity extends AppCompatActivity {

    WebView webView;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


//        Bundle extras = getIntent().getExtras();
//        if (extras != null){
//            value = extras.getString("l");
//        }
        value = getIntent().getStringExtra("l");

            webView = findViewById(R.id.webViev);
            webView.setWebViewClient(new WebViewClient()); //chk
            webView.loadUrl(value);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
    }

    private class MyWebClient extends WebViewClient{

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        if(webView.isFocused() && webView.canGoBack()){
            webView.goBack();
        }
        super.onBackPressed();
    }
}