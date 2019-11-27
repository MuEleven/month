package com.bw.dukaibin20191127;

/*  作者 杜凯宾
    时间 19年11.27
    功能 流式布局+列表展示
* */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    //初始化变量
    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //添加网络权限
        mwebView = findViewById(R.id.webview);
        mwebView.loadUrl("file:///android_asset/web/info.html");
        mwebView.setWebViewClient(new WebViewClient());
        //设置js可以交互，可以弹框
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);

    }
}
