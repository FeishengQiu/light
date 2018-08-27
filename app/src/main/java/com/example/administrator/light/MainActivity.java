package com.example.administrator.light;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String path="http://202.192.66.27/$2";
    private WebView webView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_1=(Button)findViewById(R.id.button) ;
        editText=(EditText)findViewById(R.id.edit_1);
        webView=(WebView)findViewById(R.id.wifi);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(path);
        button_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    path=editText.getText().toString();
    webView.loadUrl(path);
    }
}
