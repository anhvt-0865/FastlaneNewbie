package com.example.testify;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text1);
        textView.setText(BuildConfig.BASE_URL);
        TextView textView2 = findViewById(R.id.text2);
        textView2.setText(BuildConfig.ADMOB_ID);
        TextView textView3 = findViewById(R.id.text3);
        textView3.setText(BuildConfig.PRODUCT_IDENTIFIER);
    }
}
