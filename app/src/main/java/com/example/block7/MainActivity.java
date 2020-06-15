package com.example.block7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = findViewById(R.id.numberPicker);
        webView = findViewById(R.id.webView);
        String[] possibilitiesString = {
                "Android",
                "Checklist text-input field",
                "Coursera",
                "BBC Ukraine",
                "Udacity"
        };
        possibilities.setDisplayedValues(possibilitiesString);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesString.length - 1);
    }

    public void navigate(View v) {
        int choice = possibilities.getValue();
        if (choice == 0)
            webView.loadUrl("https://developer.android.com/");
        else  if (choice == 1)
            webView.loadUrl("file:///android_asset/checkList.html");
        else if (choice == 2)
            webView.loadUrl("https://www.coursera.org/");
        else if (choice == 3)
            webView.loadUrl("https://www.bbc.com/ukrainian");
        else webView.loadUrl("https://www.udacity.com");
    }
}