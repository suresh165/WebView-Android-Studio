package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.wv);
        wv.loadUrl("http://troubleshootingtechnology.com");
        WebSettings ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
    }
}
