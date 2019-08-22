package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class WebviewDemo extends AppCompatActivity {


    Button btn_load;
    EditText edt_url;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_demo);

        btn_load = findViewById(R.id.btn_load);
        edt_url = findViewById(R.id.edt_url);
        webView = findViewById(R.id.webView);

      btn_load.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              String url = edt_url.getText().toString();
              webView.getSettings().setLoadsImagesAutomatically(true);
              webView.getSettings().setJavaScriptEnabled(true);
              webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
              webView.loadUrl(url);
          }
      });
    }
}
